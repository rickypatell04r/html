EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("employeePU");
EntityManager em = emf.createEntityManager();

double minSalary = 30000;
double maxSalary = 60000;

/* JPQL QUERY WITH BETWEEN */
TypedQuery<Employee> query =
        em.createQuery(
                "SELECT e FROM Employee e WHERE e.salary BETWEEN :min AND :max",
                Employee.class);

query.setParameter("min", minSalary);
query.setParameter("max", maxSalary);

List<Employee> result = query.getResultList();

System.out.println("Employees with salary between " +
        minSalary + " and " + maxSalary);

for (Employee e : result) {
    System.out.println(
            e.getId() + " | " +
            e.getName() + " | " +
            e.getDepartment() + " | " +
            e.getSalary()
    );
}

em.close();
emf.close();

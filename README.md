# test


driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("https://osm.gov.ru/portal/description/ocm?1");

        driver.findElement(By.xpath("//a[@id='id8']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Получить услугу')]")).click();
        driver.findElement(By.xpath("//input[@id='id20']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='id21']")).sendKeys("1234");

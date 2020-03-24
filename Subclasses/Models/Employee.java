
package Models;


public class Employee 
{
    public class ParttimeE
    {
        public float hours;
        public float hourly_r;
        public float Salary;
        
        public ParttimeE(float hours,float s)
        {
            this.hours=hours;
            this.Salary=s;
        }
        public double calculatehourlyrate(float Salary,float hours)
        {
            hourly_r=Salary*hours;
            return hourly_r;
        }
    }
    
}

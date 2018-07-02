echo Execute at ten points per day
cd ..
schtasks /create /tn "exectue test" /tr "mvn clean test " /sc daily /st 10:30:00 /ed 2018/06/25
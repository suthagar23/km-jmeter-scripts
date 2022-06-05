# KloudMate - JMeter Scripts

---

## Plan : KloudMate_GroovyScript_Testplan

- Script lookup location : `/home/ubuntu/km-jmeter-scripts/active-script.java`

1. Update the connection string the script
2. Run the JMeter with these required paramters
    - Thread Count `-Jthreads=2`
    - Rampup period `-Jrumpup=10`


```
cd apache-jmeter-5.4.3/bin

sh ./jmeter.sh -n -t /home/ubuntu/km-jmeter-scripts/KloudMate_GroovyScript_Testplan.jmx -l km-logs.txt -Jthreads=2 -Jrumpup=10

```
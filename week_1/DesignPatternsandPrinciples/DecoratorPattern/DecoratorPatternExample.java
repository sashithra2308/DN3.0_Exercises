public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Create email notifier
        Notifier emailNotifier = new EmailNotifier();

        // Create SMS decorator
        Notifier smsDecorator = new SMSNotifierDecorator(emailNotifier);

        // Create Slack decorator
        Notifier slackDecorator = new SlackNotifierDecorator(smsDecorator);

        // Send notification using decorators
        slackDecorator.send("Hello, this is a notification!");
    }
}
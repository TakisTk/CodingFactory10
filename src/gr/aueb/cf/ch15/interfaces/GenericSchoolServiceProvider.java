package gr.aueb.cf.ch15.interfaces;

public class GenericSchoolServiceProvider {
    private final ISchoolService schoolService;

    public GenericSchoolServiceProvider(ISchoolService schoolService) {
        this.schoolService = schoolService;
    }

    public void register() {
        schoolService.register();
    }

    public void unregister() {
        schoolService.unregister();
    }
}


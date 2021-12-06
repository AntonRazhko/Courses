package Home_Task_10_Generics.Task1;

class FilterSrtrings implements Filter<String> {
    @Override
    public boolean apply(String o) {
        if (o != null) {
            return true;
        }
        return false;
    }
}


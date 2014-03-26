package Kata2;

public class HistogramBuilder<Type> {
    private final Type[] values;
    
    public HistogramBuilder(Type[] values) {
        this.values = values;
    }
    
    public Histogram<Type> build() {
        return build(new AttributeExtractor<Type, Type>() {

            @Override
            public Type extract(Type value) {
                return value;
            }
        });
    }
    
    public <T> Histogram<T> build(AttributeExtractor<Type, T> extractor) {
        Histogram<T> histogram = new Histogram<>();
        for (Type value : values)
            histogram.incrementCountFor(extractor.extract(value));
        return histogram;
    }
    
    public interface AttributeExtractor<Source, Type> {
        public Type extract(Source value);
    }
}
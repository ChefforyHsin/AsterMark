package team.aster.processor;

public class DecoderFactory {

    /**
     * @Description 通过工厂来返回不同类型的水印编码器
     * @author Fcat
     * @date 2019/4/20
     * @param watermarkType 水印类型的枚举
     * @return team.aster.processor.WatermarkProcessor
     */
    public IDecoder getDecoder(WatermarkProcessorType watermarkType){
        switch (watermarkType){
            case OPTIMIZATION:
                return new OptimDecoder();
            case PRIMITIVE_LSB:
                return new PrimLSBDecoder();
            case SPACE:
                return new SpaceDecoder();
            case PUNCTUATION:
                return new PunctuationDecoder();
            case PART_OF_SPEECH:
                return new POSDecoder();
            default:
                return null;
        }
    }
}

import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.Test;
import protobuf.Return;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-03-05 21:53
 */

public class ProtoTest {

    @Test
    public void test1() throws InvalidProtocolBufferException {
        Return.ReturnVO.Builder builder = Return.ReturnVO.newBuilder().setCode("code").setMessage("信息").setData("data");
        Return.ReturnVO returnVO = builder.build();
        String data = returnVO.toString();
        byte[] bytes = returnVO.toByteArray();
        System.out.println(data);
        System.out.println("===== 构建returnVO模型结束 =====");
        Return.ReturnVO returnVO1 = Return.ReturnVO.parseFrom(bytes);
        System.out.println(returnVO1.getMessage());

    }

}

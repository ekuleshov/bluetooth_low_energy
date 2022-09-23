// Autogenerated from Pigeon (v4.0.2), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package dev.yanshouwang.bluetooth_low_energy.pigeon;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class Api {

  public interface Result<T> {
    void success(T result);
    void error(Throwable error);
  }
  private static class CentralManagerHostApiCodec extends StandardMessageCodec {
    public static final CentralManagerHostApiCodec INSTANCE = new CentralManagerHostApiCodec();
    private CentralManagerHostApiCodec() {}
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface CentralManagerHostApi {
    void authorize(Result<Boolean> result);
    @NonNull Long getState();
    void addStateObserver();
    void removeStateObserver();
    void startScan(@Nullable List<byte[]> uuidBuffers, Result<Void> result);
    void stopScan();
    void connect(@NonNull byte[] uuidBuffer, Result<byte[]> result);

    /** The codec used by CentralManagerHostApi. */
    static MessageCodec<Object> getCodec() {
      return CentralManagerHostApiCodec.INSTANCE;
    }

    /** Sets up an instance of `CentralManagerHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, CentralManagerHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.CentralManagerHostApi.authorize", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Result<Boolean> resultCallback = new Result<Boolean>() {
                public void success(Boolean result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.authorize(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.CentralManagerHostApi.getState", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Long output = api.getState();
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.CentralManagerHostApi.addStateObserver", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.addStateObserver();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.CentralManagerHostApi.removeStateObserver", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.removeStateObserver();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.CentralManagerHostApi.startScan", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              List<byte[]> uuidBuffersArg = (List<byte[]>)args.get(0);
              Result<Void> resultCallback = new Result<Void>() {
                public void success(Void result) {
                  wrapped.put("result", null);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.startScan(uuidBuffersArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.CentralManagerHostApi.stopScan", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.stopScan();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.CentralManagerHostApi.connect", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              byte[] uuidBufferArg = (byte[])args.get(0);
              if (uuidBufferArg == null) {
                throw new NullPointerException("uuidBufferArg unexpectedly null.");
              }
              Result<byte[]> resultCallback = new Result<byte[]>() {
                public void success(byte[] result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.connect(uuidBufferArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static class CentralManagerFlutterApiCodec extends StandardMessageCodec {
    public static final CentralManagerFlutterApiCodec INSTANCE = new CentralManagerFlutterApiCodec();
    private CentralManagerFlutterApiCodec() {}
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java.*/
  public static class CentralManagerFlutterApi {
    private final BinaryMessenger binaryMessenger;
    public CentralManagerFlutterApi(BinaryMessenger argBinaryMessenger){
      this.binaryMessenger = argBinaryMessenger;
    }
    public interface Reply<T> {
      void reply(T reply);
    }
    static MessageCodec<Object> getCodec() {
      return CentralManagerFlutterApiCodec.INSTANCE;
    }

    public void notifyState(@NonNull Long stateNumberArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.CentralManagerFlutterApi.notifyState", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(stateNumberArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void notifyAdvertisement(@NonNull byte[] advertisementBufferArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.CentralManagerFlutterApi.notifyAdvertisement", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(advertisementBufferArg)), channelReply -> {
        callback.reply(null);
      });
    }
  }
  private static class PeripheralHostApiCodec extends StandardMessageCodec {
    public static final PeripheralHostApiCodec INSTANCE = new PeripheralHostApiCodec();
    private PeripheralHostApiCodec() {}
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface PeripheralHostApi {
    void allocate(@NonNull Long id, @NonNull Long instanceId);
    void free(@NonNull Long id);
    void disconnect(@NonNull Long id, Result<Void> result);
    void discoverServices(@NonNull Long id, Result<List<byte[]>> result);

    /** The codec used by PeripheralHostApi. */
    static MessageCodec<Object> getCodec() {
      return PeripheralHostApiCodec.INSTANCE;
    }

    /** Sets up an instance of `PeripheralHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, PeripheralHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PeripheralHostApi.allocate", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              Number instanceIdArg = (Number)args.get(1);
              if (instanceIdArg == null) {
                throw new NullPointerException("instanceIdArg unexpectedly null.");
              }
              api.allocate((idArg == null) ? null : idArg.longValue(), (instanceIdArg == null) ? null : instanceIdArg.longValue());
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PeripheralHostApi.free", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              api.free((idArg == null) ? null : idArg.longValue());
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PeripheralHostApi.disconnect", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              Result<Void> resultCallback = new Result<Void>() {
                public void success(Void result) {
                  wrapped.put("result", null);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.disconnect((idArg == null) ? null : idArg.longValue(), resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PeripheralHostApi.discoverServices", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              Result<List<byte[]>> resultCallback = new Result<List<byte[]>>() {
                public void success(List<byte[]> result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.discoverServices((idArg == null) ? null : idArg.longValue(), resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static class PeripheralFlutterApiCodec extends StandardMessageCodec {
    public static final PeripheralFlutterApiCodec INSTANCE = new PeripheralFlutterApiCodec();
    private PeripheralFlutterApiCodec() {}
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java.*/
  public static class PeripheralFlutterApi {
    private final BinaryMessenger binaryMessenger;
    public PeripheralFlutterApi(BinaryMessenger argBinaryMessenger){
      this.binaryMessenger = argBinaryMessenger;
    }
    public interface Reply<T> {
      void reply(T reply);
    }
    static MessageCodec<Object> getCodec() {
      return PeripheralFlutterApiCodec.INSTANCE;
    }

    public void notifyConnectionLost(@NonNull Long idArg, @NonNull byte[] errorBufferArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PeripheralFlutterApi.notifyConnectionLost", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(idArg, errorBufferArg)), channelReply -> {
        callback.reply(null);
      });
    }
  }
  private static class GattServiceHostApiCodec extends StandardMessageCodec {
    public static final GattServiceHostApiCodec INSTANCE = new GattServiceHostApiCodec();
    private GattServiceHostApiCodec() {}
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface GattServiceHostApi {
    void allocate(@NonNull Long id, @NonNull Long instanceId);
    void free(@NonNull Long id);
    void discoverCharacteristics(@NonNull Long id, Result<List<byte[]>> result);

    /** The codec used by GattServiceHostApi. */
    static MessageCodec<Object> getCodec() {
      return GattServiceHostApiCodec.INSTANCE;
    }

    /** Sets up an instance of `GattServiceHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, GattServiceHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattServiceHostApi.allocate", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              Number instanceIdArg = (Number)args.get(1);
              if (instanceIdArg == null) {
                throw new NullPointerException("instanceIdArg unexpectedly null.");
              }
              api.allocate((idArg == null) ? null : idArg.longValue(), (instanceIdArg == null) ? null : instanceIdArg.longValue());
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattServiceHostApi.free", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              api.free((idArg == null) ? null : idArg.longValue());
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattServiceHostApi.discoverCharacteristics", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              Result<List<byte[]>> resultCallback = new Result<List<byte[]>>() {
                public void success(List<byte[]> result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.discoverCharacteristics((idArg == null) ? null : idArg.longValue(), resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static class GattCharacteristicHostApiCodec extends StandardMessageCodec {
    public static final GattCharacteristicHostApiCodec INSTANCE = new GattCharacteristicHostApiCodec();
    private GattCharacteristicHostApiCodec() {}
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface GattCharacteristicHostApi {
    void allocate(@NonNull Long id, @NonNull Long instanceId);
    void free(@NonNull Long id);
    void discoverDescriptors(@NonNull Long id, Result<List<byte[]>> result);
    void read(@NonNull Long id, Result<byte[]> result);
    void write(@NonNull Long id, @NonNull byte[] value, @NonNull Boolean withoutResponse, Result<Void> result);
    void setNotify(@NonNull Long id, @NonNull Boolean value, Result<Void> result);

    /** The codec used by GattCharacteristicHostApi. */
    static MessageCodec<Object> getCodec() {
      return GattCharacteristicHostApiCodec.INSTANCE;
    }

    /** Sets up an instance of `GattCharacteristicHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, GattCharacteristicHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattCharacteristicHostApi.allocate", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              Number instanceIdArg = (Number)args.get(1);
              if (instanceIdArg == null) {
                throw new NullPointerException("instanceIdArg unexpectedly null.");
              }
              api.allocate((idArg == null) ? null : idArg.longValue(), (instanceIdArg == null) ? null : instanceIdArg.longValue());
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattCharacteristicHostApi.free", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              api.free((idArg == null) ? null : idArg.longValue());
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattCharacteristicHostApi.discoverDescriptors", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              Result<List<byte[]>> resultCallback = new Result<List<byte[]>>() {
                public void success(List<byte[]> result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.discoverDescriptors((idArg == null) ? null : idArg.longValue(), resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattCharacteristicHostApi.read", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              Result<byte[]> resultCallback = new Result<byte[]>() {
                public void success(byte[] result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.read((idArg == null) ? null : idArg.longValue(), resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattCharacteristicHostApi.write", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              byte[] valueArg = (byte[])args.get(1);
              if (valueArg == null) {
                throw new NullPointerException("valueArg unexpectedly null.");
              }
              Boolean withoutResponseArg = (Boolean)args.get(2);
              if (withoutResponseArg == null) {
                throw new NullPointerException("withoutResponseArg unexpectedly null.");
              }
              Result<Void> resultCallback = new Result<Void>() {
                public void success(Void result) {
                  wrapped.put("result", null);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.write((idArg == null) ? null : idArg.longValue(), valueArg, withoutResponseArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattCharacteristicHostApi.setNotify", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              Boolean valueArg = (Boolean)args.get(1);
              if (valueArg == null) {
                throw new NullPointerException("valueArg unexpectedly null.");
              }
              Result<Void> resultCallback = new Result<Void>() {
                public void success(Void result) {
                  wrapped.put("result", null);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.setNotify((idArg == null) ? null : idArg.longValue(), valueArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static class GattCharacteristicFlutterApiCodec extends StandardMessageCodec {
    public static final GattCharacteristicFlutterApiCodec INSTANCE = new GattCharacteristicFlutterApiCodec();
    private GattCharacteristicFlutterApiCodec() {}
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java.*/
  public static class GattCharacteristicFlutterApi {
    private final BinaryMessenger binaryMessenger;
    public GattCharacteristicFlutterApi(BinaryMessenger argBinaryMessenger){
      this.binaryMessenger = argBinaryMessenger;
    }
    public interface Reply<T> {
      void reply(T reply);
    }
    static MessageCodec<Object> getCodec() {
      return GattCharacteristicFlutterApiCodec.INSTANCE;
    }

    public void notifyValue(@NonNull Long idArg, @NonNull byte[] valueArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattCharacteristicFlutterApi.notifyValue", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(idArg, valueArg)), channelReply -> {
        callback.reply(null);
      });
    }
  }
  private static class GattDescriptorHostApiCodec extends StandardMessageCodec {
    public static final GattDescriptorHostApiCodec INSTANCE = new GattDescriptorHostApiCodec();
    private GattDescriptorHostApiCodec() {}
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface GattDescriptorHostApi {
    void allocate(@NonNull Long id, @NonNull Long instanceId);
    void free(@NonNull Long id);
    void read(@NonNull Long id, Result<byte[]> result);
    void write(@NonNull Long id, @NonNull byte[] value, Result<Void> result);

    /** The codec used by GattDescriptorHostApi. */
    static MessageCodec<Object> getCodec() {
      return GattDescriptorHostApiCodec.INSTANCE;
    }

    /** Sets up an instance of `GattDescriptorHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, GattDescriptorHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattDescriptorHostApi.allocate", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              Number instanceIdArg = (Number)args.get(1);
              if (instanceIdArg == null) {
                throw new NullPointerException("instanceIdArg unexpectedly null.");
              }
              api.allocate((idArg == null) ? null : idArg.longValue(), (instanceIdArg == null) ? null : instanceIdArg.longValue());
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattDescriptorHostApi.free", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              api.free((idArg == null) ? null : idArg.longValue());
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattDescriptorHostApi.read", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              Result<byte[]> resultCallback = new Result<byte[]>() {
                public void success(byte[] result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.read((idArg == null) ? null : idArg.longValue(), resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.GattDescriptorHostApi.write", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number idArg = (Number)args.get(0);
              if (idArg == null) {
                throw new NullPointerException("idArg unexpectedly null.");
              }
              byte[] valueArg = (byte[])args.get(1);
              if (valueArg == null) {
                throw new NullPointerException("valueArg unexpectedly null.");
              }
              Result<Void> resultCallback = new Result<Void>() {
                public void success(Void result) {
                  wrapped.put("result", null);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.write((idArg == null) ? null : idArg.longValue(), valueArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}

package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link DeviceMetric_Calibration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceMetric_Calibration.builder()}.
 */
@Generated(from = "DeviceMetric_Calibration", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceMetric_Calibration implements DeviceMetric_Calibration {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Devicemetric_CalibrationState state;
  private final @Nullable String id;
  private final @Nullable Devicemetric_CalibrationType type;
  private final @Nullable Instant time;
  private final @Nullable List<Extension> extension;

  private ImmutableDeviceMetric_Calibration(
      @Nullable List<Extension> modifierExtension,
      @Nullable Devicemetric_CalibrationState state,
      @Nullable String id,
      @Nullable Devicemetric_CalibrationType type,
      @Nullable Instant time,
      @Nullable List<Extension> extension) {
    this.modifierExtension = modifierExtension;
    this.state = state;
    this.id = id;
    this.type = type;
    this.time = time;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code state} attribute
   */
  @JsonProperty("state")
  @Override
  public Optional<Devicemetric_CalibrationState> state() {
    return Optional.ofNullable(state);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Devicemetric_CalibrationType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code time} attribute
   */
  @JsonProperty("time")
  @Override
  public Optional<Instant> time() {
    return Optional.ofNullable(time);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric_Calibration#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceMetric_Calibration(newValue, this.state, this.id, this.type, this.time, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric_Calibration#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric_Calibration withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceMetric_Calibration(value, this.state, this.id, this.type, this.time, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric_Calibration#state() state} attribute.
   * @param value The value for state
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withState(Devicemetric_CalibrationState value) {
    @Nullable Devicemetric_CalibrationState newValue = Objects.requireNonNull(value, "state");
    if (this.state == newValue) return this;
    return new ImmutableDeviceMetric_Calibration(this.modifierExtension, newValue, this.id, this.type, this.time, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric_Calibration#state() state} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for state
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric_Calibration withState(Optional<? extends Devicemetric_CalibrationState> optional) {
    @Nullable Devicemetric_CalibrationState value = optional.orElse(null);
    if (this.state == value) return this;
    return new ImmutableDeviceMetric_Calibration(this.modifierExtension, value, this.id, this.type, this.time, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric_Calibration#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDeviceMetric_Calibration(this.modifierExtension, this.state, newValue, this.type, this.time, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric_Calibration#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDeviceMetric_Calibration(this.modifierExtension, this.state, value, this.type, this.time, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric_Calibration#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withType(Devicemetric_CalibrationType value) {
    @Nullable Devicemetric_CalibrationType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDeviceMetric_Calibration(this.modifierExtension, this.state, this.id, newValue, this.time, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric_Calibration#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric_Calibration withType(Optional<? extends Devicemetric_CalibrationType> optional) {
    @Nullable Devicemetric_CalibrationType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDeviceMetric_Calibration(this.modifierExtension, this.state, this.id, value, this.time, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric_Calibration#time() time} attribute.
   * @param value The value for time
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withTime(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "time");
    if (this.time == newValue) return this;
    return new ImmutableDeviceMetric_Calibration(this.modifierExtension, this.state, this.id, this.type, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric_Calibration#time() time} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for time
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric_Calibration withTime(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.time == value) return this;
    return new ImmutableDeviceMetric_Calibration(this.modifierExtension, this.state, this.id, this.type, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric_Calibration#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceMetric_Calibration(this.modifierExtension, this.state, this.id, this.type, this.time, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric_Calibration#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric_Calibration withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceMetric_Calibration(this.modifierExtension, this.state, this.id, this.type, this.time, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceMetric_Calibration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceMetric_Calibration
        && equalTo((ImmutableDeviceMetric_Calibration) another);
  }

  private boolean equalTo(ImmutableDeviceMetric_Calibration another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(state, another.state)
        && Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(time, another.time)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code state}, {@code id}, {@code type}, {@code time}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(state);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(time);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceMetric_Calibration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DeviceMetric_Calibration{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (state != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("state=").append(state);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (time != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("time=").append(time);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DeviceMetric_Calibration", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DeviceMetric_Calibration {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Devicemetric_CalibrationState> state = Optional.empty();
    boolean stateIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Devicemetric_CalibrationType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Instant> time = Optional.empty();
    boolean timeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("state")
    public void setState(Optional<Devicemetric_CalibrationState> state) {
      this.state = state;
      this.stateIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Devicemetric_CalibrationType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("time")
    public void setTime(Optional<Instant> time) {
      this.time = time;
      this.timeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Devicemetric_CalibrationState> state() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Devicemetric_CalibrationType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> time() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceMetric_Calibration fromJson(Json json) {
    ImmutableDeviceMetric_Calibration.Builder builder = ImmutableDeviceMetric_Calibration.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.stateIsSet) {
      builder.state(json.state);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.timeIsSet) {
      builder.time(json.time);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableDeviceMetric_Calibration) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DeviceMetric_Calibration} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DeviceMetric_Calibration instance
   */
  public static DeviceMetric_Calibration copyOf(DeviceMetric_Calibration instance) {
    if (instance instanceof ImmutableDeviceMetric_Calibration) {
      return (ImmutableDeviceMetric_Calibration) instance;
    }
    return ImmutableDeviceMetric_Calibration.builder()
        .modifierExtension(instance.modifierExtension())
        .state(instance.state())
        .id(instance.id())
        .type(instance.type())
        .time(instance.time())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceMetric_Calibration DeviceMetric_Calibration}.
   * <pre>
   * ImmutableDeviceMetric_Calibration.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DeviceMetric_Calibration#modifierExtension() modifierExtension}
   *    .state(Devicemetric_CalibrationState) // optional {@link DeviceMetric_Calibration#state() state}
   *    .id(String) // optional {@link DeviceMetric_Calibration#id() id}
   *    .type(Devicemetric_CalibrationType) // optional {@link DeviceMetric_Calibration#type() type}
   *    .time(com.fhir.types.fhir.Instant) // optional {@link DeviceMetric_Calibration#time() time}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DeviceMetric_Calibration#extension() extension}
   *    .build();
   * </pre>
   * @return A new DeviceMetric_Calibration builder
   */
  public static ImmutableDeviceMetric_Calibration.Builder builder() {
    return new ImmutableDeviceMetric_Calibration.Builder();
  }

  /**
   * Builds instances of type {@link DeviceMetric_Calibration DeviceMetric_Calibration}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DeviceMetric_Calibration", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_STATE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_TIME = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Devicemetric_CalibrationState state;
    private @Nullable String id;
    private @Nullable Devicemetric_CalibrationType type;
    private @Nullable Instant time;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#state() state} to state.
     * @param state The value for state
     * @return {@code this} builder for chained invocation
     */
    public final Builder state(Devicemetric_CalibrationState state) {
      checkNotIsSet(stateIsSet(), "state");
      this.state = Objects.requireNonNull(state, "state");
      optBits |= OPT_BIT_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#state() state} to state.
     * @param state The value for state
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("state")
    public final Builder state(Optional<? extends Devicemetric_CalibrationState> state) {
      checkNotIsSet(stateIsSet(), "state");
      this.state = state.orElse(null);
      optBits |= OPT_BIT_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Devicemetric_CalibrationType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Devicemetric_CalibrationType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#time() time} to time.
     * @param time The value for time
     * @return {@code this} builder for chained invocation
     */
    public final Builder time(Instant time) {
      checkNotIsSet(timeIsSet(), "time");
      this.time = Objects.requireNonNull(time, "time");
      optBits |= OPT_BIT_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#time() time} to time.
     * @param time The value for time
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("time")
    public final Builder time(Optional<? extends Instant> time) {
      checkNotIsSet(timeIsSet(), "time");
      this.time = time.orElse(null);
      optBits |= OPT_BIT_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Builds a new {@link DeviceMetric_Calibration DeviceMetric_Calibration}.
     * @return An immutable instance of DeviceMetric_Calibration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DeviceMetric_Calibration build() {
      return new ImmutableDeviceMetric_Calibration(modifierExtension, state, id, type, time, extension);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean stateIsSet() {
      return (optBits & OPT_BIT_STATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean timeIsSet() {
      return (optBits & OPT_BIT_TIME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DeviceMetric_Calibration is strict, attribute is already set: ".concat(name));
    }
  }
}

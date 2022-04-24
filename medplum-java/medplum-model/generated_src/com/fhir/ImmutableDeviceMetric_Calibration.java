//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link DeviceMetric_Calibration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceMetric_Calibration.builder()}.
 */
@org.immutables.value.Generated(from = "DeviceMetric_Calibration", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceMetric_Calibration implements com.fhir.DeviceMetric_Calibration {
  private final @javax.annotation.Nullable com.fhir.Devicemetric_calibrationState state;
  private final @javax.annotation.Nullable com.fhir.instant time;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Devicemetric_calibrationType type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableDeviceMetric_Calibration(
      @javax.annotation.Nullable com.fhir.Devicemetric_calibrationState state,
      @javax.annotation.Nullable com.fhir.instant time,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Devicemetric_calibrationType type,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.state = state;
    this.time = time;
    this.id = id;
    this.extension = extension;
    this.type = type;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code state} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("state")
  @Override
  public java.util.Optional<com.fhir.Devicemetric_calibrationState> state() {
    return java.util.Optional.ofNullable(state);
  }

  /**
   * @return The value of the {@code time} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("time")
  @Override
  public java.util.Optional<com.fhir.instant> time() {
    return java.util.Optional.ofNullable(time);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.Devicemetric_calibrationType> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric_Calibration#state() state} attribute.
   * @param value The value for state
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withState(com.fhir.Devicemetric_calibrationState value) {
    @javax.annotation.Nullable com.fhir.Devicemetric_calibrationState newValue = java.util.Objects.requireNonNull(value, "state");
    if (this.state == newValue) return this;
    return new ImmutableDeviceMetric_Calibration(newValue, this.time, this.id, this.extension, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric_Calibration#state() state} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for state
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric_Calibration withState(java.util.Optional<? extends com.fhir.Devicemetric_calibrationState> optional) {
    @javax.annotation.Nullable com.fhir.Devicemetric_calibrationState value = optional.orElse(null);
    if (this.state == value) return this;
    return new ImmutableDeviceMetric_Calibration(value, this.time, this.id, this.extension, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric_Calibration#time() time} attribute.
   * @param value The value for time
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withTime(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "time");
    if (this.time == newValue) return this;
    return new ImmutableDeviceMetric_Calibration(this.state, newValue, this.id, this.extension, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric_Calibration#time() time} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for time
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric_Calibration withTime(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.time == value) return this;
    return new ImmutableDeviceMetric_Calibration(this.state, value, this.id, this.extension, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric_Calibration#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableDeviceMetric_Calibration(this.state, this.time, newValue, this.extension, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric_Calibration#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableDeviceMetric_Calibration(this.state, this.time, value, this.extension, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric_Calibration#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceMetric_Calibration(this.state, this.time, this.id, newValue, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric_Calibration#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric_Calibration withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceMetric_Calibration(this.state, this.time, this.id, value, this.type, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric_Calibration#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withType(com.fhir.Devicemetric_calibrationType value) {
    @javax.annotation.Nullable com.fhir.Devicemetric_calibrationType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDeviceMetric_Calibration(this.state, this.time, this.id, this.extension, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric_Calibration#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric_Calibration withType(java.util.Optional<? extends com.fhir.Devicemetric_calibrationType> optional) {
    @javax.annotation.Nullable com.fhir.Devicemetric_calibrationType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDeviceMetric_Calibration(this.state, this.time, this.id, this.extension, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric_Calibration#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric_Calibration withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceMetric_Calibration(this.state, this.time, this.id, this.extension, this.type, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric_Calibration#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric_Calibration withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceMetric_Calibration(this.state, this.time, this.id, this.extension, this.type, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceMetric_Calibration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceMetric_Calibration
        && equalTo((ImmutableDeviceMetric_Calibration) another);
  }

  private boolean equalTo(ImmutableDeviceMetric_Calibration another) {
    return java.util.Objects.equals(state, another.state)
        && java.util.Objects.equals(time, another.time)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code state}, {@code time}, {@code id}, {@code extension}, {@code type}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(state);
    h += (h << 5) + java.util.Objects.hashCode(time);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceMetric_Calibration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("DeviceMetric_Calibration{");
    if (state != null) {
      builder.append("state=").append(state);
    }
    if (time != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("time=").append(time);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (modifierExtension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "DeviceMetric_Calibration", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.DeviceMetric_Calibration {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Devicemetric_calibrationState> state = java.util.Optional.empty();
    boolean stateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> time = java.util.Optional.empty();
    boolean timeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Devicemetric_calibrationType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    public void setState(java.util.Optional<com.fhir.Devicemetric_calibrationState> state) {
      this.state = state;
      this.stateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    public void setTime(java.util.Optional<com.fhir.instant> time) {
      this.time = time;
      this.timeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.Devicemetric_calibrationType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Devicemetric_calibrationState> state() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> time() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Devicemetric_calibrationType> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceMetric_Calibration fromJson(Json json) {
    ImmutableDeviceMetric_Calibration.Builder builder = ImmutableDeviceMetric_Calibration.builder();
    if (json.stateIsSet) {
      builder.state(json.state);
    }
    if (json.timeIsSet) {
      builder.time(json.time);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
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
        .state(instance.state())
        .time(instance.time())
        .id(instance.id())
        .extension(instance.extension())
        .type(instance.type())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceMetric_Calibration DeviceMetric_Calibration}.
   * <pre>
   * ImmutableDeviceMetric_Calibration.builder()
   *    .state(com.fhir.Devicemetric_calibrationState) // optional {@link DeviceMetric_Calibration#state() state}
   *    .time(com.fhir.instant) // optional {@link DeviceMetric_Calibration#time() time}
   *    .id(String) // optional {@link DeviceMetric_Calibration#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceMetric_Calibration#extension() extension}
   *    .type(com.fhir.Devicemetric_calibrationType) // optional {@link DeviceMetric_Calibration#type() type}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceMetric_Calibration#modifierExtension() modifierExtension}
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
  @org.immutables.value.Generated(from = "DeviceMetric_Calibration", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_STATE = 0x1L;
    private static final long OPT_BIT_TIME = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Devicemetric_calibrationState state;
    private @javax.annotation.Nullable com.fhir.instant time;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Devicemetric_calibrationType type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#state() state} to state.
     * @param state The value for state
     * @return {@code this} builder for chained invocation
     */
    public final Builder state(com.fhir.Devicemetric_calibrationState state) {
      checkNotIsSet(stateIsSet(), "state");
      this.state = java.util.Objects.requireNonNull(state, "state");
      optBits |= OPT_BIT_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#state() state} to state.
     * @param state The value for state
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    public final Builder state(java.util.Optional<? extends com.fhir.Devicemetric_calibrationState> state) {
      checkNotIsSet(stateIsSet(), "state");
      this.state = state.orElse(null);
      optBits |= OPT_BIT_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#time() time} to time.
     * @param time The value for time
     * @return {@code this} builder for chained invocation
     */
    public final Builder time(com.fhir.instant time) {
      checkNotIsSet(timeIsSet(), "time");
      this.time = java.util.Objects.requireNonNull(time, "time");
      optBits |= OPT_BIT_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#time() time} to time.
     * @param time The value for time
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    public final Builder time(java.util.Optional<? extends com.fhir.instant> time) {
      checkNotIsSet(timeIsSet(), "time");
      this.time = time.orElse(null);
      optBits |= OPT_BIT_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.Devicemetric_calibrationType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.Devicemetric_calibrationType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric_Calibration#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Builds a new {@link DeviceMetric_Calibration DeviceMetric_Calibration}.
     * @return An immutable instance of DeviceMetric_Calibration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.DeviceMetric_Calibration build() {
      return new ImmutableDeviceMetric_Calibration(state, time, id, extension, type, modifierExtension);
    }

    private boolean stateIsSet() {
      return (optBits & OPT_BIT_STATE) != 0;
    }

    private boolean timeIsSet() {
      return (optBits & OPT_BIT_TIME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of DeviceMetric_Calibration is strict, attribute is already set: ".concat(name));
    }
  }
}

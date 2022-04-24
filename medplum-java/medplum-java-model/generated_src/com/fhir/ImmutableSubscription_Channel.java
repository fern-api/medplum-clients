//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Subscription_Channel}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubscription_Channel.builder()}.
 */
@org.immutables.value.Generated(from = "Subscription_Channel", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubscription_Channel implements com.fhir.Subscription_Channel {
  private final @javax.annotation.Nullable java.util.List<java.lang.String> header;
  private final @javax.annotation.Nullable com.fhir.Subscription_channelType type;
  private final @javax.annotation.Nullable com.fhir.code payload;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.url endpoint;

  private ImmutableSubscription_Channel(
      @javax.annotation.Nullable java.util.List<java.lang.String> header,
      @javax.annotation.Nullable com.fhir.Subscription_channelType type,
      @javax.annotation.Nullable com.fhir.code payload,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.url endpoint) {
    this.header = header;
    this.type = type;
    this.payload = payload;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.endpoint = endpoint;
  }

  /**
   * @return The value of the {@code header} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("header")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> header() {
    return java.util.Optional.ofNullable(header);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.Subscription_channelType> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code payload} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payload")
  @Override
  public java.util.Optional<com.fhir.code> payload() {
    return java.util.Optional.ofNullable(payload);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code endpoint} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
  @Override
  public java.util.Optional<com.fhir.url> endpoint() {
    return java.util.Optional.ofNullable(endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#header() header} attribute.
   * @param value The value for header
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withHeader(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "header");
    if (this.header == newValue) return this;
    return new ImmutableSubscription_Channel(
        newValue,
        this.type,
        this.payload,
        this.id,
        this.extension,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#header() header} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for header
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription_Channel withHeader(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.header == value) return this;
    return new ImmutableSubscription_Channel(value, this.type, this.payload, this.id, this.extension, this.modifierExtension, this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withType(com.fhir.Subscription_channelType value) {
    @javax.annotation.Nullable com.fhir.Subscription_channelType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSubscription_Channel(
        this.header,
        newValue,
        this.payload,
        this.id,
        this.extension,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription_Channel withType(java.util.Optional<? extends com.fhir.Subscription_channelType> optional) {
    @javax.annotation.Nullable com.fhir.Subscription_channelType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSubscription_Channel(
        this.header,
        value,
        this.payload,
        this.id,
        this.extension,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#payload() payload} attribute.
   * @param value The value for payload
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withPayload(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "payload");
    if (this.payload == newValue) return this;
    return new ImmutableSubscription_Channel(
        this.header,
        this.type,
        newValue,
        this.id,
        this.extension,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#payload() payload} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payload
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription_Channel withPayload(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.payload == value) return this;
    return new ImmutableSubscription_Channel(this.header, this.type, value, this.id, this.extension, this.modifierExtension, this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubscription_Channel(
        this.header,
        this.type,
        this.payload,
        newValue,
        this.extension,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableSubscription_Channel(
        this.header,
        this.type,
        this.payload,
        value,
        this.extension,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubscription_Channel(this.header, this.type, this.payload, this.id, newValue, this.modifierExtension, this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription_Channel withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubscription_Channel(this.header, this.type, this.payload, this.id, value, this.modifierExtension, this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubscription_Channel(this.header, this.type, this.payload, this.id, this.extension, newValue, this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription_Channel withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubscription_Channel(this.header, this.type, this.payload, this.id, this.extension, value, this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withEndpoint(com.fhir.url value) {
    @javax.annotation.Nullable com.fhir.url newValue = java.util.Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableSubscription_Channel(this.header, this.type, this.payload, this.id, this.extension, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription_Channel withEndpoint(java.util.Optional<? extends com.fhir.url> optional) {
    @javax.annotation.Nullable com.fhir.url value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableSubscription_Channel(this.header, this.type, this.payload, this.id, this.extension, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubscription_Channel} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubscription_Channel
        && equalTo((ImmutableSubscription_Channel) another);
  }

  private boolean equalTo(ImmutableSubscription_Channel another) {
    return java.util.Objects.equals(header, another.header)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(payload, another.payload)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(endpoint, another.endpoint);
  }

  /**
   * Computes a hash code from attributes: {@code header}, {@code type}, {@code payload}, {@code id}, {@code extension}, {@code modifierExtension}, {@code endpoint}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(header);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(payload);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(endpoint);
    return h;
  }

  /**
   * Prints the immutable value {@code Subscription_Channel} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Subscription_Channel{");
    if (header != null) {
      builder.append("header=").append(header);
    }
    if (type != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (payload != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("payload=").append(payload);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (endpoint != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Subscription_Channel", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Subscription_Channel {
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> header = java.util.Optional.empty();
    boolean headerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Subscription_channelType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> payload = java.util.Optional.empty();
    boolean payloadIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.url> endpoint = java.util.Optional.empty();
    boolean endpointIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("header")
    public void setHeader(java.util.Optional<java.util.List<java.lang.String>> header) {
      this.header = header;
      this.headerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.Subscription_channelType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("payload")
    public void setPayload(java.util.Optional<com.fhir.code> payload) {
      this.payload = payload;
      this.payloadIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public void setEndpoint(java.util.Optional<com.fhir.url> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> header() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Subscription_channelType> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> payload() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.url> endpoint() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSubscription_Channel fromJson(Json json) {
    ImmutableSubscription_Channel.Builder builder = ImmutableSubscription_Channel.builder();
    if (json.headerIsSet) {
      builder.header(json.header);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.payloadIsSet) {
      builder.payload(json.payload);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    return (ImmutableSubscription_Channel) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Subscription_Channel} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Subscription_Channel instance
   */
  public static Subscription_Channel copyOf(Subscription_Channel instance) {
    if (instance instanceof ImmutableSubscription_Channel) {
      return (ImmutableSubscription_Channel) instance;
    }
    return ImmutableSubscription_Channel.builder()
        .header(instance.header())
        .type(instance.type())
        .payload(instance.payload())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .endpoint(instance.endpoint())
        .build();
  }

  /**
   * Creates a builder for {@link Subscription_Channel Subscription_Channel}.
   * <pre>
   * ImmutableSubscription_Channel.builder()
   *    .header(List&amp;lt;String&amp;gt;) // optional {@link Subscription_Channel#header() header}
   *    .type(com.fhir.Subscription_channelType) // optional {@link Subscription_Channel#type() type}
   *    .payload(com.fhir.code) // optional {@link Subscription_Channel#payload() payload}
   *    .id(String) // optional {@link Subscription_Channel#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Subscription_Channel#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Subscription_Channel#modifierExtension() modifierExtension}
   *    .endpoint(com.fhir.url) // optional {@link Subscription_Channel#endpoint() endpoint}
   *    .build();
   * </pre>
   * @return A new Subscription_Channel builder
   */
  public static ImmutableSubscription_Channel.Builder builder() {
    return new ImmutableSubscription_Channel.Builder();
  }

  /**
   * Builds instances of type {@link Subscription_Channel Subscription_Channel}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Subscription_Channel", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_HEADER = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_PAYLOAD = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_ENDPOINT = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<java.lang.String> header;
    private @javax.annotation.Nullable com.fhir.Subscription_channelType type;
    private @javax.annotation.Nullable com.fhir.code payload;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.url endpoint;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#header() header} to header.
     * @param header The value for header
     * @return {@code this} builder for chained invocation
     */
    public final Builder header(java.util.List<java.lang.String> header) {
      checkNotIsSet(headerIsSet(), "header");
      this.header = java.util.Objects.requireNonNull(header, "header");
      optBits |= OPT_BIT_HEADER;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#header() header} to header.
     * @param header The value for header
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("header")
    public final Builder header(java.util.Optional<? extends java.util.List<java.lang.String>> header) {
      checkNotIsSet(headerIsSet(), "header");
      this.header = header.orElse(null);
      optBits |= OPT_BIT_HEADER;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.Subscription_channelType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.Subscription_channelType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for chained invocation
     */
    public final Builder payload(com.fhir.code payload) {
      checkNotIsSet(payloadIsSet(), "payload");
      this.payload = java.util.Objects.requireNonNull(payload, "payload");
      optBits |= OPT_BIT_PAYLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payload")
    public final Builder payload(java.util.Optional<? extends com.fhir.code> payload) {
      checkNotIsSet(payloadIsSet(), "payload");
      this.payload = payload.orElse(null);
      optBits |= OPT_BIT_PAYLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#id() id} to id.
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
     * Initializes the optional value {@link Subscription_Channel#id() id} to id.
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
     * Initializes the optional value {@link Subscription_Channel#extension() extension} to extension.
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
     * Initializes the optional value {@link Subscription_Channel#extension() extension} to extension.
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
     * Initializes the optional value {@link Subscription_Channel#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Subscription_Channel#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Subscription_Channel#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(com.fhir.url endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = java.util.Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public final Builder endpoint(java.util.Optional<? extends com.fhir.url> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Builds a new {@link Subscription_Channel Subscription_Channel}.
     * @return An immutable instance of Subscription_Channel
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Subscription_Channel build() {
      return new ImmutableSubscription_Channel(header, type, payload, id, extension, modifierExtension, endpoint);
    }

    private boolean headerIsSet() {
      return (optBits & OPT_BIT_HEADER) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean payloadIsSet() {
      return (optBits & OPT_BIT_PAYLOAD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Subscription_Channel is strict, attribute is already set: ".concat(name));
    }
  }
}

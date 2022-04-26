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
 * Immutable implementation of {@link Subscription_Channel}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubscription_Channel.builder()}.
 */
@Generated(from = "Subscription_Channel", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubscription_Channel implements Subscription_Channel {
  private final @Nullable Code payload;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<String> header;
  private final @Nullable List<Extension> extension;
  private final @Nullable Subscription_ChannelType type;
  private final @Nullable Url endpoint;
  private final @Nullable String id;

  private ImmutableSubscription_Channel(
      @Nullable Code payload,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<String> header,
      @Nullable List<Extension> extension,
      @Nullable Subscription_ChannelType type,
      @Nullable Url endpoint,
      @Nullable String id) {
    this.payload = payload;
    this.modifierExtension = modifierExtension;
    this.header = header;
    this.extension = extension;
    this.type = type;
    this.endpoint = endpoint;
    this.id = id;
  }

  /**
   * @return The value of the {@code payload} attribute
   */
  @JsonProperty("payload")
  @Override
  public Optional<Code> payload() {
    return Optional.ofNullable(payload);
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
   * @return The value of the {@code header} attribute
   */
  @JsonProperty("header")
  @Override
  public Optional<List<String>> header() {
    return Optional.ofNullable(header);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Subscription_ChannelType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code endpoint} attribute
   */
  @JsonProperty("endpoint")
  @Override
  public Optional<Url> endpoint() {
    return Optional.ofNullable(endpoint);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#payload() payload} attribute.
   * @param value The value for payload
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withPayload(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "payload");
    if (this.payload == newValue) return this;
    return new ImmutableSubscription_Channel(
        newValue,
        this.modifierExtension,
        this.header,
        this.extension,
        this.type,
        this.endpoint,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#payload() payload} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payload
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription_Channel withPayload(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.payload == value) return this;
    return new ImmutableSubscription_Channel(value, this.modifierExtension, this.header, this.extension, this.type, this.endpoint, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubscription_Channel(this.payload, newValue, this.header, this.extension, this.type, this.endpoint, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription_Channel withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubscription_Channel(this.payload, value, this.header, this.extension, this.type, this.endpoint, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#header() header} attribute.
   * @param value The value for header
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withHeader(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "header");
    if (this.header == newValue) return this;
    return new ImmutableSubscription_Channel(
        this.payload,
        this.modifierExtension,
        newValue,
        this.extension,
        this.type,
        this.endpoint,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#header() header} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for header
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription_Channel withHeader(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.header == value) return this;
    return new ImmutableSubscription_Channel(this.payload, this.modifierExtension, value, this.extension, this.type, this.endpoint, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubscription_Channel(this.payload, this.modifierExtension, this.header, newValue, this.type, this.endpoint, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription_Channel withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubscription_Channel(this.payload, this.modifierExtension, this.header, value, this.type, this.endpoint, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withType(Subscription_ChannelType value) {
    @Nullable Subscription_ChannelType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSubscription_Channel(
        this.payload,
        this.modifierExtension,
        this.header,
        this.extension,
        newValue,
        this.endpoint,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription_Channel withType(Optional<? extends Subscription_ChannelType> optional) {
    @Nullable Subscription_ChannelType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSubscription_Channel(
        this.payload,
        this.modifierExtension,
        this.header,
        this.extension,
        value,
        this.endpoint,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withEndpoint(Url value) {
    @Nullable Url newValue = Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableSubscription_Channel(this.payload, this.modifierExtension, this.header, this.extension, this.type, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription_Channel withEndpoint(Optional<? extends Url> optional) {
    @Nullable Url value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableSubscription_Channel(this.payload, this.modifierExtension, this.header, this.extension, this.type, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription_Channel#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubscription_Channel(
        this.payload,
        this.modifierExtension,
        this.header,
        this.extension,
        this.type,
        this.endpoint,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription_Channel#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription_Channel withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubscription_Channel(
        this.payload,
        this.modifierExtension,
        this.header,
        this.extension,
        this.type,
        this.endpoint,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubscription_Channel} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubscription_Channel
        && equalTo((ImmutableSubscription_Channel) another);
  }

  private boolean equalTo(ImmutableSubscription_Channel another) {
    return Objects.equals(payload, another.payload)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(header, another.header)
        && Objects.equals(extension, another.extension)
        && Objects.equals(type, another.type)
        && Objects.equals(endpoint, another.endpoint)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code payload}, {@code modifierExtension}, {@code header}, {@code extension}, {@code type}, {@code endpoint}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(payload);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(header);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(endpoint);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Subscription_Channel} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Subscription_Channel{");
    if (payload != null) {
      builder.append("payload=").append(payload);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (header != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("header=").append(header);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (endpoint != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Subscription_Channel", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Subscription_Channel {
    @Nullable Optional<Code> payload = Optional.empty();
    boolean payloadIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<String>> header = Optional.empty();
    boolean headerIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Subscription_ChannelType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Url> endpoint = Optional.empty();
    boolean endpointIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("payload")
    public void setPayload(Optional<Code> payload) {
      this.payload = payload;
      this.payloadIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("header")
    public void setHeader(Optional<List<String>> header) {
      this.header = header;
      this.headerIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Subscription_ChannelType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("endpoint")
    public void setEndpoint(Optional<Url> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<Code> payload() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> header() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Subscription_ChannelType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Url> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubscription_Channel fromJson(Json json) {
    ImmutableSubscription_Channel.Builder builder = ImmutableSubscription_Channel.builder();
    if (json.payloadIsSet) {
      builder.payload(json.payload);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.headerIsSet) {
      builder.header(json.header);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .payload(instance.payload())
        .modifierExtension(instance.modifierExtension())
        .header(instance.header())
        .extension(instance.extension())
        .type(instance.type())
        .endpoint(instance.endpoint())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Subscription_Channel Subscription_Channel}.
   * <pre>
   * ImmutableSubscription_Channel.builder()
   *    .payload(com.fhir.types.fhir.Code) // optional {@link Subscription_Channel#payload() payload}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Subscription_Channel#modifierExtension() modifierExtension}
   *    .header(List&amp;lt;String&amp;gt;) // optional {@link Subscription_Channel#header() header}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Subscription_Channel#extension() extension}
   *    .type(Subscription_ChannelType) // optional {@link Subscription_Channel#type() type}
   *    .endpoint(com.fhir.types.fhir.Url) // optional {@link Subscription_Channel#endpoint() endpoint}
   *    .id(String) // optional {@link Subscription_Channel#id() id}
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
  @Generated(from = "Subscription_Channel", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_PAYLOAD = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_HEADER = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_ENDPOINT = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private long optBits;

    private @Nullable Code payload;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<String> header;
    private @Nullable List<Extension> extension;
    private @Nullable Subscription_ChannelType type;
    private @Nullable Url endpoint;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for chained invocation
     */
    public final Builder payload(Code payload) {
      checkNotIsSet(payloadIsSet(), "payload");
      this.payload = Objects.requireNonNull(payload, "payload");
      optBits |= OPT_BIT_PAYLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("payload")
    public final Builder payload(Optional<? extends Code> payload) {
      checkNotIsSet(payloadIsSet(), "payload");
      this.payload = payload.orElse(null);
      optBits |= OPT_BIT_PAYLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Subscription_Channel#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Subscription_Channel#header() header} to header.
     * @param header The value for header
     * @return {@code this} builder for chained invocation
     */
    public final Builder header(List<String> header) {
      checkNotIsSet(headerIsSet(), "header");
      this.header = Objects.requireNonNull(header, "header");
      optBits |= OPT_BIT_HEADER;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#header() header} to header.
     * @param header The value for header
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("header")
    public final Builder header(Optional<? extends List<String>> header) {
      checkNotIsSet(headerIsSet(), "header");
      this.header = header.orElse(null);
      optBits |= OPT_BIT_HEADER;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#extension() extension} to extension.
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
     * Initializes the optional value {@link Subscription_Channel#extension() extension} to extension.
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
     * Initializes the optional value {@link Subscription_Channel#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Subscription_ChannelType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Subscription_ChannelType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(Url endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("endpoint")
    public final Builder endpoint(Optional<? extends Url> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription_Channel#id() id} to id.
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
     * Initializes the optional value {@link Subscription_Channel#id() id} to id.
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
     * Builds a new {@link Subscription_Channel Subscription_Channel}.
     * @return An immutable instance of Subscription_Channel
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Subscription_Channel build() {
      return new ImmutableSubscription_Channel(payload, modifierExtension, header, extension, type, endpoint, id);
    }

    private boolean payloadIsSet() {
      return (optBits & OPT_BIT_PAYLOAD) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean headerIsSet() {
      return (optBits & OPT_BIT_HEADER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Subscription_Channel is strict, attribute is already set: ".concat(name));
    }
  }
}

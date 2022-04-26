package com.medplum.types.fhir;

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
 * Immutable implementation of {@link CapabilityStatement_Messaging}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement_Messaging.builder()}.
 */
@Generated(from = "CapabilityStatement_Messaging", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement_Messaging
    implements CapabilityStatement_Messaging {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable UnsignedInt reliableCache;
  private final @Nullable List<CapabilityStatement_SupportedMessage> supportedMessage;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CapabilityStatement_Endpoint> endpoint;
  private final @Nullable Markdown documentation;

  private ImmutableCapabilityStatement_Messaging(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable UnsignedInt reliableCache,
      @Nullable List<CapabilityStatement_SupportedMessage> supportedMessage,
      @Nullable List<Extension> extension,
      @Nullable List<CapabilityStatement_Endpoint> endpoint,
      @Nullable Markdown documentation) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.reliableCache = reliableCache;
    this.supportedMessage = supportedMessage;
    this.extension = extension;
    this.endpoint = endpoint;
    this.documentation = documentation;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code reliableCache} attribute
   */
  @JsonProperty("reliableCache")
  @Override
  public Optional<UnsignedInt> reliableCache() {
    return Optional.ofNullable(reliableCache);
  }

  /**
   * @return The value of the {@code supportedMessage} attribute
   */
  @JsonProperty("supportedMessage")
  @Override
  public Optional<List<CapabilityStatement_SupportedMessage>> supportedMessage() {
    return Optional.ofNullable(supportedMessage);
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
   * @return The value of the {@code endpoint} attribute
   */
  @JsonProperty("endpoint")
  @Override
  public Optional<List<CapabilityStatement_Endpoint>> endpoint() {
    return Optional.ofNullable(endpoint);
  }

  /**
   * @return The value of the {@code documentation} attribute
   */
  @JsonProperty("documentation")
  @Override
  public Optional<Markdown> documentation() {
    return Optional.ofNullable(documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Messaging#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Messaging withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCapabilityStatement_Messaging(
        newValue,
        this.modifierExtension,
        this.reliableCache,
        this.supportedMessage,
        this.extension,
        this.endpoint,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Messaging#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Messaging withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCapabilityStatement_Messaging(
        value,
        this.modifierExtension,
        this.reliableCache,
        this.supportedMessage,
        this.extension,
        this.endpoint,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Messaging#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Messaging withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.id,
        newValue,
        this.reliableCache,
        this.supportedMessage,
        this.extension,
        this.endpoint,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Messaging#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Messaging withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.id,
        value,
        this.reliableCache,
        this.supportedMessage,
        this.extension,
        this.endpoint,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Messaging#reliableCache() reliableCache} attribute.
   * @param value The value for reliableCache
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Messaging withReliableCache(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "reliableCache");
    if (this.reliableCache == newValue) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.id,
        this.modifierExtension,
        newValue,
        this.supportedMessage,
        this.extension,
        this.endpoint,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Messaging#reliableCache() reliableCache} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reliableCache
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Messaging withReliableCache(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.reliableCache == value) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.id,
        this.modifierExtension,
        value,
        this.supportedMessage,
        this.extension,
        this.endpoint,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Messaging#supportedMessage() supportedMessage} attribute.
   * @param value The value for supportedMessage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Messaging withSupportedMessage(List<CapabilityStatement_SupportedMessage> value) {
    @Nullable List<CapabilityStatement_SupportedMessage> newValue = Objects.requireNonNull(value, "supportedMessage");
    if (this.supportedMessage == newValue) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.id,
        this.modifierExtension,
        this.reliableCache,
        newValue,
        this.extension,
        this.endpoint,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Messaging#supportedMessage() supportedMessage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportedMessage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Messaging withSupportedMessage(Optional<? extends List<CapabilityStatement_SupportedMessage>> optional) {
    @Nullable List<CapabilityStatement_SupportedMessage> value = optional.orElse(null);
    if (this.supportedMessage == value) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.id,
        this.modifierExtension,
        this.reliableCache,
        value,
        this.extension,
        this.endpoint,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Messaging#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Messaging withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.id,
        this.modifierExtension,
        this.reliableCache,
        this.supportedMessage,
        newValue,
        this.endpoint,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Messaging#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Messaging withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.id,
        this.modifierExtension,
        this.reliableCache,
        this.supportedMessage,
        value,
        this.endpoint,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Messaging#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Messaging withEndpoint(List<CapabilityStatement_Endpoint> value) {
    @Nullable List<CapabilityStatement_Endpoint> newValue = Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.id,
        this.modifierExtension,
        this.reliableCache,
        this.supportedMessage,
        this.extension,
        newValue,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Messaging#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Messaging withEndpoint(Optional<? extends List<CapabilityStatement_Endpoint>> optional) {
    @Nullable List<CapabilityStatement_Endpoint> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.id,
        this.modifierExtension,
        this.reliableCache,
        this.supportedMessage,
        this.extension,
        value,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Messaging#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Messaging withDocumentation(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "documentation");
    if (this.documentation == newValue) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.id,
        this.modifierExtension,
        this.reliableCache,
        this.supportedMessage,
        this.extension,
        this.endpoint,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Messaging#documentation() documentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Messaging withDocumentation(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.documentation == value) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.id,
        this.modifierExtension,
        this.reliableCache,
        this.supportedMessage,
        this.extension,
        this.endpoint,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCapabilityStatement_Messaging} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement_Messaging
        && equalTo((ImmutableCapabilityStatement_Messaging) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement_Messaging another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(reliableCache, another.reliableCache)
        && Objects.equals(supportedMessage, another.supportedMessage)
        && Objects.equals(extension, another.extension)
        && Objects.equals(endpoint, another.endpoint)
        && Objects.equals(documentation, another.documentation);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code reliableCache}, {@code supportedMessage}, {@code extension}, {@code endpoint}, {@code documentation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(reliableCache);
    h += (h << 5) + Objects.hashCode(supportedMessage);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(endpoint);
    h += (h << 5) + Objects.hashCode(documentation);
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement_Messaging} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CapabilityStatement_Messaging{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (reliableCache != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("reliableCache=").append(reliableCache);
    }
    if (supportedMessage != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("supportedMessage=").append(supportedMessage);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (endpoint != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (documentation != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CapabilityStatement_Messaging", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CapabilityStatement_Messaging {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<UnsignedInt> reliableCache = Optional.empty();
    boolean reliableCacheIsSet;
    @Nullable Optional<List<CapabilityStatement_SupportedMessage>> supportedMessage = Optional.empty();
    boolean supportedMessageIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CapabilityStatement_Endpoint>> endpoint = Optional.empty();
    boolean endpointIsSet;
    @Nullable Optional<Markdown> documentation = Optional.empty();
    boolean documentationIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("reliableCache")
    public void setReliableCache(Optional<UnsignedInt> reliableCache) {
      this.reliableCache = reliableCache;
      this.reliableCacheIsSet = true;
    }
    @JsonProperty("supportedMessage")
    public void setSupportedMessage(Optional<List<CapabilityStatement_SupportedMessage>> supportedMessage) {
      this.supportedMessage = supportedMessage;
      this.supportedMessageIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("endpoint")
    public void setEndpoint(Optional<List<CapabilityStatement_Endpoint>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @JsonProperty("documentation")
    public void setDocumentation(Optional<Markdown> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UnsignedInt> reliableCache() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CapabilityStatement_SupportedMessage>> supportedMessage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CapabilityStatement_Endpoint>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> documentation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCapabilityStatement_Messaging fromJson(Json json) {
    ImmutableCapabilityStatement_Messaging.Builder builder = ImmutableCapabilityStatement_Messaging.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.reliableCacheIsSet) {
      builder.reliableCache(json.reliableCache);
    }
    if (json.supportedMessageIsSet) {
      builder.supportedMessage(json.supportedMessage);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    return (ImmutableCapabilityStatement_Messaging) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CapabilityStatement_Messaging} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CapabilityStatement_Messaging instance
   */
  public static CapabilityStatement_Messaging copyOf(CapabilityStatement_Messaging instance) {
    if (instance instanceof ImmutableCapabilityStatement_Messaging) {
      return (ImmutableCapabilityStatement_Messaging) instance;
    }
    return ImmutableCapabilityStatement_Messaging.builder()
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .reliableCache(instance.reliableCache())
        .supportedMessage(instance.supportedMessage())
        .extension(instance.extension())
        .endpoint(instance.endpoint())
        .documentation(instance.documentation())
        .build();
  }

  /**
   * Creates a builder for {@link CapabilityStatement_Messaging CapabilityStatement_Messaging}.
   * <pre>
   * ImmutableCapabilityStatement_Messaging.builder()
   *    .id(String) // optional {@link CapabilityStatement_Messaging#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Messaging#modifierExtension() modifierExtension}
   *    .reliableCache(com.medplum.types.fhir.UnsignedInt) // optional {@link CapabilityStatement_Messaging#reliableCache() reliableCache}
   *    .supportedMessage(List&amp;lt;com.medplum.types.fhir.CapabilityStatement_SupportedMessage&amp;gt;) // optional {@link CapabilityStatement_Messaging#supportedMessage() supportedMessage}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Messaging#extension() extension}
   *    .endpoint(List&amp;lt;com.medplum.types.fhir.CapabilityStatement_Endpoint&amp;gt;) // optional {@link CapabilityStatement_Messaging#endpoint() endpoint}
   *    .documentation(com.medplum.types.fhir.Markdown) // optional {@link CapabilityStatement_Messaging#documentation() documentation}
   *    .build();
   * </pre>
   * @return A new CapabilityStatement_Messaging builder
   */
  public static ImmutableCapabilityStatement_Messaging.Builder builder() {
    return new ImmutableCapabilityStatement_Messaging.Builder();
  }

  /**
   * Builds instances of type {@link CapabilityStatement_Messaging CapabilityStatement_Messaging}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CapabilityStatement_Messaging", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_RELIABLE_CACHE = 0x4L;
    private static final long OPT_BIT_SUPPORTED_MESSAGE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_ENDPOINT = 0x20L;
    private static final long OPT_BIT_DOCUMENTATION = 0x40L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable UnsignedInt reliableCache;
    private @Nullable List<CapabilityStatement_SupportedMessage> supportedMessage;
    private @Nullable List<Extension> extension;
    private @Nullable List<CapabilityStatement_Endpoint> endpoint;
    private @Nullable Markdown documentation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Messaging#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Messaging#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Messaging#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Messaging#reliableCache() reliableCache} to reliableCache.
     * @param reliableCache The value for reliableCache
     * @return {@code this} builder for chained invocation
     */
    public final Builder reliableCache(UnsignedInt reliableCache) {
      checkNotIsSet(reliableCacheIsSet(), "reliableCache");
      this.reliableCache = Objects.requireNonNull(reliableCache, "reliableCache");
      optBits |= OPT_BIT_RELIABLE_CACHE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#reliableCache() reliableCache} to reliableCache.
     * @param reliableCache The value for reliableCache
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reliableCache")
    public final Builder reliableCache(Optional<? extends UnsignedInt> reliableCache) {
      checkNotIsSet(reliableCacheIsSet(), "reliableCache");
      this.reliableCache = reliableCache.orElse(null);
      optBits |= OPT_BIT_RELIABLE_CACHE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#supportedMessage() supportedMessage} to supportedMessage.
     * @param supportedMessage The value for supportedMessage
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportedMessage(List<CapabilityStatement_SupportedMessage> supportedMessage) {
      checkNotIsSet(supportedMessageIsSet(), "supportedMessage");
      this.supportedMessage = Objects.requireNonNull(supportedMessage, "supportedMessage");
      optBits |= OPT_BIT_SUPPORTED_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#supportedMessage() supportedMessage} to supportedMessage.
     * @param supportedMessage The value for supportedMessage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportedMessage")
    public final Builder supportedMessage(Optional<? extends List<CapabilityStatement_SupportedMessage>> supportedMessage) {
      checkNotIsSet(supportedMessageIsSet(), "supportedMessage");
      this.supportedMessage = supportedMessage.orElse(null);
      optBits |= OPT_BIT_SUPPORTED_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Messaging#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Messaging#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(List<CapabilityStatement_Endpoint> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("endpoint")
    public final Builder endpoint(Optional<? extends List<CapabilityStatement_Endpoint>> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(Markdown documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("documentation")
    public final Builder documentation(Optional<? extends Markdown> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Builds a new {@link CapabilityStatement_Messaging CapabilityStatement_Messaging}.
     * @return An immutable instance of CapabilityStatement_Messaging
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CapabilityStatement_Messaging build() {
      return new ImmutableCapabilityStatement_Messaging(id, modifierExtension, reliableCache, supportedMessage, extension, endpoint, documentation);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean reliableCacheIsSet() {
      return (optBits & OPT_BIT_RELIABLE_CACHE) != 0;
    }

    private boolean supportedMessageIsSet() {
      return (optBits & OPT_BIT_SUPPORTED_MESSAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CapabilityStatement_Messaging is strict, attribute is already set: ".concat(name));
    }
  }
}

//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CapabilityStatement_Messaging}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement_Messaging.builder()}.
 */
@org.immutables.value.Generated(from = "CapabilityStatement_Messaging", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement_Messaging implements com.fhir.CapabilityStatement_Messaging {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.unsignedInt reliableCache;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SupportedMessage> supportedMessage;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Endpoint> endpoint;
  private final @javax.annotation.Nullable com.fhir.markdown documentation;

  private ImmutableCapabilityStatement_Messaging(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.unsignedInt reliableCache,
      @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SupportedMessage> supportedMessage,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Endpoint> endpoint,
      @javax.annotation.Nullable com.fhir.markdown documentation) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.reliableCache = reliableCache;
    this.supportedMessage = supportedMessage;
    this.extension = extension;
    this.endpoint = endpoint;
    this.documentation = documentation;
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code reliableCache} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reliableCache")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> reliableCache() {
    return java.util.Optional.ofNullable(reliableCache);
  }

  /**
   * @return The value of the {@code supportedMessage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supportedMessage")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_SupportedMessage>> supportedMessage() {
    return java.util.Optional.ofNullable(supportedMessage);
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
   * @return The value of the {@code endpoint} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Endpoint>> endpoint() {
    return java.util.Optional.ofNullable(endpoint);
  }

  /**
   * @return The value of the {@code documentation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("documentation")
  @Override
  public java.util.Optional<com.fhir.markdown> documentation() {
    return java.util.Optional.ofNullable(documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Messaging#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Messaging withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement_Messaging(
        newValue,
        this.id,
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
  public final ImmutableCapabilityStatement_Messaging withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement_Messaging(
        value,
        this.id,
        this.reliableCache,
        this.supportedMessage,
        this.extension,
        this.endpoint,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Messaging#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Messaging withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.modifierExtension,
        newValue,
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
  public final ImmutableCapabilityStatement_Messaging withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.modifierExtension,
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
  public final ImmutableCapabilityStatement_Messaging withReliableCache(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "reliableCache");
    if (this.reliableCache == newValue) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.modifierExtension,
        this.id,
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
  public final ImmutableCapabilityStatement_Messaging withReliableCache(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.reliableCache == value) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.modifierExtension,
        this.id,
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
  public final ImmutableCapabilityStatement_Messaging withSupportedMessage(java.util.List<com.fhir.CapabilityStatement_SupportedMessage> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SupportedMessage> newValue = java.util.Objects.requireNonNull(value, "supportedMessage");
    if (this.supportedMessage == newValue) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.modifierExtension,
        this.id,
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
  public final ImmutableCapabilityStatement_Messaging withSupportedMessage(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_SupportedMessage>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SupportedMessage> value = optional.orElse(null);
    if (this.supportedMessage == value) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.modifierExtension,
        this.id,
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
  public final ImmutableCapabilityStatement_Messaging withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.modifierExtension,
        this.id,
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
  public final ImmutableCapabilityStatement_Messaging withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.modifierExtension,
        this.id,
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
  public final ImmutableCapabilityStatement_Messaging withEndpoint(java.util.List<com.fhir.CapabilityStatement_Endpoint> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Endpoint> newValue = java.util.Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.modifierExtension,
        this.id,
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
  public final ImmutableCapabilityStatement_Messaging withEndpoint(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Endpoint>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Endpoint> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.modifierExtension,
        this.id,
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
  public final ImmutableCapabilityStatement_Messaging withDocumentation(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "documentation");
    if (this.documentation == newValue) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.modifierExtension,
        this.id,
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
  public final ImmutableCapabilityStatement_Messaging withDocumentation(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.documentation == value) return this;
    return new ImmutableCapabilityStatement_Messaging(
        this.modifierExtension,
        this.id,
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
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement_Messaging
        && equalTo((ImmutableCapabilityStatement_Messaging) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement_Messaging another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(reliableCache, another.reliableCache)
        && java.util.Objects.equals(supportedMessage, another.supportedMessage)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(endpoint, another.endpoint)
        && java.util.Objects.equals(documentation, another.documentation);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code reliableCache}, {@code supportedMessage}, {@code extension}, {@code endpoint}, {@code documentation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(reliableCache);
    h += (h << 5) + java.util.Objects.hashCode(supportedMessage);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(endpoint);
    h += (h << 5) + java.util.Objects.hashCode(documentation);
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement_Messaging} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CapabilityStatement_Messaging{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("id=").append(id);
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
  @org.immutables.value.Generated(from = "CapabilityStatement_Messaging", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CapabilityStatement_Messaging {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> reliableCache = java.util.Optional.empty();
    boolean reliableCacheIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CapabilityStatement_SupportedMessage>> supportedMessage = java.util.Optional.empty();
    boolean supportedMessageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Endpoint>> endpoint = java.util.Optional.empty();
    boolean endpointIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> documentation = java.util.Optional.empty();
    boolean documentationIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reliableCache")
    public void setReliableCache(java.util.Optional<com.fhir.unsignedInt> reliableCache) {
      this.reliableCache = reliableCache;
      this.reliableCacheIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supportedMessage")
    public void setSupportedMessage(java.util.Optional<java.util.List<com.fhir.CapabilityStatement_SupportedMessage>> supportedMessage) {
      this.supportedMessage = supportedMessage;
      this.supportedMessageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public void setEndpoint(java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Endpoint>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public void setDocumentation(java.util.Optional<com.fhir.markdown> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> reliableCache() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_SupportedMessage>> supportedMessage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Endpoint>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> documentation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCapabilityStatement_Messaging fromJson(Json json) {
    ImmutableCapabilityStatement_Messaging.Builder builder = ImmutableCapabilityStatement_Messaging.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
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
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Messaging#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link CapabilityStatement_Messaging#id() id}
   *    .reliableCache(com.fhir.unsignedInt) // optional {@link CapabilityStatement_Messaging#reliableCache() reliableCache}
   *    .supportedMessage(List&amp;lt;com.fhir.CapabilityStatement_SupportedMessage&amp;gt;) // optional {@link CapabilityStatement_Messaging#supportedMessage() supportedMessage}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Messaging#extension() extension}
   *    .endpoint(List&amp;lt;com.fhir.CapabilityStatement_Endpoint&amp;gt;) // optional {@link CapabilityStatement_Messaging#endpoint() endpoint}
   *    .documentation(com.fhir.markdown) // optional {@link CapabilityStatement_Messaging#documentation() documentation}
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
  @org.immutables.value.Generated(from = "CapabilityStatement_Messaging", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_RELIABLE_CACHE = 0x4L;
    private static final long OPT_BIT_SUPPORTED_MESSAGE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_ENDPOINT = 0x20L;
    private static final long OPT_BIT_DOCUMENTATION = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.unsignedInt reliableCache;
    private @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SupportedMessage> supportedMessage;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Endpoint> endpoint;
    private @javax.annotation.Nullable com.fhir.markdown documentation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Messaging#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Messaging#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Messaging#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Messaging#reliableCache() reliableCache} to reliableCache.
     * @param reliableCache The value for reliableCache
     * @return {@code this} builder for chained invocation
     */
    public final Builder reliableCache(com.fhir.unsignedInt reliableCache) {
      checkNotIsSet(reliableCacheIsSet(), "reliableCache");
      this.reliableCache = java.util.Objects.requireNonNull(reliableCache, "reliableCache");
      optBits |= OPT_BIT_RELIABLE_CACHE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#reliableCache() reliableCache} to reliableCache.
     * @param reliableCache The value for reliableCache
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reliableCache")
    public final Builder reliableCache(java.util.Optional<? extends com.fhir.unsignedInt> reliableCache) {
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
    public final Builder supportedMessage(java.util.List<com.fhir.CapabilityStatement_SupportedMessage> supportedMessage) {
      checkNotIsSet(supportedMessageIsSet(), "supportedMessage");
      this.supportedMessage = java.util.Objects.requireNonNull(supportedMessage, "supportedMessage");
      optBits |= OPT_BIT_SUPPORTED_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#supportedMessage() supportedMessage} to supportedMessage.
     * @param supportedMessage The value for supportedMessage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedMessage")
    public final Builder supportedMessage(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_SupportedMessage>> supportedMessage) {
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
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Messaging#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(java.util.List<com.fhir.CapabilityStatement_Endpoint> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = java.util.Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public final Builder endpoint(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Endpoint>> endpoint) {
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
    public final Builder documentation(com.fhir.markdown documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = java.util.Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Messaging#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public final Builder documentation(java.util.Optional<? extends com.fhir.markdown> documentation) {
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
    public com.fhir.CapabilityStatement_Messaging build() {
      return new ImmutableCapabilityStatement_Messaging(modifierExtension, id, reliableCache, supportedMessage, extension, endpoint, documentation);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
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
      if (isSet) throw new java.lang.IllegalStateException("Builder of CapabilityStatement_Messaging is strict, attribute is already set: ".concat(name));
    }
  }
}

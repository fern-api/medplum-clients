//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CapabilityStatement_Endpoint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement_Endpoint.builder()}.
 */
@org.immutables.value.Generated(from = "CapabilityStatement_Endpoint", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement_Endpoint implements com.fhir.CapabilityStatement_Endpoint {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final com.fhir.Coding protocol;
  private final @javax.annotation.Nullable com.fhir.url address;

  private ImmutableCapabilityStatement_Endpoint(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      com.fhir.Coding protocol,
      @javax.annotation.Nullable com.fhir.url address) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.extension = extension;
    this.protocol = protocol;
    this.address = address;
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code protocol} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("protocol")
  @Override
  public com.fhir.Coding protocol() {
    return protocol;
  }

  /**
   * @return The value of the {@code address} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("address")
  @Override
  public java.util.Optional<com.fhir.url> address() {
    return java.util.Optional.ofNullable(address);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Endpoint withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement_Endpoint(newValue, this.id, this.extension, this.protocol, this.address);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Endpoint withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement_Endpoint(value, this.id, this.extension, this.protocol, this.address);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Endpoint#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Endpoint withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableCapabilityStatement_Endpoint(this.modifierExtension, newValue, this.extension, this.protocol, this.address);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Endpoint#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Endpoint withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableCapabilityStatement_Endpoint(this.modifierExtension, value, this.extension, this.protocol, this.address);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Endpoint#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Endpoint withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement_Endpoint(this.modifierExtension, this.id, newValue, this.protocol, this.address);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Endpoint#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Endpoint withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement_Endpoint(this.modifierExtension, this.id, value, this.protocol, this.address);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CapabilityStatement_Endpoint#protocol() protocol} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for protocol
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCapabilityStatement_Endpoint withProtocol(com.fhir.Coding value) {
    if (this.protocol == value) return this;
    com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "protocol");
    return new ImmutableCapabilityStatement_Endpoint(this.modifierExtension, this.id, this.extension, newValue, this.address);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Endpoint#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Endpoint withAddress(com.fhir.url value) {
    @javax.annotation.Nullable com.fhir.url newValue = java.util.Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutableCapabilityStatement_Endpoint(this.modifierExtension, this.id, this.extension, this.protocol, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Endpoint#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Endpoint withAddress(java.util.Optional<? extends com.fhir.url> optional) {
    @javax.annotation.Nullable com.fhir.url value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutableCapabilityStatement_Endpoint(this.modifierExtension, this.id, this.extension, this.protocol, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCapabilityStatement_Endpoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement_Endpoint
        && equalTo((ImmutableCapabilityStatement_Endpoint) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement_Endpoint another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && protocol.equals(another.protocol)
        && java.util.Objects.equals(address, another.address);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code extension}, {@code protocol}, {@code address}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + protocol.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(address);
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement_Endpoint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CapabilityStatement_Endpoint{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 29) builder.append(", ");
    builder.append("protocol=").append(protocol);
    if (address != null) {
      builder.append(", ");
      builder.append("address=").append(address);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CapabilityStatement_Endpoint", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CapabilityStatement_Endpoint {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable com.fhir.Coding protocol;
    @javax.annotation.Nullable java.util.Optional<com.fhir.url> address = java.util.Optional.empty();
    boolean addressIsSet;
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
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    public void setProtocol(com.fhir.Coding protocol) {
      this.protocol = protocol;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    public void setAddress(java.util.Optional<com.fhir.url> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Coding protocol() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.url> address() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCapabilityStatement_Endpoint fromJson(Json json) {
    ImmutableCapabilityStatement_Endpoint.Builder builder = ((ImmutableCapabilityStatement_Endpoint.Builder) ImmutableCapabilityStatement_Endpoint.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.protocol != null) {
      builder.protocol(json.protocol);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    return (ImmutableCapabilityStatement_Endpoint) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CapabilityStatement_Endpoint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CapabilityStatement_Endpoint instance
   */
  public static CapabilityStatement_Endpoint copyOf(CapabilityStatement_Endpoint instance) {
    if (instance instanceof ImmutableCapabilityStatement_Endpoint) {
      return (ImmutableCapabilityStatement_Endpoint) instance;
    }
    return ((ImmutableCapabilityStatement_Endpoint.Builder) ImmutableCapabilityStatement_Endpoint.builder())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .extension(instance.extension())
        .protocol(instance.protocol())
        .address(instance.address())
        .build();
  }

  /**
   * Creates a builder for {@link CapabilityStatement_Endpoint CapabilityStatement_Endpoint}.
   * <pre>
   * ImmutableCapabilityStatement_Endpoint.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link CapabilityStatement_Endpoint#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Endpoint#extension() extension}
   *    .protocol(com.fhir.Coding) // required {@link CapabilityStatement_Endpoint#protocol() protocol}
   *    .address(com.fhir.url) // optional {@link CapabilityStatement_Endpoint#address() address}
   *    .build();
   * </pre>
   * @return A new CapabilityStatement_Endpoint builder
   */
  public static ProtocolBuildStage builder() {
    return new ImmutableCapabilityStatement_Endpoint.Builder();
  }

  /**
   * Builds instances of type {@link CapabilityStatement_Endpoint CapabilityStatement_Endpoint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CapabilityStatement_Endpoint", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ProtocolBuildStage, BuildFinal {
    private static final long INIT_BIT_PROTOCOL = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ADDRESS = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Coding protocol;
    private @javax.annotation.Nullable com.fhir.url address;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Endpoint#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Endpoint#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Endpoint#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Endpoint#extension() extension} to extension.
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
     * Initializes the value for the {@link CapabilityStatement_Endpoint#protocol() protocol} attribute.
     * @param protocol The value for protocol 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    public final Builder protocol(com.fhir.Coding protocol) {
      checkNotIsSet(protocolIsSet(), "protocol");
      this.protocol = java.util.Objects.requireNonNull(protocol, "protocol");
      initBits &= ~INIT_BIT_PROTOCOL;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    public final Builder address(com.fhir.url address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = java.util.Objects.requireNonNull(address, "address");
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    public final Builder address(java.util.Optional<? extends com.fhir.url> address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = address.orElse(null);
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Builds a new {@link CapabilityStatement_Endpoint CapabilityStatement_Endpoint}.
     * @return An immutable instance of CapabilityStatement_Endpoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CapabilityStatement_Endpoint build() {
      checkRequiredAttributes();
      return new ImmutableCapabilityStatement_Endpoint(modifierExtension, id, extension, protocol, address);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean protocolIsSet() {
      return (initBits & INIT_BIT_PROTOCOL) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CapabilityStatement_Endpoint is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!protocolIsSet()) attributes.add("protocol");
      return "Cannot build CapabilityStatement_Endpoint, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "CapabilityStatement_Endpoint", generator = "Immutables")
  public interface ProtocolBuildStage {
    /**
     * Initializes the value for the {@link CapabilityStatement_Endpoint#protocol() protocol} attribute.
     * @param protocol The value for protocol 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal protocol(com.fhir.Coding protocol);
  }

  @org.immutables.value.Generated(from = "CapabilityStatement_Endpoint", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(com.fhir.url address);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(java.util.Optional<? extends com.fhir.url> address);

    /**
     * Builds a new {@link CapabilityStatement_Endpoint CapabilityStatement_Endpoint}.
     * @return An immutable instance of CapabilityStatement_Endpoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CapabilityStatement_Endpoint build();
  }
}

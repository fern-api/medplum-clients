//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link DeviceDefinition_UdiDeviceIdentifier}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceDefinition_UdiDeviceIdentifier.builder()}.
 */
@org.immutables.value.Generated(from = "DeviceDefinition_UdiDeviceIdentifier", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceDefinition_UdiDeviceIdentifier
    implements com.fhir.DeviceDefinition_UdiDeviceIdentifier {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.uri issuer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String deviceIdentifier;
  private final @javax.annotation.Nullable com.fhir.uri jurisdiction;
  private final @javax.annotation.Nullable java.lang.String id;

  private ImmutableDeviceDefinition_UdiDeviceIdentifier(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.uri issuer,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String deviceIdentifier,
      @javax.annotation.Nullable com.fhir.uri jurisdiction,
      @javax.annotation.Nullable java.lang.String id) {
    this.extension = extension;
    this.issuer = issuer;
    this.modifierExtension = modifierExtension;
    this.deviceIdentifier = deviceIdentifier;
    this.jurisdiction = jurisdiction;
    this.id = id;
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
   * @return The value of the {@code issuer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("issuer")
  @Override
  public java.util.Optional<com.fhir.uri> issuer() {
    return java.util.Optional.ofNullable(issuer);
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
   * @return The value of the {@code deviceIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deviceIdentifier")
  @Override
  public java.util.Optional<java.lang.String> deviceIdentifier() {
    return java.util.Optional.ofNullable(deviceIdentifier);
  }

  /**
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<com.fhir.uri> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_UdiDeviceIdentifier#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(
        newValue,
        this.issuer,
        this.modifierExtension,
        this.deviceIdentifier,
        this.jurisdiction,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_UdiDeviceIdentifier#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(value, this.issuer, this.modifierExtension, this.deviceIdentifier, this.jurisdiction, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_UdiDeviceIdentifier#issuer() issuer} attribute.
   * @param value The value for issuer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withIssuer(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "issuer");
    if (this.issuer == newValue) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(
        this.extension,
        newValue,
        this.modifierExtension,
        this.deviceIdentifier,
        this.jurisdiction,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_UdiDeviceIdentifier#issuer() issuer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issuer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withIssuer(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.issuer == value) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(
        this.extension,
        value,
        this.modifierExtension,
        this.deviceIdentifier,
        this.jurisdiction,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_UdiDeviceIdentifier#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(this.extension, this.issuer, newValue, this.deviceIdentifier, this.jurisdiction, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_UdiDeviceIdentifier#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(this.extension, this.issuer, value, this.deviceIdentifier, this.jurisdiction, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_UdiDeviceIdentifier#deviceIdentifier() deviceIdentifier} attribute.
   * @param value The value for deviceIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withDeviceIdentifier(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "deviceIdentifier");
    if (java.util.Objects.equals(this.deviceIdentifier, newValue)) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(this.extension, this.issuer, this.modifierExtension, newValue, this.jurisdiction, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_UdiDeviceIdentifier#deviceIdentifier() deviceIdentifier} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deviceIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withDeviceIdentifier(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.deviceIdentifier, value)) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(this.extension, this.issuer, this.modifierExtension, value, this.jurisdiction, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_UdiDeviceIdentifier#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withJurisdiction(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(this.extension, this.issuer, this.modifierExtension, this.deviceIdentifier, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_UdiDeviceIdentifier#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withJurisdiction(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(this.extension, this.issuer, this.modifierExtension, this.deviceIdentifier, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_UdiDeviceIdentifier#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(
        this.extension,
        this.issuer,
        this.modifierExtension,
        this.deviceIdentifier,
        this.jurisdiction,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_UdiDeviceIdentifier#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(
        this.extension,
        this.issuer,
        this.modifierExtension,
        this.deviceIdentifier,
        this.jurisdiction,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceDefinition_UdiDeviceIdentifier} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceDefinition_UdiDeviceIdentifier
        && equalTo((ImmutableDeviceDefinition_UdiDeviceIdentifier) another);
  }

  private boolean equalTo(ImmutableDeviceDefinition_UdiDeviceIdentifier another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(issuer, another.issuer)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(deviceIdentifier, another.deviceIdentifier)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code issuer}, {@code modifierExtension}, {@code deviceIdentifier}, {@code jurisdiction}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(issuer);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(deviceIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceDefinition_UdiDeviceIdentifier} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("DeviceDefinition_UdiDeviceIdentifier{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (issuer != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("issuer=").append(issuer);
    }
    if (modifierExtension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (deviceIdentifier != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("deviceIdentifier=").append(deviceIdentifier);
    }
    if (jurisdiction != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (id != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "DeviceDefinition_UdiDeviceIdentifier", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.DeviceDefinition_UdiDeviceIdentifier {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> issuer = java.util.Optional.empty();
    boolean issuerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> deviceIdentifier = java.util.Optional.empty();
    boolean deviceIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("issuer")
    public void setIssuer(java.util.Optional<com.fhir.uri> issuer) {
      this.issuer = issuer;
      this.issuerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deviceIdentifier")
    public void setDeviceIdentifier(java.util.Optional<java.lang.String> deviceIdentifier) {
      this.deviceIdentifier = deviceIdentifier;
      this.deviceIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<com.fhir.uri> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> issuer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> deviceIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceDefinition_UdiDeviceIdentifier fromJson(Json json) {
    ImmutableDeviceDefinition_UdiDeviceIdentifier.Builder builder = ImmutableDeviceDefinition_UdiDeviceIdentifier.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.issuerIsSet) {
      builder.issuer(json.issuer);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.deviceIdentifierIsSet) {
      builder.deviceIdentifier(json.deviceIdentifier);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableDeviceDefinition_UdiDeviceIdentifier) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DeviceDefinition_UdiDeviceIdentifier} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DeviceDefinition_UdiDeviceIdentifier instance
   */
  public static DeviceDefinition_UdiDeviceIdentifier copyOf(DeviceDefinition_UdiDeviceIdentifier instance) {
    if (instance instanceof ImmutableDeviceDefinition_UdiDeviceIdentifier) {
      return (ImmutableDeviceDefinition_UdiDeviceIdentifier) instance;
    }
    return ImmutableDeviceDefinition_UdiDeviceIdentifier.builder()
        .extension(instance.extension())
        .issuer(instance.issuer())
        .modifierExtension(instance.modifierExtension())
        .deviceIdentifier(instance.deviceIdentifier())
        .jurisdiction(instance.jurisdiction())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceDefinition_UdiDeviceIdentifier DeviceDefinition_UdiDeviceIdentifier}.
   * <pre>
   * ImmutableDeviceDefinition_UdiDeviceIdentifier.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition_UdiDeviceIdentifier#extension() extension}
   *    .issuer(com.fhir.uri) // optional {@link DeviceDefinition_UdiDeviceIdentifier#issuer() issuer}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition_UdiDeviceIdentifier#modifierExtension() modifierExtension}
   *    .deviceIdentifier(String) // optional {@link DeviceDefinition_UdiDeviceIdentifier#deviceIdentifier() deviceIdentifier}
   *    .jurisdiction(com.fhir.uri) // optional {@link DeviceDefinition_UdiDeviceIdentifier#jurisdiction() jurisdiction}
   *    .id(String) // optional {@link DeviceDefinition_UdiDeviceIdentifier#id() id}
   *    .build();
   * </pre>
   * @return A new DeviceDefinition_UdiDeviceIdentifier builder
   */
  public static ImmutableDeviceDefinition_UdiDeviceIdentifier.Builder builder() {
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier.Builder();
  }

  /**
   * Builds instances of type {@link DeviceDefinition_UdiDeviceIdentifier DeviceDefinition_UdiDeviceIdentifier}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "DeviceDefinition_UdiDeviceIdentifier", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ISSUER = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_DEVICE_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_JURISDICTION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.uri issuer;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String deviceIdentifier;
    private @javax.annotation.Nullable com.fhir.uri jurisdiction;
    private @javax.annotation.Nullable java.lang.String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for chained invocation
     */
    public final Builder issuer(com.fhir.uri issuer) {
      checkNotIsSet(issuerIsSet(), "issuer");
      this.issuer = java.util.Objects.requireNonNull(issuer, "issuer");
      optBits |= OPT_BIT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("issuer")
    public final Builder issuer(java.util.Optional<? extends com.fhir.uri> issuer) {
      checkNotIsSet(issuerIsSet(), "issuer");
      this.issuer = issuer.orElse(null);
      optBits |= OPT_BIT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#deviceIdentifier() deviceIdentifier} to deviceIdentifier.
     * @param deviceIdentifier The value for deviceIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder deviceIdentifier(java.lang.String deviceIdentifier) {
      checkNotIsSet(deviceIdentifierIsSet(), "deviceIdentifier");
      this.deviceIdentifier = java.util.Objects.requireNonNull(deviceIdentifier, "deviceIdentifier");
      optBits |= OPT_BIT_DEVICE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#deviceIdentifier() deviceIdentifier} to deviceIdentifier.
     * @param deviceIdentifier The value for deviceIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deviceIdentifier")
    public final Builder deviceIdentifier(java.util.Optional<java.lang.String> deviceIdentifier) {
      checkNotIsSet(deviceIdentifierIsSet(), "deviceIdentifier");
      this.deviceIdentifier = deviceIdentifier.orElse(null);
      optBits |= OPT_BIT_DEVICE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(com.fhir.uri jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = java.util.Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public final Builder jurisdiction(java.util.Optional<? extends com.fhir.uri> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#id() id} to id.
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
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#id() id} to id.
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
     * Builds a new {@link DeviceDefinition_UdiDeviceIdentifier DeviceDefinition_UdiDeviceIdentifier}.
     * @return An immutable instance of DeviceDefinition_UdiDeviceIdentifier
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.DeviceDefinition_UdiDeviceIdentifier build() {
      return new ImmutableDeviceDefinition_UdiDeviceIdentifier(extension, issuer, modifierExtension, deviceIdentifier, jurisdiction, id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean issuerIsSet() {
      return (optBits & OPT_BIT_ISSUER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean deviceIdentifierIsSet() {
      return (optBits & OPT_BIT_DEVICE_IDENTIFIER) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of DeviceDefinition_UdiDeviceIdentifier is strict, attribute is already set: ".concat(name));
    }
  }
}

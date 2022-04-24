//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link TestScript_Capability}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Capability.builder()}.
 */
@org.immutables.value.Generated(from = "TestScript_Capability", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Capability implements com.fhir.TestScript_Capability {
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.lang.Boolean validated;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<java.lang.Integer> origin;
  private final @javax.annotation.Nullable java.lang.Integer destination;
  private final @javax.annotation.Nullable java.lang.Boolean required;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final com.fhir.canonical capabilities;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> link;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableTestScript_Capability(
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.lang.Boolean validated,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<java.lang.Integer> origin,
      @javax.annotation.Nullable java.lang.Integer destination,
      @javax.annotation.Nullable java.lang.Boolean required,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      com.fhir.canonical capabilities,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> link,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.description = description;
    this.validated = validated;
    this.id = id;
    this.origin = origin;
    this.destination = destination;
    this.required = required;
    this.extension = extension;
    this.capabilities = capabilities;
    this.link = link;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code validated} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("validated")
  @Override
  public java.util.Optional<java.lang.Boolean> validated() {
    return java.util.Optional.ofNullable(validated);
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
   * @return The value of the {@code origin} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("origin")
  @Override
  public java.util.Optional<java.util.List<java.lang.Integer>> origin() {
    return java.util.Optional.ofNullable(origin);
  }

  /**
   * @return The value of the {@code destination} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("destination")
  @Override
  public java.util.Optional<java.lang.Integer> destination() {
    return java.util.Optional.ofNullable(destination);
  }

  /**
   * @return The value of the {@code required} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("required")
  @Override
  public java.util.Optional<java.lang.Boolean> required() {
    return java.util.Optional.ofNullable(required);
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
   * @return The value of the {@code capabilities} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
  @Override
  public com.fhir.canonical capabilities() {
    return capabilities;
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("link")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> link() {
    return java.util.Optional.ofNullable(link);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableTestScript_Capability(
        newValue,
        this.validated,
        this.id,
        this.origin,
        this.destination,
        this.required,
        this.extension,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableTestScript_Capability(
        value,
        this.validated,
        this.id,
        this.origin,
        this.destination,
        this.required,
        this.extension,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#validated() validated} attribute.
   * @param value The value for validated
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withValidated(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.validated, newValue)) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        newValue,
        this.id,
        this.origin,
        this.destination,
        this.required,
        this.extension,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#validated() validated} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validated
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withValidated(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.validated, value)) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        value,
        this.id,
        this.origin,
        this.destination,
        this.required,
        this.extension,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        newValue,
        this.origin,
        this.destination,
        this.required,
        this.extension,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        value,
        this.origin,
        this.destination,
        this.required,
        this.extension,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#origin() origin} attribute.
   * @param value The value for origin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withOrigin(java.util.List<java.lang.Integer> value) {
    @javax.annotation.Nullable java.util.List<java.lang.Integer> newValue = java.util.Objects.requireNonNull(value, "origin");
    if (this.origin == newValue) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        this.id,
        newValue,
        this.destination,
        this.required,
        this.extension,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#origin() origin} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for origin
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Capability withOrigin(java.util.Optional<? extends java.util.List<java.lang.Integer>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.Integer> value = optional.orElse(null);
    if (this.origin == value) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        this.id,
        value,
        this.destination,
        this.required,
        this.extension,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#destination() destination} attribute.
   * @param value The value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withDestination(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.destination, newValue)) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        this.id,
        this.origin,
        newValue,
        this.required,
        this.extension,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#destination() destination} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withDestination(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.destination, value)) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        this.id,
        this.origin,
        value,
        this.required,
        this.extension,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#required() required} attribute.
   * @param value The value for required
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withRequired(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.required, newValue)) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        this.id,
        this.origin,
        this.destination,
        newValue,
        this.extension,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#required() required} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for required
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withRequired(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.required, value)) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        this.id,
        this.origin,
        this.destination,
        value,
        this.extension,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        this.id,
        this.origin,
        this.destination,
        this.required,
        newValue,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Capability withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        this.id,
        this.origin,
        this.destination,
        this.required,
        value,
        this.capabilities,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TestScript_Capability#capabilities() capabilities} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for capabilities
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTestScript_Capability withCapabilities(com.fhir.canonical value) {
    if (this.capabilities == value) return this;
    com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "capabilities");
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        this.id,
        this.origin,
        this.destination,
        this.required,
        this.extension,
        newValue,
        this.link,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withLink(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        this.id,
        this.origin,
        this.destination,
        this.required,
        this.extension,
        this.capabilities,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Capability withLink(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        this.id,
        this.origin,
        this.destination,
        this.required,
        this.extension,
        this.capabilities,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        this.id,
        this.origin,
        this.destination,
        this.required,
        this.extension,
        this.capabilities,
        this.link,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Capability withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Capability(
        this.description,
        this.validated,
        this.id,
        this.origin,
        this.destination,
        this.required,
        this.extension,
        this.capabilities,
        this.link,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Capability} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Capability
        && equalTo((ImmutableTestScript_Capability) another);
  }

  private boolean equalTo(ImmutableTestScript_Capability another) {
    return java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(validated, another.validated)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(origin, another.origin)
        && java.util.Objects.equals(destination, another.destination)
        && java.util.Objects.equals(required, another.required)
        && java.util.Objects.equals(extension, another.extension)
        && capabilities.equals(another.capabilities)
        && java.util.Objects.equals(link, another.link)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code description}, {@code validated}, {@code id}, {@code origin}, {@code destination}, {@code required}, {@code extension}, {@code capabilities}, {@code link}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(validated);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(origin);
    h += (h << 5) + java.util.Objects.hashCode(destination);
    h += (h << 5) + java.util.Objects.hashCode(required);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + capabilities.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(link);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Capability} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("TestScript_Capability{");
    if (description != null) {
      builder.append("description=").append(description);
    }
    if (validated != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("validated=").append(validated);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (origin != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("origin=").append(origin);
    }
    if (destination != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("destination=").append(destination);
    }
    if (required != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("required=").append(required);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("capabilities=").append(capabilities);
    if (link != null) {
      builder.append(", ");
      builder.append("link=").append(link);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "TestScript_Capability", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.TestScript_Capability {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> validated = java.util.Optional.empty();
    boolean validatedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.Integer>> origin = java.util.Optional.empty();
    boolean originIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> destination = java.util.Optional.empty();
    boolean destinationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> required = java.util.Optional.empty();
    boolean requiredIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable com.fhir.canonical capabilities;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> link = java.util.Optional.empty();
    boolean linkIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("validated")
    public void setValidated(java.util.Optional<java.lang.Boolean> validated) {
      this.validated = validated;
      this.validatedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    public void setOrigin(java.util.Optional<java.util.List<java.lang.Integer>> origin) {
      this.origin = origin;
      this.originIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    public void setDestination(java.util.Optional<java.lang.Integer> destination) {
      this.destination = destination;
      this.destinationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("required")
    public void setRequired(java.util.Optional<java.lang.Boolean> required) {
      this.required = required;
      this.requiredIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    public void setCapabilities(com.fhir.canonical capabilities) {
      this.capabilities = capabilities;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public void setLink(java.util.Optional<java.util.List<com.fhir.uri>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> validated() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.Integer>> origin() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> destination() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> required() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.canonical capabilities() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> link() { throw new UnsupportedOperationException(); }
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
  static ImmutableTestScript_Capability fromJson(Json json) {
    ImmutableTestScript_Capability.Builder builder = ((ImmutableTestScript_Capability.Builder) ImmutableTestScript_Capability.builder());
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.validatedIsSet) {
      builder.validated(json.validated);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.originIsSet) {
      builder.origin(json.origin);
    }
    if (json.destinationIsSet) {
      builder.destination(json.destination);
    }
    if (json.requiredIsSet) {
      builder.required(json.required);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.capabilities != null) {
      builder.capabilities(json.capabilities);
    }
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableTestScript_Capability) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestScript_Capability} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestScript_Capability instance
   */
  public static TestScript_Capability copyOf(TestScript_Capability instance) {
    if (instance instanceof ImmutableTestScript_Capability) {
      return (ImmutableTestScript_Capability) instance;
    }
    return ((ImmutableTestScript_Capability.Builder) ImmutableTestScript_Capability.builder())
        .description(instance.description())
        .validated(instance.validated())
        .id(instance.id())
        .origin(instance.origin())
        .destination(instance.destination())
        .required(instance.required())
        .extension(instance.extension())
        .capabilities(instance.capabilities())
        .link(instance.link())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Capability TestScript_Capability}.
   * <pre>
   * ImmutableTestScript_Capability.builder()
   *    .description(String) // optional {@link TestScript_Capability#description() description}
   *    .validated(Boolean) // optional {@link TestScript_Capability#validated() validated}
   *    .id(String) // optional {@link TestScript_Capability#id() id}
   *    .origin(List&amp;lt;Integer&amp;gt;) // optional {@link TestScript_Capability#origin() origin}
   *    .destination(Integer) // optional {@link TestScript_Capability#destination() destination}
   *    .required(Boolean) // optional {@link TestScript_Capability#required() required}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_Capability#extension() extension}
   *    .capabilities(com.fhir.canonical) // required {@link TestScript_Capability#capabilities() capabilities}
   *    .link(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link TestScript_Capability#link() link}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_Capability#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new TestScript_Capability builder
   */
  public static CapabilitiesBuildStage builder() {
    return new ImmutableTestScript_Capability.Builder();
  }

  /**
   * Builds instances of type {@link TestScript_Capability TestScript_Capability}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "TestScript_Capability", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements CapabilitiesBuildStage, BuildFinal {
    private static final long INIT_BIT_CAPABILITIES = 0x1L;
    private static final long OPT_BIT_DESCRIPTION = 0x1L;
    private static final long OPT_BIT_VALIDATED = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_ORIGIN = 0x8L;
    private static final long OPT_BIT_DESTINATION = 0x10L;
    private static final long OPT_BIT_REQUIRED = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_LINK = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.lang.Boolean validated;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<java.lang.Integer> origin;
    private @javax.annotation.Nullable java.lang.Integer destination;
    private @javax.annotation.Nullable java.lang.Boolean required;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.canonical capabilities;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> link;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#validated() validated} to validated.
     * @param validated The value for validated
     * @return {@code this} builder for chained invocation
     */
    public final Builder validated(boolean validated) {
      checkNotIsSet(validatedIsSet(), "validated");
      this.validated = validated;
      optBits |= OPT_BIT_VALIDATED;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#validated() validated} to validated.
     * @param validated The value for validated
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validated")
    public final Builder validated(java.util.Optional<java.lang.Boolean> validated) {
      checkNotIsSet(validatedIsSet(), "validated");
      this.validated = validated.orElse(null);
      optBits |= OPT_BIT_VALIDATED;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Capability#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Capability#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for chained invocation
     */
    public final Builder origin(java.util.List<java.lang.Integer> origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = java.util.Objects.requireNonNull(origin, "origin");
      optBits |= OPT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    public final Builder origin(java.util.Optional<? extends java.util.List<java.lang.Integer>> origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = origin.orElse(null);
      optBits |= OPT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    public final Builder destination(int destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination;
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    public final Builder destination(java.util.Optional<java.lang.Integer> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination.orElse(null);
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#required() required} to required.
     * @param required The value for required
     * @return {@code this} builder for chained invocation
     */
    public final Builder required(boolean required) {
      checkNotIsSet(requiredIsSet(), "required");
      this.required = required;
      optBits |= OPT_BIT_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#required() required} to required.
     * @param required The value for required
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("required")
    public final Builder required(java.util.Optional<java.lang.Boolean> required) {
      checkNotIsSet(requiredIsSet(), "required");
      this.required = required.orElse(null);
      optBits |= OPT_BIT_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Capability#extension() extension} to extension.
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
     * Initializes the value for the {@link TestScript_Capability#capabilities() capabilities} attribute.
     * @param capabilities The value for capabilities 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    public final Builder capabilities(com.fhir.canonical capabilities) {
      checkNotIsSet(capabilitiesIsSet(), "capabilities");
      this.capabilities = java.util.Objects.requireNonNull(capabilities, "capabilities");
      initBits &= ~INIT_BIT_CAPABILITIES;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(java.util.List<com.fhir.uri> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = java.util.Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public final Builder link(java.util.Optional<? extends java.util.List<com.fhir.uri>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Capability#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link TestScript_Capability TestScript_Capability}.
     * @return An immutable instance of TestScript_Capability
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.TestScript_Capability build() {
      checkRequiredAttributes();
      return new ImmutableTestScript_Capability(
          description,
          validated,
          id,
          origin,
          destination,
          required,
          extension,
          capabilities,
          link,
          modifierExtension);
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean validatedIsSet() {
      return (optBits & OPT_BIT_VALIDATED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean originIsSet() {
      return (optBits & OPT_BIT_ORIGIN) != 0;
    }

    private boolean destinationIsSet() {
      return (optBits & OPT_BIT_DESTINATION) != 0;
    }

    private boolean requiredIsSet() {
      return (optBits & OPT_BIT_REQUIRED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean capabilitiesIsSet() {
      return (initBits & INIT_BIT_CAPABILITIES) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of TestScript_Capability is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!capabilitiesIsSet()) attributes.add("capabilities");
      return "Cannot build TestScript_Capability, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "TestScript_Capability", generator = "Immutables")
  public interface CapabilitiesBuildStage {
    /**
     * Initializes the value for the {@link TestScript_Capability#capabilities() capabilities} attribute.
     * @param capabilities The value for capabilities 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal capabilities(com.fhir.canonical capabilities);
  }

  @org.immutables.value.Generated(from = "TestScript_Capability", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link TestScript_Capability#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link TestScript_Capability#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link TestScript_Capability#validated() validated} to validated.
     * @param validated The value for validated
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validated(boolean validated);

    /**
     * Initializes the optional value {@link TestScript_Capability#validated() validated} to validated.
     * @param validated The value for validated
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validated(java.util.Optional<java.lang.Boolean> validated);

    /**
     * Initializes the optional value {@link TestScript_Capability#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link TestScript_Capability#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link TestScript_Capability#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for chained invocation
     */
    BuildFinal origin(java.util.List<java.lang.Integer> origin);

    /**
     * Initializes the optional value {@link TestScript_Capability#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal origin(java.util.Optional<? extends java.util.List<java.lang.Integer>> origin);

    /**
     * Initializes the optional value {@link TestScript_Capability#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    BuildFinal destination(int destination);

    /**
     * Initializes the optional value {@link TestScript_Capability#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal destination(java.util.Optional<java.lang.Integer> destination);

    /**
     * Initializes the optional value {@link TestScript_Capability#required() required} to required.
     * @param required The value for required
     * @return {@code this} builder for chained invocation
     */
    BuildFinal required(boolean required);

    /**
     * Initializes the optional value {@link TestScript_Capability#required() required} to required.
     * @param required The value for required
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal required(java.util.Optional<java.lang.Boolean> required);

    /**
     * Initializes the optional value {@link TestScript_Capability#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link TestScript_Capability#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link TestScript_Capability#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    BuildFinal link(java.util.List<com.fhir.uri> link);

    /**
     * Initializes the optional value {@link TestScript_Capability#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal link(java.util.Optional<? extends java.util.List<com.fhir.uri>> link);

    /**
     * Initializes the optional value {@link TestScript_Capability#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link TestScript_Capability#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Builds a new {@link TestScript_Capability TestScript_Capability}.
     * @return An immutable instance of TestScript_Capability
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    TestScript_Capability build();
  }
}

//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CodeSystem_Concept}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodeSystem_Concept.builder()}.
 */
@org.immutables.value.Generated(from = "CodeSystem_Concept", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCodeSystem_Concept implements com.fhir.CodeSystem_Concept {
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Designation> designation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Concept> concept;
  private final @javax.annotation.Nullable java.lang.String definition;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Property1> property;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String display;

  private ImmutableCodeSystem_Concept(
      @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Designation> designation,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code code,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Concept> concept,
      @javax.annotation.Nullable java.lang.String definition,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Property1> property,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String display) {
    this.designation = designation;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.code = code;
    this.concept = concept;
    this.definition = definition;
    this.property = property;
    this.id = id;
    this.display = display;
  }

  /**
   * @return The value of the {@code designation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("designation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeSystem_Designation>> designation() {
    return java.util.Optional.ofNullable(designation);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.code> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code concept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("concept")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeSystem_Concept>> concept() {
    return java.util.Optional.ofNullable(concept);
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("definition")
  @Override
  public java.util.Optional<java.lang.String> definition() {
    return java.util.Optional.ofNullable(definition);
  }

  /**
   * @return The value of the {@code property} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("property")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeSystem_Property1>> property() {
    return java.util.Optional.ofNullable(property);
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
   * @return The value of the {@code display} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("display")
  @Override
  public java.util.Optional<java.lang.String> display() {
    return java.util.Optional.ofNullable(display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#designation() designation} attribute.
   * @param value The value for designation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withDesignation(java.util.List<com.fhir.CodeSystem_Designation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Designation> newValue = java.util.Objects.requireNonNull(value, "designation");
    if (this.designation == newValue) return this;
    return new ImmutableCodeSystem_Concept(
        newValue,
        this.modifierExtension,
        this.extension,
        this.code,
        this.concept,
        this.definition,
        this.property,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#designation() designation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for designation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Concept withDesignation(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Designation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Designation> value = optional.orElse(null);
    if (this.designation == value) return this;
    return new ImmutableCodeSystem_Concept(
        value,
        this.modifierExtension,
        this.extension,
        this.code,
        this.concept,
        this.definition,
        this.property,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        newValue,
        this.extension,
        this.code,
        this.concept,
        this.definition,
        this.property,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Concept withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        value,
        this.extension,
        this.code,
        this.concept,
        this.definition,
        this.property,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        newValue,
        this.code,
        this.concept,
        this.definition,
        this.property,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Concept withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        value,
        this.code,
        this.concept,
        this.definition,
        this.property,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withCode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        this.extension,
        newValue,
        this.concept,
        this.definition,
        this.property,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Concept withCode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        this.extension,
        value,
        this.concept,
        this.definition,
        this.property,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#concept() concept} attribute.
   * @param value The value for concept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withConcept(java.util.List<com.fhir.CodeSystem_Concept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Concept> newValue = java.util.Objects.requireNonNull(value, "concept");
    if (this.concept == newValue) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        this.extension,
        this.code,
        newValue,
        this.definition,
        this.property,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#concept() concept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for concept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Concept withConcept(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Concept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Concept> value = optional.orElse(null);
    if (this.concept == value) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        this.extension,
        this.code,
        value,
        this.definition,
        this.property,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withDefinition(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "definition");
    if (java.util.Objects.equals(this.definition, newValue)) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        this.extension,
        this.code,
        this.concept,
        newValue,
        this.property,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#definition() definition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withDefinition(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.definition, value)) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        this.extension,
        this.code,
        this.concept,
        value,
        this.property,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withProperty(java.util.List<com.fhir.CodeSystem_Property1> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Property1> newValue = java.util.Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        this.extension,
        this.code,
        this.concept,
        this.definition,
        newValue,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Concept withProperty(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Property1>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Property1> value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        this.extension,
        this.code,
        this.concept,
        this.definition,
        value,
        this.id,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        this.extension,
        this.code,
        this.concept,
        this.definition,
        this.property,
        newValue,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        this.extension,
        this.code,
        this.concept,
        this.definition,
        this.property,
        value,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withDisplay(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "display");
    if (java.util.Objects.equals(this.display, newValue)) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        this.extension,
        this.code,
        this.concept,
        this.definition,
        this.property,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withDisplay(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.display, value)) return this;
    return new ImmutableCodeSystem_Concept(
        this.designation,
        this.modifierExtension,
        this.extension,
        this.code,
        this.concept,
        this.definition,
        this.property,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodeSystem_Concept} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodeSystem_Concept
        && equalTo((ImmutableCodeSystem_Concept) another);
  }

  private boolean equalTo(ImmutableCodeSystem_Concept another) {
    return java.util.Objects.equals(designation, another.designation)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(concept, another.concept)
        && java.util.Objects.equals(definition, another.definition)
        && java.util.Objects.equals(property, another.property)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(display, another.display);
  }

  /**
   * Computes a hash code from attributes: {@code designation}, {@code modifierExtension}, {@code extension}, {@code code}, {@code concept}, {@code definition}, {@code property}, {@code id}, {@code display}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(designation);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(concept);
    h += (h << 5) + java.util.Objects.hashCode(definition);
    h += (h << 5) + java.util.Objects.hashCode(property);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(display);
    return h;
  }

  /**
   * Prints the immutable value {@code CodeSystem_Concept} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CodeSystem_Concept{");
    if (designation != null) {
      builder.append("designation=").append(designation);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (code != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (concept != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("concept=").append(concept);
    }
    if (definition != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("definition=").append(definition);
    }
    if (property != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("property=").append(property);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (display != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("display=").append(display);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CodeSystem_Concept", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CodeSystem_Concept {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeSystem_Designation>> designation = java.util.Optional.empty();
    boolean designationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeSystem_Concept>> concept = java.util.Optional.empty();
    boolean conceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> definition = java.util.Optional.empty();
    boolean definitionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeSystem_Property1>> property = java.util.Optional.empty();
    boolean propertyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> display = java.util.Optional.empty();
    boolean displayIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("designation")
    public void setDesignation(java.util.Optional<java.util.List<com.fhir.CodeSystem_Designation>> designation) {
      this.designation = designation;
      this.designationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("concept")
    public void setConcept(java.util.Optional<java.util.List<com.fhir.CodeSystem_Concept>> concept) {
      this.concept = concept;
      this.conceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public void setDefinition(java.util.Optional<java.lang.String> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("property")
    public void setProperty(java.util.Optional<java.util.List<com.fhir.CodeSystem_Property1>> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    public void setDisplay(java.util.Optional<java.lang.String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeSystem_Designation>> designation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeSystem_Concept>> concept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> definition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeSystem_Property1>> property() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> display() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCodeSystem_Concept fromJson(Json json) {
    ImmutableCodeSystem_Concept.Builder builder = ImmutableCodeSystem_Concept.builder();
    if (json.designationIsSet) {
      builder.designation(json.designation);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.conceptIsSet) {
      builder.concept(json.concept);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    return (ImmutableCodeSystem_Concept) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CodeSystem_Concept} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CodeSystem_Concept instance
   */
  public static CodeSystem_Concept copyOf(CodeSystem_Concept instance) {
    if (instance instanceof ImmutableCodeSystem_Concept) {
      return (ImmutableCodeSystem_Concept) instance;
    }
    return ImmutableCodeSystem_Concept.builder()
        .designation(instance.designation())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .code(instance.code())
        .concept(instance.concept())
        .definition(instance.definition())
        .property(instance.property())
        .id(instance.id())
        .display(instance.display())
        .build();
  }

  /**
   * Creates a builder for {@link CodeSystem_Concept CodeSystem_Concept}.
   * <pre>
   * ImmutableCodeSystem_Concept.builder()
   *    .designation(List&amp;lt;com.fhir.CodeSystem_Designation&amp;gt;) // optional {@link CodeSystem_Concept#designation() designation}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Concept#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Concept#extension() extension}
   *    .code(com.fhir.code) // optional {@link CodeSystem_Concept#code() code}
   *    .concept(List&amp;lt;com.fhir.CodeSystem_Concept&amp;gt;) // optional {@link CodeSystem_Concept#concept() concept}
   *    .definition(String) // optional {@link CodeSystem_Concept#definition() definition}
   *    .property(List&amp;lt;com.fhir.CodeSystem_Property1&amp;gt;) // optional {@link CodeSystem_Concept#property() property}
   *    .id(String) // optional {@link CodeSystem_Concept#id() id}
   *    .display(String) // optional {@link CodeSystem_Concept#display() display}
   *    .build();
   * </pre>
   * @return A new CodeSystem_Concept builder
   */
  public static ImmutableCodeSystem_Concept.Builder builder() {
    return new ImmutableCodeSystem_Concept.Builder();
  }

  /**
   * Builds instances of type {@link CodeSystem_Concept CodeSystem_Concept}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CodeSystem_Concept", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DESIGNATION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_CONCEPT = 0x10L;
    private static final long OPT_BIT_DEFINITION = 0x20L;
    private static final long OPT_BIT_PROPERTY = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_DISPLAY = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Designation> designation;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code code;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Concept> concept;
    private @javax.annotation.Nullable java.lang.String definition;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Property1> property;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String display;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#designation() designation} to designation.
     * @param designation The value for designation
     * @return {@code this} builder for chained invocation
     */
    public final Builder designation(java.util.List<com.fhir.CodeSystem_Designation> designation) {
      checkNotIsSet(designationIsSet(), "designation");
      this.designation = java.util.Objects.requireNonNull(designation, "designation");
      optBits |= OPT_BIT_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#designation() designation} to designation.
     * @param designation The value for designation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("designation")
    public final Builder designation(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Designation>> designation) {
      checkNotIsSet(designationIsSet(), "designation");
      this.designation = designation.orElse(null);
      optBits |= OPT_BIT_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem_Concept#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem_Concept#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Concept#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Concept#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for chained invocation
     */
    public final Builder concept(java.util.List<com.fhir.CodeSystem_Concept> concept) {
      checkNotIsSet(conceptIsSet(), "concept");
      this.concept = java.util.Objects.requireNonNull(concept, "concept");
      optBits |= OPT_BIT_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("concept")
    public final Builder concept(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Concept>> concept) {
      checkNotIsSet(conceptIsSet(), "concept");
      this.concept = concept.orElse(null);
      optBits |= OPT_BIT_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(java.lang.String definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = java.util.Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public final Builder definition(java.util.Optional<java.lang.String> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(java.util.List<com.fhir.CodeSystem_Property1> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = java.util.Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("property")
    public final Builder property(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Property1>> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Concept#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Concept#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for chained invocation
     */
    public final Builder display(java.lang.String display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = java.util.Objects.requireNonNull(display, "display");
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    public final Builder display(java.util.Optional<java.lang.String> display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = display.orElse(null);
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Builds a new {@link CodeSystem_Concept CodeSystem_Concept}.
     * @return An immutable instance of CodeSystem_Concept
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CodeSystem_Concept build() {
      return new ImmutableCodeSystem_Concept(designation, modifierExtension, extension, code, concept, definition, property, id, display);
    }

    private boolean designationIsSet() {
      return (optBits & OPT_BIT_DESIGNATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean conceptIsSet() {
      return (optBits & OPT_BIT_CONCEPT) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CodeSystem_Concept is strict, attribute is already set: ".concat(name));
    }
  }
}

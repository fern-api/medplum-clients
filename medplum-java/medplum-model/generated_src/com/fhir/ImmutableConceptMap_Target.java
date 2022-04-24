//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ConceptMap_Target}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConceptMap_Target.builder()}.
 */
@org.immutables.value.Generated(from = "ConceptMap_Target", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConceptMap_Target implements com.fhir.ConceptMap_Target {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.code code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String comment;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_DependsOn> product;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Conceptmap_targetEquivalence equivalence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_DependsOn> dependsOn;
  private final @javax.annotation.Nullable java.lang.String display;

  private ImmutableConceptMap_Target(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.code code,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String comment,
      @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_DependsOn> product,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Conceptmap_targetEquivalence equivalence,
      @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_DependsOn> dependsOn,
      @javax.annotation.Nullable java.lang.String display) {
    this.id = id;
    this.code = code;
    this.extension = extension;
    this.comment = comment;
    this.product = product;
    this.modifierExtension = modifierExtension;
    this.equivalence = equivalence;
    this.dependsOn = dependsOn;
    this.display = display;
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.code> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code comment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comment")
  @Override
  public java.util.Optional<java.lang.String> comment() {
    return java.util.Optional.ofNullable(comment);
  }

  /**
   * @return The value of the {@code product} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("product")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ConceptMap_DependsOn>> product() {
    return java.util.Optional.ofNullable(product);
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
   * @return The value of the {@code equivalence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("equivalence")
  @Override
  public java.util.Optional<com.fhir.Conceptmap_targetEquivalence> equivalence() {
    return java.util.Optional.ofNullable(equivalence);
  }

  /**
   * @return The value of the {@code dependsOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ConceptMap_DependsOn>> dependsOn() {
    return java.util.Optional.ofNullable(dependsOn);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableConceptMap_Target(
        newValue,
        this.code,
        this.extension,
        this.comment,
        this.product,
        this.modifierExtension,
        this.equivalence,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableConceptMap_Target(
        value,
        this.code,
        this.extension,
        this.comment,
        this.product,
        this.modifierExtension,
        this.equivalence,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withCode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        newValue,
        this.extension,
        this.comment,
        this.product,
        this.modifierExtension,
        this.equivalence,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Target withCode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        value,
        this.extension,
        this.comment,
        this.product,
        this.modifierExtension,
        this.equivalence,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        newValue,
        this.comment,
        this.product,
        this.modifierExtension,
        this.equivalence,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Target withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        value,
        this.comment,
        this.product,
        this.modifierExtension,
        this.equivalence,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withComment(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "comment");
    if (java.util.Objects.equals(this.comment, newValue)) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        this.extension,
        newValue,
        this.product,
        this.modifierExtension,
        this.equivalence,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withComment(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.comment, value)) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        this.extension,
        value,
        this.product,
        this.modifierExtension,
        this.equivalence,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#product() product} attribute.
   * @param value The value for product
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withProduct(java.util.List<com.fhir.ConceptMap_DependsOn> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_DependsOn> newValue = java.util.Objects.requireNonNull(value, "product");
    if (this.product == newValue) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        this.extension,
        this.comment,
        newValue,
        this.modifierExtension,
        this.equivalence,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#product() product} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for product
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Target withProduct(java.util.Optional<? extends java.util.List<com.fhir.ConceptMap_DependsOn>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_DependsOn> value = optional.orElse(null);
    if (this.product == value) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        this.extension,
        this.comment,
        value,
        this.modifierExtension,
        this.equivalence,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        this.extension,
        this.comment,
        this.product,
        newValue,
        this.equivalence,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Target withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        this.extension,
        this.comment,
        this.product,
        value,
        this.equivalence,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#equivalence() equivalence} attribute.
   * @param value The value for equivalence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withEquivalence(com.fhir.Conceptmap_targetEquivalence value) {
    @javax.annotation.Nullable com.fhir.Conceptmap_targetEquivalence newValue = java.util.Objects.requireNonNull(value, "equivalence");
    if (this.equivalence == newValue) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        this.extension,
        this.comment,
        this.product,
        this.modifierExtension,
        newValue,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#equivalence() equivalence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for equivalence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Target withEquivalence(java.util.Optional<? extends com.fhir.Conceptmap_targetEquivalence> optional) {
    @javax.annotation.Nullable com.fhir.Conceptmap_targetEquivalence value = optional.orElse(null);
    if (this.equivalence == value) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        this.extension,
        this.comment,
        this.product,
        this.modifierExtension,
        value,
        this.dependsOn,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#dependsOn() dependsOn} attribute.
   * @param value The value for dependsOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withDependsOn(java.util.List<com.fhir.ConceptMap_DependsOn> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_DependsOn> newValue = java.util.Objects.requireNonNull(value, "dependsOn");
    if (this.dependsOn == newValue) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        this.extension,
        this.comment,
        this.product,
        this.modifierExtension,
        this.equivalence,
        newValue,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#dependsOn() dependsOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dependsOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Target withDependsOn(java.util.Optional<? extends java.util.List<com.fhir.ConceptMap_DependsOn>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_DependsOn> value = optional.orElse(null);
    if (this.dependsOn == value) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        this.extension,
        this.comment,
        this.product,
        this.modifierExtension,
        this.equivalence,
        value,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withDisplay(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "display");
    if (java.util.Objects.equals(this.display, newValue)) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        this.extension,
        this.comment,
        this.product,
        this.modifierExtension,
        this.equivalence,
        this.dependsOn,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withDisplay(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.display, value)) return this;
    return new ImmutableConceptMap_Target(
        this.id,
        this.code,
        this.extension,
        this.comment,
        this.product,
        this.modifierExtension,
        this.equivalence,
        this.dependsOn,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConceptMap_Target} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConceptMap_Target
        && equalTo((ImmutableConceptMap_Target) another);
  }

  private boolean equalTo(ImmutableConceptMap_Target another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(comment, another.comment)
        && java.util.Objects.equals(product, another.product)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(equivalence, another.equivalence)
        && java.util.Objects.equals(dependsOn, another.dependsOn)
        && java.util.Objects.equals(display, another.display);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code code}, {@code extension}, {@code comment}, {@code product}, {@code modifierExtension}, {@code equivalence}, {@code dependsOn}, {@code display}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(comment);
    h += (h << 5) + java.util.Objects.hashCode(product);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(equivalence);
    h += (h << 5) + java.util.Objects.hashCode(dependsOn);
    h += (h << 5) + java.util.Objects.hashCode(display);
    return h;
  }

  /**
   * Prints the immutable value {@code ConceptMap_Target} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ConceptMap_Target{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (code != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (comment != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (product != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("product=").append(product);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (equivalence != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("equivalence=").append(equivalence);
    }
    if (dependsOn != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("dependsOn=").append(dependsOn);
    }
    if (display != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("display=").append(display);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ConceptMap_Target", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ConceptMap_Target {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> comment = java.util.Optional.empty();
    boolean commentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ConceptMap_DependsOn>> product = java.util.Optional.empty();
    boolean productIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Conceptmap_targetEquivalence> equivalence = java.util.Optional.empty();
    boolean equivalenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ConceptMap_DependsOn>> dependsOn = java.util.Optional.empty();
    boolean dependsOnIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> display = java.util.Optional.empty();
    boolean displayIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public void setComment(java.util.Optional<java.lang.String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("product")
    public void setProduct(java.util.Optional<java.util.List<com.fhir.ConceptMap_DependsOn>> product) {
      this.product = product;
      this.productIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("equivalence")
    public void setEquivalence(java.util.Optional<com.fhir.Conceptmap_targetEquivalence> equivalence) {
      this.equivalence = equivalence;
      this.equivalenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
    public void setDependsOn(java.util.Optional<java.util.List<com.fhir.ConceptMap_DependsOn>> dependsOn) {
      this.dependsOn = dependsOn;
      this.dependsOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    public void setDisplay(java.util.Optional<java.lang.String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ConceptMap_DependsOn>> product() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Conceptmap_targetEquivalence> equivalence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ConceptMap_DependsOn>> dependsOn() { throw new UnsupportedOperationException(); }
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
  static ImmutableConceptMap_Target fromJson(Json json) {
    ImmutableConceptMap_Target.Builder builder = ImmutableConceptMap_Target.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.productIsSet) {
      builder.product(json.product);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.equivalenceIsSet) {
      builder.equivalence(json.equivalence);
    }
    if (json.dependsOnIsSet) {
      builder.dependsOn(json.dependsOn);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    return (ImmutableConceptMap_Target) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConceptMap_Target} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ConceptMap_Target instance
   */
  public static ConceptMap_Target copyOf(ConceptMap_Target instance) {
    if (instance instanceof ImmutableConceptMap_Target) {
      return (ImmutableConceptMap_Target) instance;
    }
    return ImmutableConceptMap_Target.builder()
        .id(instance.id())
        .code(instance.code())
        .extension(instance.extension())
        .comment(instance.comment())
        .product(instance.product())
        .modifierExtension(instance.modifierExtension())
        .equivalence(instance.equivalence())
        .dependsOn(instance.dependsOn())
        .display(instance.display())
        .build();
  }

  /**
   * Creates a builder for {@link ConceptMap_Target ConceptMap_Target}.
   * <pre>
   * ImmutableConceptMap_Target.builder()
   *    .id(String) // optional {@link ConceptMap_Target#id() id}
   *    .code(com.fhir.code) // optional {@link ConceptMap_Target#code() code}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ConceptMap_Target#extension() extension}
   *    .comment(String) // optional {@link ConceptMap_Target#comment() comment}
   *    .product(List&amp;lt;com.fhir.ConceptMap_DependsOn&amp;gt;) // optional {@link ConceptMap_Target#product() product}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ConceptMap_Target#modifierExtension() modifierExtension}
   *    .equivalence(com.fhir.Conceptmap_targetEquivalence) // optional {@link ConceptMap_Target#equivalence() equivalence}
   *    .dependsOn(List&amp;lt;com.fhir.ConceptMap_DependsOn&amp;gt;) // optional {@link ConceptMap_Target#dependsOn() dependsOn}
   *    .display(String) // optional {@link ConceptMap_Target#display() display}
   *    .build();
   * </pre>
   * @return A new ConceptMap_Target builder
   */
  public static ImmutableConceptMap_Target.Builder builder() {
    return new ImmutableConceptMap_Target.Builder();
  }

  /**
   * Builds instances of type {@link ConceptMap_Target ConceptMap_Target}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ConceptMap_Target", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_COMMENT = 0x8L;
    private static final long OPT_BIT_PRODUCT = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_EQUIVALENCE = 0x40L;
    private static final long OPT_BIT_DEPENDS_ON = 0x80L;
    private static final long OPT_BIT_DISPLAY = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.code code;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String comment;
    private @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_DependsOn> product;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Conceptmap_targetEquivalence equivalence;
    private @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_DependsOn> dependsOn;
    private @javax.annotation.Nullable java.lang.String display;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_Target#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_Target#code() code} to code.
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
     * Initializes the optional value {@link ConceptMap_Target#code() code} to code.
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
     * Initializes the optional value {@link ConceptMap_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap_Target#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(java.lang.String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = java.util.Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public final Builder comment(java.util.Optional<java.lang.String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#product() product} to product.
     * @param product The value for product
     * @return {@code this} builder for chained invocation
     */
    public final Builder product(java.util.List<com.fhir.ConceptMap_DependsOn> product) {
      checkNotIsSet(productIsSet(), "product");
      this.product = java.util.Objects.requireNonNull(product, "product");
      optBits |= OPT_BIT_PRODUCT;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#product() product} to product.
     * @param product The value for product
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("product")
    public final Builder product(java.util.Optional<? extends java.util.List<com.fhir.ConceptMap_DependsOn>> product) {
      checkNotIsSet(productIsSet(), "product");
      this.product = product.orElse(null);
      optBits |= OPT_BIT_PRODUCT;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap_Target#equivalence() equivalence} to equivalence.
     * @param equivalence The value for equivalence
     * @return {@code this} builder for chained invocation
     */
    public final Builder equivalence(com.fhir.Conceptmap_targetEquivalence equivalence) {
      checkNotIsSet(equivalenceIsSet(), "equivalence");
      this.equivalence = java.util.Objects.requireNonNull(equivalence, "equivalence");
      optBits |= OPT_BIT_EQUIVALENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#equivalence() equivalence} to equivalence.
     * @param equivalence The value for equivalence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("equivalence")
    public final Builder equivalence(java.util.Optional<? extends com.fhir.Conceptmap_targetEquivalence> equivalence) {
      checkNotIsSet(equivalenceIsSet(), "equivalence");
      this.equivalence = equivalence.orElse(null);
      optBits |= OPT_BIT_EQUIVALENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#dependsOn() dependsOn} to dependsOn.
     * @param dependsOn The value for dependsOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder dependsOn(java.util.List<com.fhir.ConceptMap_DependsOn> dependsOn) {
      checkNotIsSet(dependsOnIsSet(), "dependsOn");
      this.dependsOn = java.util.Objects.requireNonNull(dependsOn, "dependsOn");
      optBits |= OPT_BIT_DEPENDS_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#dependsOn() dependsOn} to dependsOn.
     * @param dependsOn The value for dependsOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
    public final Builder dependsOn(java.util.Optional<? extends java.util.List<com.fhir.ConceptMap_DependsOn>> dependsOn) {
      checkNotIsSet(dependsOnIsSet(), "dependsOn");
      this.dependsOn = dependsOn.orElse(null);
      optBits |= OPT_BIT_DEPENDS_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#display() display} to display.
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
     * Initializes the optional value {@link ConceptMap_Target#display() display} to display.
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
     * Builds a new {@link ConceptMap_Target ConceptMap_Target}.
     * @return An immutable instance of ConceptMap_Target
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ConceptMap_Target build() {
      return new ImmutableConceptMap_Target(id, code, extension, comment, product, modifierExtension, equivalence, dependsOn, display);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean productIsSet() {
      return (optBits & OPT_BIT_PRODUCT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean equivalenceIsSet() {
      return (optBits & OPT_BIT_EQUIVALENCE) != 0;
    }

    private boolean dependsOnIsSet() {
      return (optBits & OPT_BIT_DEPENDS_ON) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ConceptMap_Target is strict, attribute is already set: ".concat(name));
    }
  }
}

//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ConceptMap_Group}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConceptMap_Group.builder()}.
 */
@org.immutables.value.Generated(from = "ConceptMap_Group", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConceptMap_Group implements com.fhir.ConceptMap_Group {
  private final @javax.annotation.Nullable com.fhir.ConceptMap_Unmapped unmapped;
  private final @javax.annotation.Nullable java.lang.String targetVersion;
  private final java.util.List<com.fhir.ConceptMap_Element> element;
  private final @javax.annotation.Nullable com.fhir.uri source;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String sourceVersion;
  private final @javax.annotation.Nullable com.fhir.uri target;

  private ImmutableConceptMap_Group(
      @javax.annotation.Nullable com.fhir.ConceptMap_Unmapped unmapped,
      @javax.annotation.Nullable java.lang.String targetVersion,
      java.util.List<com.fhir.ConceptMap_Element> element,
      @javax.annotation.Nullable com.fhir.uri source,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String sourceVersion,
      @javax.annotation.Nullable com.fhir.uri target) {
    this.unmapped = unmapped;
    this.targetVersion = targetVersion;
    this.element = element;
    this.source = source;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.sourceVersion = sourceVersion;
    this.target = target;
  }

  /**
   * @return The value of the {@code unmapped} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("unmapped")
  @Override
  public java.util.Optional<com.fhir.ConceptMap_Unmapped> unmapped() {
    return java.util.Optional.ofNullable(unmapped);
  }

  /**
   * @return The value of the {@code targetVersion} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
  @Override
  public java.util.Optional<java.lang.String> targetVersion() {
    return java.util.Optional.ofNullable(targetVersion);
  }

  /**
   * @return The value of the {@code element} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("element")
  @Override
  public java.util.List<com.fhir.ConceptMap_Element> element() {
    return element;
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @Override
  public java.util.Optional<com.fhir.uri> source() {
    return java.util.Optional.ofNullable(source);
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
   * @return The value of the {@code sourceVersion} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceVersion")
  @Override
  public java.util.Optional<java.lang.String> sourceVersion() {
    return java.util.Optional.ofNullable(sourceVersion);
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("target")
  @Override
  public java.util.Optional<com.fhir.uri> target() {
    return java.util.Optional.ofNullable(target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#unmapped() unmapped} attribute.
   * @param value The value for unmapped
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withUnmapped(com.fhir.ConceptMap_Unmapped value) {
    @javax.annotation.Nullable com.fhir.ConceptMap_Unmapped newValue = java.util.Objects.requireNonNull(value, "unmapped");
    if (this.unmapped == newValue) return this;
    return new ImmutableConceptMap_Group(
        newValue,
        this.targetVersion,
        this.element,
        this.source,
        this.id,
        this.extension,
        this.modifierExtension,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#unmapped() unmapped} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unmapped
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Group withUnmapped(java.util.Optional<? extends com.fhir.ConceptMap_Unmapped> optional) {
    @javax.annotation.Nullable com.fhir.ConceptMap_Unmapped value = optional.orElse(null);
    if (this.unmapped == value) return this;
    return new ImmutableConceptMap_Group(
        value,
        this.targetVersion,
        this.element,
        this.source,
        this.id,
        this.extension,
        this.modifierExtension,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#targetVersion() targetVersion} attribute.
   * @param value The value for targetVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withTargetVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "targetVersion");
    if (java.util.Objects.equals(this.targetVersion, newValue)) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        newValue,
        this.element,
        this.source,
        this.id,
        this.extension,
        this.modifierExtension,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#targetVersion() targetVersion} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withTargetVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.targetVersion, value)) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        value,
        this.element,
        this.source,
        this.id,
        this.extension,
        this.modifierExtension,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ConceptMap_Group#element() element}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withElement(com.fhir.ConceptMap_Element... elements) {
    java.util.List<com.fhir.ConceptMap_Element> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        newValue,
        this.source,
        this.id,
        this.extension,
        this.modifierExtension,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ConceptMap_Group#element() element}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of element elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withElement(Iterable<? extends com.fhir.ConceptMap_Element> elements) {
    if (this.element == elements) return this;
    java.util.List<com.fhir.ConceptMap_Element> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        newValue,
        this.source,
        this.id,
        this.extension,
        this.modifierExtension,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withSource(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        this.element,
        newValue,
        this.id,
        this.extension,
        this.modifierExtension,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Group withSource(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        this.element,
        value,
        this.id,
        this.extension,
        this.modifierExtension,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        this.element,
        this.source,
        newValue,
        this.extension,
        this.modifierExtension,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        this.element,
        this.source,
        value,
        this.extension,
        this.modifierExtension,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        this.element,
        this.source,
        this.id,
        newValue,
        this.modifierExtension,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Group withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        this.element,
        this.source,
        this.id,
        value,
        this.modifierExtension,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        this.element,
        this.source,
        this.id,
        this.extension,
        newValue,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Group withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        this.element,
        this.source,
        this.id,
        this.extension,
        value,
        this.sourceVersion,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#sourceVersion() sourceVersion} attribute.
   * @param value The value for sourceVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withSourceVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "sourceVersion");
    if (java.util.Objects.equals(this.sourceVersion, newValue)) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        this.element,
        this.source,
        this.id,
        this.extension,
        this.modifierExtension,
        newValue,
        this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#sourceVersion() sourceVersion} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withSourceVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.sourceVersion, value)) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        this.element,
        this.source,
        this.id,
        this.extension,
        this.modifierExtension,
        value,
        this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withTarget(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        this.element,
        this.source,
        this.id,
        this.extension,
        this.modifierExtension,
        this.sourceVersion,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Group withTarget(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableConceptMap_Group(
        this.unmapped,
        this.targetVersion,
        this.element,
        this.source,
        this.id,
        this.extension,
        this.modifierExtension,
        this.sourceVersion,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConceptMap_Group} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConceptMap_Group
        && equalTo((ImmutableConceptMap_Group) another);
  }

  private boolean equalTo(ImmutableConceptMap_Group another) {
    return java.util.Objects.equals(unmapped, another.unmapped)
        && java.util.Objects.equals(targetVersion, another.targetVersion)
        && element.equals(another.element)
        && java.util.Objects.equals(source, another.source)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(sourceVersion, another.sourceVersion)
        && java.util.Objects.equals(target, another.target);
  }

  /**
   * Computes a hash code from attributes: {@code unmapped}, {@code targetVersion}, {@code element}, {@code source}, {@code id}, {@code extension}, {@code modifierExtension}, {@code sourceVersion}, {@code target}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(unmapped);
    h += (h << 5) + java.util.Objects.hashCode(targetVersion);
    h += (h << 5) + element.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(source);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(sourceVersion);
    h += (h << 5) + java.util.Objects.hashCode(target);
    return h;
  }

  /**
   * Prints the immutable value {@code ConceptMap_Group} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ConceptMap_Group{");
    if (unmapped != null) {
      builder.append("unmapped=").append(unmapped);
    }
    if (targetVersion != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("targetVersion=").append(targetVersion);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("element=").append(element);
    if (source != null) {
      builder.append(", ");
      builder.append("source=").append(source);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (sourceVersion != null) {
      builder.append(", ");
      builder.append("sourceVersion=").append(sourceVersion);
    }
    if (target != null) {
      builder.append(", ");
      builder.append("target=").append(target);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ConceptMap_Group", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ConceptMap_Group {
    @javax.annotation.Nullable java.util.Optional<com.fhir.ConceptMap_Unmapped> unmapped = java.util.Optional.empty();
    boolean unmappedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> targetVersion = java.util.Optional.empty();
    boolean targetVersionIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_Element> element = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> source = java.util.Optional.empty();
    boolean sourceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> sourceVersion = java.util.Optional.empty();
    boolean sourceVersionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> target = java.util.Optional.empty();
    boolean targetIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("unmapped")
    public void setUnmapped(java.util.Optional<com.fhir.ConceptMap_Unmapped> unmapped) {
      this.unmapped = unmapped;
      this.unmappedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
    public void setTargetVersion(java.util.Optional<java.lang.String> targetVersion) {
      this.targetVersion = targetVersion;
      this.targetVersionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("element")
    public void setElement(java.util.List<com.fhir.ConceptMap_Element> element) {
      this.element = element;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(java.util.Optional<com.fhir.uri> source) {
      this.source = source;
      this.sourceIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("sourceVersion")
    public void setSourceVersion(java.util.Optional<java.lang.String> sourceVersion) {
      this.sourceVersion = sourceVersion;
      this.sourceVersionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    public void setTarget(java.util.Optional<com.fhir.uri> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.ConceptMap_Unmapped> unmapped() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> targetVersion() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.ConceptMap_Element> element() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> source() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> sourceVersion() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> target() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableConceptMap_Group fromJson(Json json) {
    ImmutableConceptMap_Group.Builder builder = ImmutableConceptMap_Group.builder();
    if (json.unmappedIsSet) {
      builder.unmapped(json.unmapped);
    }
    if (json.targetVersionIsSet) {
      builder.targetVersion(json.targetVersion);
    }
    if (json.element != null) {
      builder.addAllElement(json.element);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
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
    if (json.sourceVersionIsSet) {
      builder.sourceVersion(json.sourceVersion);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    return (ImmutableConceptMap_Group) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConceptMap_Group} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ConceptMap_Group instance
   */
  public static ConceptMap_Group copyOf(ConceptMap_Group instance) {
    if (instance instanceof ImmutableConceptMap_Group) {
      return (ImmutableConceptMap_Group) instance;
    }
    return ImmutableConceptMap_Group.builder()
        .unmapped(instance.unmapped())
        .targetVersion(instance.targetVersion())
        .addAllElement(instance.element())
        .source(instance.source())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .sourceVersion(instance.sourceVersion())
        .target(instance.target())
        .build();
  }

  /**
   * Creates a builder for {@link ConceptMap_Group ConceptMap_Group}.
   * <pre>
   * ImmutableConceptMap_Group.builder()
   *    .unmapped(com.fhir.ConceptMap_Unmapped) // optional {@link ConceptMap_Group#unmapped() unmapped}
   *    .targetVersion(String) // optional {@link ConceptMap_Group#targetVersion() targetVersion}
   *    .addElement|addAllElement(com.fhir.ConceptMap_Element) // {@link ConceptMap_Group#element() element} elements
   *    .source(com.fhir.uri) // optional {@link ConceptMap_Group#source() source}
   *    .id(String) // optional {@link ConceptMap_Group#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ConceptMap_Group#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ConceptMap_Group#modifierExtension() modifierExtension}
   *    .sourceVersion(String) // optional {@link ConceptMap_Group#sourceVersion() sourceVersion}
   *    .target(com.fhir.uri) // optional {@link ConceptMap_Group#target() target}
   *    .build();
   * </pre>
   * @return A new ConceptMap_Group builder
   */
  public static ImmutableConceptMap_Group.Builder builder() {
    return new ImmutableConceptMap_Group.Builder();
  }

  /**
   * Builds instances of type {@link ConceptMap_Group ConceptMap_Group}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ConceptMap_Group", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_UNMAPPED = 0x1L;
    private static final long OPT_BIT_TARGET_VERSION = 0x2L;
    private static final long OPT_BIT_SOURCE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_SOURCE_VERSION = 0x40L;
    private static final long OPT_BIT_TARGET = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.ConceptMap_Unmapped unmapped;
    private @javax.annotation.Nullable java.lang.String targetVersion;
    private final java.util.List<com.fhir.ConceptMap_Element> element = new java.util.ArrayList<com.fhir.ConceptMap_Element>();
    private @javax.annotation.Nullable com.fhir.uri source;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String sourceVersion;
    private @javax.annotation.Nullable com.fhir.uri target;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#unmapped() unmapped} to unmapped.
     * @param unmapped The value for unmapped
     * @return {@code this} builder for chained invocation
     */
    public final Builder unmapped(com.fhir.ConceptMap_Unmapped unmapped) {
      checkNotIsSet(unmappedIsSet(), "unmapped");
      this.unmapped = java.util.Objects.requireNonNull(unmapped, "unmapped");
      optBits |= OPT_BIT_UNMAPPED;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#unmapped() unmapped} to unmapped.
     * @param unmapped The value for unmapped
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unmapped")
    public final Builder unmapped(java.util.Optional<? extends com.fhir.ConceptMap_Unmapped> unmapped) {
      checkNotIsSet(unmappedIsSet(), "unmapped");
      this.unmapped = unmapped.orElse(null);
      optBits |= OPT_BIT_UNMAPPED;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#targetVersion() targetVersion} to targetVersion.
     * @param targetVersion The value for targetVersion
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetVersion(java.lang.String targetVersion) {
      checkNotIsSet(targetVersionIsSet(), "targetVersion");
      this.targetVersion = java.util.Objects.requireNonNull(targetVersion, "targetVersion");
      optBits |= OPT_BIT_TARGET_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#targetVersion() targetVersion} to targetVersion.
     * @param targetVersion The value for targetVersion
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
    public final Builder targetVersion(java.util.Optional<java.lang.String> targetVersion) {
      checkNotIsSet(targetVersionIsSet(), "targetVersion");
      this.targetVersion = targetVersion.orElse(null);
      optBits |= OPT_BIT_TARGET_VERSION;
      return this;
    }

    /**
     * Adds one element to {@link ConceptMap_Group#element() element} list.
     * @param element A element element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addElement(com.fhir.ConceptMap_Element element) {
      this.element.add(java.util.Objects.requireNonNull(element, "element element"));
      return this;
    }

    /**
     * Adds elements to {@link ConceptMap_Group#element() element} list.
     * @param elements An array of element elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addElement(com.fhir.ConceptMap_Element... elements) {
      for (com.fhir.ConceptMap_Element element : elements) {
        this.element.add(java.util.Objects.requireNonNull(element, "element element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ConceptMap_Group#element() element} list.
     * @param elements An iterable of element elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllElement(Iterable<? extends com.fhir.ConceptMap_Element> elements) {
      for (com.fhir.ConceptMap_Element element : elements) {
        this.element.add(java.util.Objects.requireNonNull(element, "element element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(com.fhir.uri source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = java.util.Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public final Builder source(java.util.Optional<? extends com.fhir.uri> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_Group#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_Group#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap_Group#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap_Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap_Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap_Group#sourceVersion() sourceVersion} to sourceVersion.
     * @param sourceVersion The value for sourceVersion
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceVersion(java.lang.String sourceVersion) {
      checkNotIsSet(sourceVersionIsSet(), "sourceVersion");
      this.sourceVersion = java.util.Objects.requireNonNull(sourceVersion, "sourceVersion");
      optBits |= OPT_BIT_SOURCE_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#sourceVersion() sourceVersion} to sourceVersion.
     * @param sourceVersion The value for sourceVersion
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceVersion")
    public final Builder sourceVersion(java.util.Optional<java.lang.String> sourceVersion) {
      checkNotIsSet(sourceVersionIsSet(), "sourceVersion");
      this.sourceVersion = sourceVersion.orElse(null);
      optBits |= OPT_BIT_SOURCE_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(com.fhir.uri target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = java.util.Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    public final Builder target(java.util.Optional<? extends com.fhir.uri> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Builds a new {@link ConceptMap_Group ConceptMap_Group}.
     * @return An immutable instance of ConceptMap_Group
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ConceptMap_Group build() {
      return new ImmutableConceptMap_Group(
          unmapped,
          targetVersion,
          createUnmodifiableList(true, element),
          source,
          id,
          extension,
          modifierExtension,
          sourceVersion,
          target);
    }

    private boolean unmappedIsSet() {
      return (optBits & OPT_BIT_UNMAPPED) != 0;
    }

    private boolean targetVersionIsSet() {
      return (optBits & OPT_BIT_TARGET_VERSION) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
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

    private boolean sourceVersionIsSet() {
      return (optBits & OPT_BIT_SOURCE_VERSION) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ConceptMap_Group is strict, attribute is already set: ".concat(name));
    }
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}

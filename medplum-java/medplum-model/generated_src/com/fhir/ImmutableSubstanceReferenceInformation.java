//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link SubstanceReferenceInformation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceReferenceInformation.builder()}.
 */
@org.immutables.value.Generated(from = "SubstanceReferenceInformation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceReferenceInformation implements com.fhir.SubstanceReferenceInformation {
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Gene> gene;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Target> target;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement> geneElement;
  private final @javax.annotation.Nullable java.lang.String comment;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Classification> classification;

  private ImmutableSubstanceReferenceInformation(
      @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Gene> gene,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Target> target,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement> geneElement,
      @javax.annotation.Nullable java.lang.String comment,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Classification> classification) {
    this.gene = gene;
    this.extension = extension;
    this.target = target;
    this.resourceType = resourceType;
    this.contained = contained;
    this.geneElement = geneElement;
    this.comment = comment;
    this.text = text;
    this.implicitRules = implicitRules;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
    this.language = language;
    this.id = id;
    this.classification = classification;
  }

  /**
   * @return The value of the {@code gene} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("gene")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_Gene>> gene() {
    return java.util.Optional.ofNullable(gene);
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
   * @return The value of the {@code target} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("target")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_Target>> target() {
    return java.util.Optional.ofNullable(target);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code geneElement} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("geneElement")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement>> geneElement() {
    return java.util.Optional.ofNullable(geneElement);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code classification} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("classification")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_Classification>> classification() {
    return java.util.Optional.ofNullable(classification);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#gene() gene} attribute.
   * @param value The value for gene
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withGene(java.util.List<com.fhir.SubstanceReferenceInformation_Gene> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Gene> newValue = java.util.Objects.requireNonNull(value, "gene");
    if (this.gene == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        newValue,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#gene() gene} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gene
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withGene(java.util.Optional<? extends java.util.List<com.fhir.SubstanceReferenceInformation_Gene>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Gene> value = optional.orElse(null);
    if (this.gene == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        value,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        newValue,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        value,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withTarget(java.util.List<com.fhir.SubstanceReferenceInformation_Target> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Target> newValue = java.util.Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        newValue,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withTarget(java.util.Optional<? extends java.util.List<com.fhir.SubstanceReferenceInformation_Target>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Target> value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        value,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubstanceReferenceInformation#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        newValue,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        newValue,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        value,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#geneElement() geneElement} attribute.
   * @param value The value for geneElement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withGeneElement(java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement> newValue = java.util.Objects.requireNonNull(value, "geneElement");
    if (this.geneElement == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        newValue,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#geneElement() geneElement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for geneElement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withGeneElement(java.util.Optional<? extends java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement> value = optional.orElse(null);
    if (this.geneElement == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        value,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withComment(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "comment");
    if (java.util.Objects.equals(this.comment, newValue)) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        newValue,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withComment(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.comment, value)) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        value,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        newValue,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        value,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        newValue,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        value,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        newValue,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        value,
        this.modifierExtension,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        newValue,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        value,
        this.language,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        newValue,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        value,
        this.id,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        newValue,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        value,
        this.classification);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#classification() classification} attribute.
   * @param value The value for classification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withClassification(java.util.List<com.fhir.SubstanceReferenceInformation_Classification> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Classification> newValue = java.util.Objects.requireNonNull(value, "classification");
    if (this.classification == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#classification() classification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for classification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withClassification(java.util.Optional<? extends java.util.List<com.fhir.SubstanceReferenceInformation_Classification>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Classification> value = optional.orElse(null);
    if (this.classification == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.gene,
        this.extension,
        this.target,
        this.resourceType,
        this.contained,
        this.geneElement,
        this.comment,
        this.text,
        this.implicitRules,
        this.meta,
        this.modifierExtension,
        this.language,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceReferenceInformation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceReferenceInformation
        && equalTo((ImmutableSubstanceReferenceInformation) another);
  }

  private boolean equalTo(ImmutableSubstanceReferenceInformation another) {
    return java.util.Objects.equals(gene, another.gene)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(target, another.target)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(geneElement, another.geneElement)
        && java.util.Objects.equals(comment, another.comment)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(classification, another.classification);
  }

  /**
   * Computes a hash code from attributes: {@code gene}, {@code extension}, {@code target}, {@code resourceType}, {@code contained}, {@code geneElement}, {@code comment}, {@code text}, {@code implicitRules}, {@code meta}, {@code modifierExtension}, {@code language}, {@code id}, {@code classification}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(gene);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(target);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(geneElement);
    h += (h << 5) + java.util.Objects.hashCode(comment);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(classification);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceReferenceInformation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("SubstanceReferenceInformation{");
    if (gene != null) {
      builder.append("gene=").append(gene);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (target != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("target=").append(target);
    }
    if (builder.length() > 30) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (geneElement != null) {
      builder.append(", ");
      builder.append("geneElement=").append(geneElement);
    }
    if (comment != null) {
      builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (classification != null) {
      builder.append(", ");
      builder.append("classification=").append(classification);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "SubstanceReferenceInformation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.SubstanceReferenceInformation {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_Gene>> gene = java.util.Optional.empty();
    boolean geneIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_Target>> target = java.util.Optional.empty();
    boolean targetIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement>> geneElement = java.util.Optional.empty();
    boolean geneElementIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> comment = java.util.Optional.empty();
    boolean commentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_Classification>> classification = java.util.Optional.empty();
    boolean classificationIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("gene")
    public void setGene(java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_Gene>> gene) {
      this.gene = gene;
      this.geneIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    public void setTarget(java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_Target>> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("geneElement")
    public void setGeneElement(java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement>> geneElement) {
      this.geneElement = geneElement;
      this.geneElementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public void setComment(java.util.Optional<java.lang.String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("classification")
    public void setClassification(java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_Classification>> classification) {
      this.classification = classification;
      this.classificationIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_Gene>> gene() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_Target>> target() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement>> geneElement() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstanceReferenceInformation_Classification>> classification() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceReferenceInformation fromJson(Json json) {
    ImmutableSubstanceReferenceInformation.Builder builder = ((ImmutableSubstanceReferenceInformation.Builder) ImmutableSubstanceReferenceInformation.builder());
    if (json.geneIsSet) {
      builder.gene(json.gene);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.geneElementIsSet) {
      builder.geneElement(json.geneElement);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.classificationIsSet) {
      builder.classification(json.classification);
    }
    return (ImmutableSubstanceReferenceInformation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceReferenceInformation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceReferenceInformation instance
   */
  public static SubstanceReferenceInformation copyOf(SubstanceReferenceInformation instance) {
    if (instance instanceof ImmutableSubstanceReferenceInformation) {
      return (ImmutableSubstanceReferenceInformation) instance;
    }
    return ((ImmutableSubstanceReferenceInformation.Builder) ImmutableSubstanceReferenceInformation.builder())
        .gene(instance.gene())
        .extension(instance.extension())
        .target(instance.target())
        .resourceType(instance.resourceType())
        .contained(instance.contained())
        .geneElement(instance.geneElement())
        .comment(instance.comment())
        .text(instance.text())
        .implicitRules(instance.implicitRules())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .language(instance.language())
        .id(instance.id())
        .classification(instance.classification())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceReferenceInformation SubstanceReferenceInformation}.
   * <pre>
   * ImmutableSubstanceReferenceInformation.builder()
   *    .gene(List&amp;lt;com.fhir.SubstanceReferenceInformation_Gene&amp;gt;) // optional {@link SubstanceReferenceInformation#gene() gene}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceReferenceInformation#extension() extension}
   *    .target(List&amp;lt;com.fhir.SubstanceReferenceInformation_Target&amp;gt;) // optional {@link SubstanceReferenceInformation#target() target}
   *    .resourceType(String) // required {@link SubstanceReferenceInformation#resourceType() resourceType}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link SubstanceReferenceInformation#contained() contained}
   *    .geneElement(List&amp;lt;com.fhir.SubstanceReferenceInformation_GeneElement&amp;gt;) // optional {@link SubstanceReferenceInformation#geneElement() geneElement}
   *    .comment(String) // optional {@link SubstanceReferenceInformation#comment() comment}
   *    .text(com.fhir.Narrative) // optional {@link SubstanceReferenceInformation#text() text}
   *    .implicitRules(com.fhir.uri) // optional {@link SubstanceReferenceInformation#implicitRules() implicitRules}
   *    .meta(com.fhir.Meta) // optional {@link SubstanceReferenceInformation#meta() meta}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceReferenceInformation#modifierExtension() modifierExtension}
   *    .language(com.fhir.code) // optional {@link SubstanceReferenceInformation#language() language}
   *    .id(com.fhir.id) // optional {@link SubstanceReferenceInformation#id() id}
   *    .classification(List&amp;lt;com.fhir.SubstanceReferenceInformation_Classification&amp;gt;) // optional {@link SubstanceReferenceInformation#classification() classification}
   *    .build();
   * </pre>
   * @return A new SubstanceReferenceInformation builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSubstanceReferenceInformation.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceReferenceInformation SubstanceReferenceInformation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "SubstanceReferenceInformation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_GENE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_TARGET = 0x4L;
    private static final long OPT_BIT_CONTAINED = 0x8L;
    private static final long OPT_BIT_GENE_ELEMENT = 0x10L;
    private static final long OPT_BIT_COMMENT = 0x20L;
    private static final long OPT_BIT_TEXT = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_META = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_CLASSIFICATION = 0x1000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Gene> gene;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Target> target;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement> geneElement;
    private @javax.annotation.Nullable java.lang.String comment;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstanceReferenceInformation_Classification> classification;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#gene() gene} to gene.
     * @param gene The value for gene
     * @return {@code this} builder for chained invocation
     */
    public final Builder gene(java.util.List<com.fhir.SubstanceReferenceInformation_Gene> gene) {
      checkNotIsSet(geneIsSet(), "gene");
      this.gene = java.util.Objects.requireNonNull(gene, "gene");
      optBits |= OPT_BIT_GENE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#gene() gene} to gene.
     * @param gene The value for gene
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gene")
    public final Builder gene(java.util.Optional<? extends java.util.List<com.fhir.SubstanceReferenceInformation_Gene>> gene) {
      checkNotIsSet(geneIsSet(), "gene");
      this.gene = gene.orElse(null);
      optBits |= OPT_BIT_GENE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(java.util.List<com.fhir.SubstanceReferenceInformation_Target> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = java.util.Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    public final Builder target(java.util.Optional<? extends java.util.List<com.fhir.SubstanceReferenceInformation_Target>> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the value for the {@link SubstanceReferenceInformation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(java.util.List<com.fhir.ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = java.util.Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public final Builder contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#geneElement() geneElement} to geneElement.
     * @param geneElement The value for geneElement
     * @return {@code this} builder for chained invocation
     */
    public final Builder geneElement(java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement> geneElement) {
      checkNotIsSet(geneElementIsSet(), "geneElement");
      this.geneElement = java.util.Objects.requireNonNull(geneElement, "geneElement");
      optBits |= OPT_BIT_GENE_ELEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#geneElement() geneElement} to geneElement.
     * @param geneElement The value for geneElement
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("geneElement")
    public final Builder geneElement(java.util.Optional<? extends java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement>> geneElement) {
      checkNotIsSet(geneElementIsSet(), "geneElement");
      this.geneElement = geneElement.orElse(null);
      optBits |= OPT_BIT_GENE_ELEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#comment() comment} to comment.
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
     * Initializes the optional value {@link SubstanceReferenceInformation#comment() comment} to comment.
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
     * Initializes the optional value {@link SubstanceReferenceInformation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(com.fhir.Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<? extends com.fhir.Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for chained invocation
     */
    public final Builder classification(java.util.List<com.fhir.SubstanceReferenceInformation_Classification> classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = java.util.Objects.requireNonNull(classification, "classification");
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("classification")
    public final Builder classification(java.util.Optional<? extends java.util.List<com.fhir.SubstanceReferenceInformation_Classification>> classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = classification.orElse(null);
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Builds a new {@link SubstanceReferenceInformation SubstanceReferenceInformation}.
     * @return An immutable instance of SubstanceReferenceInformation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.SubstanceReferenceInformation build() {
      checkRequiredAttributes();
      return new ImmutableSubstanceReferenceInformation(
          gene,
          extension,
          target,
          resourceType,
          contained,
          geneElement,
          comment,
          text,
          implicitRules,
          meta,
          modifierExtension,
          language,
          id,
          classification);
    }

    private boolean geneIsSet() {
      return (optBits & OPT_BIT_GENE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean geneElementIsSet() {
      return (optBits & OPT_BIT_GENE_ELEMENT) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean classificationIsSet() {
      return (optBits & OPT_BIT_CLASSIFICATION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of SubstanceReferenceInformation is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SubstanceReferenceInformation, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "SubstanceReferenceInformation", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SubstanceReferenceInformation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "SubstanceReferenceInformation", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#gene() gene} to gene.
     * @param gene The value for gene
     * @return {@code this} builder for chained invocation
     */
    BuildFinal gene(java.util.List<com.fhir.SubstanceReferenceInformation_Gene> gene);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#gene() gene} to gene.
     * @param gene The value for gene
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal gene(java.util.Optional<? extends java.util.List<com.fhir.SubstanceReferenceInformation_Gene>> gene);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    BuildFinal target(java.util.List<com.fhir.SubstanceReferenceInformation_Target> target);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal target(java.util.Optional<? extends java.util.List<com.fhir.SubstanceReferenceInformation_Target>> target);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#geneElement() geneElement} to geneElement.
     * @param geneElement The value for geneElement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal geneElement(java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement> geneElement);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#geneElement() geneElement} to geneElement.
     * @param geneElement The value for geneElement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal geneElement(java.util.Optional<? extends java.util.List<com.fhir.SubstanceReferenceInformation_GeneElement>> geneElement);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(java.lang.String comment);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(java.util.Optional<java.lang.String> comment);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal classification(java.util.List<com.fhir.SubstanceReferenceInformation_Classification> classification);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal classification(java.util.Optional<? extends java.util.List<com.fhir.SubstanceReferenceInformation_Classification>> classification);

    /**
     * Builds a new {@link SubstanceReferenceInformation SubstanceReferenceInformation}.
     * @return An immutable instance of SubstanceReferenceInformation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SubstanceReferenceInformation build();
  }
}

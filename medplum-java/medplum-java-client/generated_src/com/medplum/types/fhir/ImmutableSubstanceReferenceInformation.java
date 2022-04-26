package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link SubstanceReferenceInformation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceReferenceInformation.builder()}.
 */
@Generated(from = "SubstanceReferenceInformation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceReferenceInformation
    implements SubstanceReferenceInformation {
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<SubstanceReferenceInformation_GeneElement> geneElement;
  private final @Nullable List<SubstanceReferenceInformation_Gene> gene;
  private final @Nullable Narrative text;
  private final @Nullable Meta meta;
  private final @Nullable List<SubstanceReferenceInformation_Target> target;
  private final @Nullable Uri implicitRules;
  private final @Nullable String comment;
  private final String resourceType;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code language;
  private final @Nullable List<SubstanceReferenceInformation_Classification> classification;
  private final @Nullable Id id;

  private ImmutableSubstanceReferenceInformation(
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<SubstanceReferenceInformation_GeneElement> geneElement,
      @Nullable List<SubstanceReferenceInformation_Gene> gene,
      @Nullable Narrative text,
      @Nullable Meta meta,
      @Nullable List<SubstanceReferenceInformation_Target> target,
      @Nullable Uri implicitRules,
      @Nullable String comment,
      String resourceType,
      @Nullable List<Extension> extension,
      @Nullable Code language,
      @Nullable List<SubstanceReferenceInformation_Classification> classification,
      @Nullable Id id) {
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.geneElement = geneElement;
    this.gene = gene;
    this.text = text;
    this.meta = meta;
    this.target = target;
    this.implicitRules = implicitRules;
    this.comment = comment;
    this.resourceType = resourceType;
    this.extension = extension;
    this.language = language;
    this.classification = classification;
    this.id = id;
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code geneElement} attribute
   */
  @JsonProperty("geneElement")
  @Override
  public Optional<List<SubstanceReferenceInformation_GeneElement>> geneElement() {
    return Optional.ofNullable(geneElement);
  }

  /**
   * @return The value of the {@code gene} attribute
   */
  @JsonProperty("gene")
  @Override
  public Optional<List<SubstanceReferenceInformation_Gene>> gene() {
    return Optional.ofNullable(gene);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Optional<List<SubstanceReferenceInformation_Target>> target() {
    return Optional.ofNullable(target);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<String> comment() {
    return Optional.ofNullable(comment);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code classification} attribute
   */
  @JsonProperty("classification")
  @Override
  public Optional<List<SubstanceReferenceInformation_Classification>> classification() {
    return Optional.ofNullable(classification);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        newValue,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        value,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        newValue,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        value,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#geneElement() geneElement} attribute.
   * @param value The value for geneElement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withGeneElement(List<SubstanceReferenceInformation_GeneElement> value) {
    @Nullable List<SubstanceReferenceInformation_GeneElement> newValue = Objects.requireNonNull(value, "geneElement");
    if (this.geneElement == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        newValue,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#geneElement() geneElement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for geneElement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withGeneElement(Optional<? extends List<SubstanceReferenceInformation_GeneElement>> optional) {
    @Nullable List<SubstanceReferenceInformation_GeneElement> value = optional.orElse(null);
    if (this.geneElement == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        value,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#gene() gene} attribute.
   * @param value The value for gene
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withGene(List<SubstanceReferenceInformation_Gene> value) {
    @Nullable List<SubstanceReferenceInformation_Gene> newValue = Objects.requireNonNull(value, "gene");
    if (this.gene == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        newValue,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#gene() gene} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gene
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withGene(Optional<? extends List<SubstanceReferenceInformation_Gene>> optional) {
    @Nullable List<SubstanceReferenceInformation_Gene> value = optional.orElse(null);
    if (this.gene == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        value,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        newValue,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        value,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        newValue,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        value,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withTarget(List<SubstanceReferenceInformation_Target> value) {
    @Nullable List<SubstanceReferenceInformation_Target> newValue = Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        newValue,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withTarget(Optional<? extends List<SubstanceReferenceInformation_Target>> optional) {
    @Nullable List<SubstanceReferenceInformation_Target> value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        value,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        newValue,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        value,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        value,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubstanceReferenceInformation#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        newValue,
        this.extension,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        newValue,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        value,
        this.language,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        newValue,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        value,
        this.classification,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#classification() classification} attribute.
   * @param value The value for classification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withClassification(List<SubstanceReferenceInformation_Classification> value) {
    @Nullable List<SubstanceReferenceInformation_Classification> newValue = Objects.requireNonNull(value, "classification");
    if (this.classification == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#classification() classification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for classification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withClassification(Optional<? extends List<SubstanceReferenceInformation_Classification>> optional) {
    @Nullable List<SubstanceReferenceInformation_Classification> value = optional.orElse(null);
    if (this.classification == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubstanceReferenceInformation(
        this.contained,
        this.modifierExtension,
        this.geneElement,
        this.gene,
        this.text,
        this.meta,
        this.target,
        this.implicitRules,
        this.comment,
        this.resourceType,
        this.extension,
        this.language,
        this.classification,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceReferenceInformation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceReferenceInformation
        && equalTo((ImmutableSubstanceReferenceInformation) another);
  }

  private boolean equalTo(ImmutableSubstanceReferenceInformation another) {
    return Objects.equals(contained, another.contained)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(geneElement, another.geneElement)
        && Objects.equals(gene, another.gene)
        && Objects.equals(text, another.text)
        && Objects.equals(meta, another.meta)
        && Objects.equals(target, another.target)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(comment, another.comment)
        && resourceType.equals(another.resourceType)
        && Objects.equals(extension, another.extension)
        && Objects.equals(language, another.language)
        && Objects.equals(classification, another.classification)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code modifierExtension}, {@code geneElement}, {@code gene}, {@code text}, {@code meta}, {@code target}, {@code implicitRules}, {@code comment}, {@code resourceType}, {@code extension}, {@code language}, {@code classification}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(geneElement);
    h += (h << 5) + Objects.hashCode(gene);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(target);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(classification);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceReferenceInformation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceReferenceInformation{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (geneElement != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("geneElement=").append(geneElement);
    }
    if (gene != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("gene=").append(gene);
    }
    if (text != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (meta != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (target != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("target=").append(target);
    }
    if (implicitRules != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (comment != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (builder.length() > 30) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (classification != null) {
      builder.append(", ");
      builder.append("classification=").append(classification);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceReferenceInformation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceReferenceInformation {
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<SubstanceReferenceInformation_GeneElement>> geneElement = Optional.empty();
    boolean geneElementIsSet;
    @Nullable Optional<List<SubstanceReferenceInformation_Gene>> gene = Optional.empty();
    boolean geneIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<SubstanceReferenceInformation_Target>> target = Optional.empty();
    boolean targetIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<SubstanceReferenceInformation_Classification>> classification = Optional.empty();
    boolean classificationIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("geneElement")
    public void setGeneElement(Optional<List<SubstanceReferenceInformation_GeneElement>> geneElement) {
      this.geneElement = geneElement;
      this.geneElementIsSet = true;
    }
    @JsonProperty("gene")
    public void setGene(Optional<List<SubstanceReferenceInformation_Gene>> gene) {
      this.gene = gene;
      this.geneIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("target")
    public void setTarget(Optional<List<SubstanceReferenceInformation_Target>> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("classification")
    public void setClassification(Optional<List<SubstanceReferenceInformation_Classification>> classification) {
      this.classification = classification;
      this.classificationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceReferenceInformation_GeneElement>> geneElement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceReferenceInformation_Gene>> gene() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceReferenceInformation_Target>> target() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceReferenceInformation_Classification>> classification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceReferenceInformation fromJson(Json json) {
    ImmutableSubstanceReferenceInformation.Builder builder = ((ImmutableSubstanceReferenceInformation.Builder) ImmutableSubstanceReferenceInformation.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.geneElementIsSet) {
      builder.geneElement(json.geneElement);
    }
    if (json.geneIsSet) {
      builder.gene(json.gene);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.classificationIsSet) {
      builder.classification(json.classification);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .geneElement(instance.geneElement())
        .gene(instance.gene())
        .text(instance.text())
        .meta(instance.meta())
        .target(instance.target())
        .implicitRules(instance.implicitRules())
        .comment(instance.comment())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .language(instance.language())
        .classification(instance.classification())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceReferenceInformation SubstanceReferenceInformation}.
   * <pre>
   * ImmutableSubstanceReferenceInformation.builder()
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link SubstanceReferenceInformation#contained() contained}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceReferenceInformation#modifierExtension() modifierExtension}
   *    .geneElement(List&amp;lt;com.medplum.types.fhir.SubstanceReferenceInformation_GeneElement&amp;gt;) // optional {@link SubstanceReferenceInformation#geneElement() geneElement}
   *    .gene(List&amp;lt;com.medplum.types.fhir.SubstanceReferenceInformation_Gene&amp;gt;) // optional {@link SubstanceReferenceInformation#gene() gene}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link SubstanceReferenceInformation#text() text}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link SubstanceReferenceInformation#meta() meta}
   *    .target(List&amp;lt;com.medplum.types.fhir.SubstanceReferenceInformation_Target&amp;gt;) // optional {@link SubstanceReferenceInformation#target() target}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link SubstanceReferenceInformation#implicitRules() implicitRules}
   *    .comment(String) // optional {@link SubstanceReferenceInformation#comment() comment}
   *    .resourceType(String) // required {@link SubstanceReferenceInformation#resourceType() resourceType}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceReferenceInformation#extension() extension}
   *    .language(com.medplum.types.fhir.Code) // optional {@link SubstanceReferenceInformation#language() language}
   *    .classification(List&amp;lt;com.medplum.types.fhir.SubstanceReferenceInformation_Classification&amp;gt;) // optional {@link SubstanceReferenceInformation#classification() classification}
   *    .id(com.medplum.types.fhir.Id) // optional {@link SubstanceReferenceInformation#id() id}
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
  @Generated(from = "SubstanceReferenceInformation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_GENE_ELEMENT = 0x4L;
    private static final long OPT_BIT_GENE = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_TARGET = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_COMMENT = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_CLASSIFICATION = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<SubstanceReferenceInformation_GeneElement> geneElement;
    private @Nullable List<SubstanceReferenceInformation_Gene> gene;
    private @Nullable Narrative text;
    private @Nullable Meta meta;
    private @Nullable List<SubstanceReferenceInformation_Target> target;
    private @Nullable Uri implicitRules;
    private @Nullable String comment;
    private @Nullable String resourceType;
    private @Nullable List<Extension> extension;
    private @Nullable Code language;
    private @Nullable List<SubstanceReferenceInformation_Classification> classification;
    private @Nullable Id id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(List<ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contained")
    public final Builder contained(Optional<? extends List<ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation#geneElement() geneElement} to geneElement.
     * @param geneElement The value for geneElement
     * @return {@code this} builder for chained invocation
     */
    public final Builder geneElement(List<SubstanceReferenceInformation_GeneElement> geneElement) {
      checkNotIsSet(geneElementIsSet(), "geneElement");
      this.geneElement = Objects.requireNonNull(geneElement, "geneElement");
      optBits |= OPT_BIT_GENE_ELEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#geneElement() geneElement} to geneElement.
     * @param geneElement The value for geneElement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("geneElement")
    public final Builder geneElement(Optional<? extends List<SubstanceReferenceInformation_GeneElement>> geneElement) {
      checkNotIsSet(geneElementIsSet(), "geneElement");
      this.geneElement = geneElement.orElse(null);
      optBits |= OPT_BIT_GENE_ELEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#gene() gene} to gene.
     * @param gene The value for gene
     * @return {@code this} builder for chained invocation
     */
    public final Builder gene(List<SubstanceReferenceInformation_Gene> gene) {
      checkNotIsSet(geneIsSet(), "gene");
      this.gene = Objects.requireNonNull(gene, "gene");
      optBits |= OPT_BIT_GENE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#gene() gene} to gene.
     * @param gene The value for gene
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("gene")
    public final Builder gene(Optional<? extends List<SubstanceReferenceInformation_Gene>> gene) {
      checkNotIsSet(geneIsSet(), "gene");
      this.gene = gene.orElse(null);
      optBits |= OPT_BIT_GENE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<? extends Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(List<SubstanceReferenceInformation_Target> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Optional<? extends List<SubstanceReferenceInformation_Target>> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comment")
    public final Builder comment(Optional<String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the value for the {@link SubstanceReferenceInformation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for chained invocation
     */
    public final Builder classification(List<SubstanceReferenceInformation_Classification> classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = Objects.requireNonNull(classification, "classification");
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("classification")
    public final Builder classification(Optional<? extends List<SubstanceReferenceInformation_Classification>> classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = classification.orElse(null);
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Builds a new {@link SubstanceReferenceInformation SubstanceReferenceInformation}.
     * @return An immutable instance of SubstanceReferenceInformation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceReferenceInformation build() {
      checkRequiredAttributes();
      return new ImmutableSubstanceReferenceInformation(
          contained,
          modifierExtension,
          geneElement,
          gene,
          text,
          meta,
          target,
          implicitRules,
          comment,
          resourceType,
          extension,
          language,
          classification,
          id);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean geneElementIsSet() {
      return (optBits & OPT_BIT_GENE_ELEMENT) != 0;
    }

    private boolean geneIsSet() {
      return (optBits & OPT_BIT_GENE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean classificationIsSet() {
      return (optBits & OPT_BIT_CLASSIFICATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceReferenceInformation is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SubstanceReferenceInformation, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "SubstanceReferenceInformation", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SubstanceReferenceInformation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "SubstanceReferenceInformation", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#geneElement() geneElement} to geneElement.
     * @param geneElement The value for geneElement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal geneElement(List<SubstanceReferenceInformation_GeneElement> geneElement);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#geneElement() geneElement} to geneElement.
     * @param geneElement The value for geneElement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal geneElement(Optional<? extends List<SubstanceReferenceInformation_GeneElement>> geneElement);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#gene() gene} to gene.
     * @param gene The value for gene
     * @return {@code this} builder for chained invocation
     */
    BuildFinal gene(List<SubstanceReferenceInformation_Gene> gene);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#gene() gene} to gene.
     * @param gene The value for gene
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal gene(Optional<? extends List<SubstanceReferenceInformation_Gene>> gene);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    BuildFinal target(List<SubstanceReferenceInformation_Target> target);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal target(Optional<? extends List<SubstanceReferenceInformation_Target>> target);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(String comment);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(Optional<String> comment);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal classification(List<SubstanceReferenceInformation_Classification> classification);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal classification(Optional<? extends List<SubstanceReferenceInformation_Classification>> classification);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Builds a new {@link SubstanceReferenceInformation SubstanceReferenceInformation}.
     * @return An immutable instance of SubstanceReferenceInformation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SubstanceReferenceInformation build();
  }
}

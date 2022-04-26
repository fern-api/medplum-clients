package com.fhir.types.fhir;

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
 * Immutable implementation of {@link ResearchSubject}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableResearchSubject.builder()}.
 */
@Generated(from = "ResearchSubject", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableResearchSubject implements ResearchSubject {
  private final @Nullable String actualArm;
  private final String resourceType;
  private final @Nullable Code language;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Extension> extension;
  private final @Nullable ResearchsubjectStatus status;
  private final @Nullable Reference consent;
  private final Reference individual;
  private final @Nullable String assignedArm;
  private final Reference study;
  private final @Nullable Meta meta;
  private final @Nullable Uri implicitRules;
  private final @Nullable Narrative text;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Id id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Period period;

  private ImmutableResearchSubject(
      @Nullable String actualArm,
      String resourceType,
      @Nullable Code language,
      @Nullable List<Identifier> identifier,
      @Nullable List<Extension> extension,
      @Nullable ResearchsubjectStatus status,
      @Nullable Reference consent,
      Reference individual,
      @Nullable String assignedArm,
      Reference study,
      @Nullable Meta meta,
      @Nullable Uri implicitRules,
      @Nullable Narrative text,
      @Nullable List<ResourceList> contained,
      @Nullable Id id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Period period) {
    this.actualArm = actualArm;
    this.resourceType = resourceType;
    this.language = language;
    this.identifier = identifier;
    this.extension = extension;
    this.status = status;
    this.consent = consent;
    this.individual = individual;
    this.assignedArm = assignedArm;
    this.study = study;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.text = text;
    this.contained = contained;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.period = period;
  }

  /**
   * @return The value of the {@code actualArm} attribute
   */
  @JsonProperty("actualArm")
  @Override
  public Optional<String> actualArm() {
    return Optional.ofNullable(actualArm);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ResearchsubjectStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code consent} attribute
   */
  @JsonProperty("consent")
  @Override
  public Optional<Reference> consent() {
    return Optional.ofNullable(consent);
  }

  /**
   * @return The value of the {@code individual} attribute
   */
  @JsonProperty("individual")
  @Override
  public Reference individual() {
    return individual;
  }

  /**
   * @return The value of the {@code assignedArm} attribute
   */
  @JsonProperty("assignedArm")
  @Override
  public Optional<String> assignedArm() {
    return Optional.ofNullable(assignedArm);
  }

  /**
   * @return The value of the {@code study} attribute
   */
  @JsonProperty("study")
  @Override
  public Reference study() {
    return study;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#actualArm() actualArm} attribute.
   * @param value The value for actualArm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withActualArm(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "actualArm");
    if (Objects.equals(this.actualArm, newValue)) return this;
    return new ImmutableResearchSubject(
        newValue,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#actualArm() actualArm} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actualArm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withActualArm(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.actualArm, value)) return this;
    return new ImmutableResearchSubject(
        value,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ResearchSubject#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableResearchSubject withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        newValue,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        newValue,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        value,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        newValue,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        value,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        newValue,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        value,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withStatus(ResearchsubjectStatus value) {
    @Nullable ResearchsubjectStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        newValue,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withStatus(Optional<? extends ResearchsubjectStatus> optional) {
    @Nullable ResearchsubjectStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        value,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#consent() consent} attribute.
   * @param value The value for consent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withConsent(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "consent");
    if (this.consent == newValue) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        newValue,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#consent() consent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for consent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withConsent(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.consent == value) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        value,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ResearchSubject#individual() individual} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for individual
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableResearchSubject withIndividual(Reference value) {
    if (this.individual == value) return this;
    Reference newValue = Objects.requireNonNull(value, "individual");
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        newValue,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#assignedArm() assignedArm} attribute.
   * @param value The value for assignedArm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withAssignedArm(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "assignedArm");
    if (Objects.equals(this.assignedArm, newValue)) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        newValue,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#assignedArm() assignedArm} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for assignedArm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withAssignedArm(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.assignedArm, value)) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        value,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ResearchSubject#study() study} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for study
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableResearchSubject withStudy(Reference value) {
    if (this.study == value) return this;
    Reference newValue = Objects.requireNonNull(value, "study");
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        newValue,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        newValue,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        value,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        newValue,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        value,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        newValue,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        value,
        this.contained,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        newValue,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        value,
        this.id,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        newValue,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        value,
        this.modifierExtension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        newValue,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        value,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableResearchSubject(
        this.actualArm,
        this.resourceType,
        this.language,
        this.identifier,
        this.extension,
        this.status,
        this.consent,
        this.individual,
        this.assignedArm,
        this.study,
        this.meta,
        this.implicitRules,
        this.text,
        this.contained,
        this.id,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableResearchSubject} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableResearchSubject
        && equalTo((ImmutableResearchSubject) another);
  }

  private boolean equalTo(ImmutableResearchSubject another) {
    return Objects.equals(actualArm, another.actualArm)
        && resourceType.equals(another.resourceType)
        && Objects.equals(language, another.language)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(extension, another.extension)
        && Objects.equals(status, another.status)
        && Objects.equals(consent, another.consent)
        && individual.equals(another.individual)
        && Objects.equals(assignedArm, another.assignedArm)
        && study.equals(another.study)
        && Objects.equals(meta, another.meta)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(text, another.text)
        && Objects.equals(contained, another.contained)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(period, another.period);
  }

  /**
   * Computes a hash code from attributes: {@code actualArm}, {@code resourceType}, {@code language}, {@code identifier}, {@code extension}, {@code status}, {@code consent}, {@code individual}, {@code assignedArm}, {@code study}, {@code meta}, {@code implicitRules}, {@code text}, {@code contained}, {@code id}, {@code modifierExtension}, {@code period}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(actualArm);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(consent);
    h += (h << 5) + individual.hashCode();
    h += (h << 5) + Objects.hashCode(assignedArm);
    h += (h << 5) + study.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(period);
    return h;
  }

  /**
   * Prints the immutable value {@code ResearchSubject} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ResearchSubject{");
    if (actualArm != null) {
      builder.append("actualArm=").append(actualArm);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (consent != null) {
      builder.append(", ");
      builder.append("consent=").append(consent);
    }
    builder.append(", ");
    builder.append("individual=").append(individual);
    if (assignedArm != null) {
      builder.append(", ");
      builder.append("assignedArm=").append(assignedArm);
    }
    builder.append(", ");
    builder.append("study=").append(study);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ResearchSubject", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ResearchSubject {
    @Nullable Optional<String> actualArm = Optional.empty();
    boolean actualArmIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<ResearchsubjectStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Reference> consent = Optional.empty();
    boolean consentIsSet;
    @Nullable Reference individual;
    @Nullable Optional<String> assignedArm = Optional.empty();
    boolean assignedArmIsSet;
    @Nullable Reference study;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @JsonProperty("actualArm")
    public void setActualArm(Optional<String> actualArm) {
      this.actualArm = actualArm;
      this.actualArmIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<ResearchsubjectStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("consent")
    public void setConsent(Optional<Reference> consent) {
      this.consent = consent;
      this.consentIsSet = true;
    }
    @JsonProperty("individual")
    public void setIndividual(Reference individual) {
      this.individual = individual;
    }
    @JsonProperty("assignedArm")
    public void setAssignedArm(Optional<String> assignedArm) {
      this.assignedArm = assignedArm;
      this.assignedArmIsSet = true;
    }
    @JsonProperty("study")
    public void setStudy(Reference study) {
      this.study = study;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @Override
    public Optional<String> actualArm() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ResearchsubjectStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> consent() { throw new UnsupportedOperationException(); }
    @Override
    public Reference individual() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> assignedArm() { throw new UnsupportedOperationException(); }
    @Override
    public Reference study() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableResearchSubject fromJson(Json json) {
    ImmutableResearchSubject.Builder builder = ((ImmutableResearchSubject.Builder) ImmutableResearchSubject.builder());
    if (json.actualArmIsSet) {
      builder.actualArm(json.actualArm);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.consentIsSet) {
      builder.consent(json.consent);
    }
    if (json.individual != null) {
      builder.individual(json.individual);
    }
    if (json.assignedArmIsSet) {
      builder.assignedArm(json.assignedArm);
    }
    if (json.study != null) {
      builder.study(json.study);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    return (ImmutableResearchSubject) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ResearchSubject} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ResearchSubject instance
   */
  public static ResearchSubject copyOf(ResearchSubject instance) {
    if (instance instanceof ImmutableResearchSubject) {
      return (ImmutableResearchSubject) instance;
    }
    return ((ImmutableResearchSubject.Builder) ImmutableResearchSubject.builder())
        .actualArm(instance.actualArm())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .identifier(instance.identifier())
        .extension(instance.extension())
        .status(instance.status())
        .consent(instance.consent())
        .individual(instance.individual())
        .assignedArm(instance.assignedArm())
        .study(instance.study())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .text(instance.text())
        .contained(instance.contained())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .period(instance.period())
        .build();
  }

  /**
   * Creates a builder for {@link ResearchSubject ResearchSubject}.
   * <pre>
   * ImmutableResearchSubject.builder()
   *    .actualArm(String) // optional {@link ResearchSubject#actualArm() actualArm}
   *    .resourceType(String) // required {@link ResearchSubject#resourceType() resourceType}
   *    .language(com.fhir.types.fhir.Code) // optional {@link ResearchSubject#language() language}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link ResearchSubject#identifier() identifier}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ResearchSubject#extension() extension}
   *    .status(com.fhir.types.fhir.ResearchsubjectStatus) // optional {@link ResearchSubject#status() status}
   *    .consent(com.fhir.types.fhir.Reference) // optional {@link ResearchSubject#consent() consent}
   *    .individual(com.fhir.types.fhir.Reference) // required {@link ResearchSubject#individual() individual}
   *    .assignedArm(String) // optional {@link ResearchSubject#assignedArm() assignedArm}
   *    .study(com.fhir.types.fhir.Reference) // required {@link ResearchSubject#study() study}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link ResearchSubject#meta() meta}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link ResearchSubject#implicitRules() implicitRules}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link ResearchSubject#text() text}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link ResearchSubject#contained() contained}
   *    .id(com.fhir.types.fhir.Id) // optional {@link ResearchSubject#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ResearchSubject#modifierExtension() modifierExtension}
   *    .period(com.fhir.types.fhir.Period) // optional {@link ResearchSubject#period() period}
   *    .build();
   * </pre>
   * @return A new ResearchSubject builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableResearchSubject.Builder();
  }

  /**
   * Builds instances of type {@link ResearchSubject ResearchSubject}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ResearchSubject", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, IndividualBuildStage, StudyBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_INDIVIDUAL = 0x2L;
    private static final long INIT_BIT_STUDY = 0x4L;
    private static final long OPT_BIT_ACTUAL_ARM = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_STATUS = 0x10L;
    private static final long OPT_BIT_CONSENT = 0x20L;
    private static final long OPT_BIT_ASSIGNED_ARM = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_PERIOD = 0x2000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable String actualArm;
    private @Nullable String resourceType;
    private @Nullable Code language;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Extension> extension;
    private @Nullable ResearchsubjectStatus status;
    private @Nullable Reference consent;
    private @Nullable Reference individual;
    private @Nullable String assignedArm;
    private @Nullable Reference study;
    private @Nullable Meta meta;
    private @Nullable Uri implicitRules;
    private @Nullable Narrative text;
    private @Nullable List<ResourceList> contained;
    private @Nullable Id id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Period period;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ResearchSubject#actualArm() actualArm} to actualArm.
     * @param actualArm The value for actualArm
     * @return {@code this} builder for chained invocation
     */
    public final Builder actualArm(String actualArm) {
      checkNotIsSet(actualArmIsSet(), "actualArm");
      this.actualArm = Objects.requireNonNull(actualArm, "actualArm");
      optBits |= OPT_BIT_ACTUAL_ARM;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#actualArm() actualArm} to actualArm.
     * @param actualArm The value for actualArm
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("actualArm")
    public final Builder actualArm(Optional<String> actualArm) {
      checkNotIsSet(actualArmIsSet(), "actualArm");
      this.actualArm = actualArm.orElse(null);
      optBits |= OPT_BIT_ACTUAL_ARM;
      return this;
    }

    /**
     * Initializes the value for the {@link ResearchSubject#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ResearchSubject#language() language} to language.
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
     * Initializes the optional value {@link ResearchSubject#language() language} to language.
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
     * Initializes the optional value {@link ResearchSubject#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchSubject#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchSubject#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ResearchsubjectStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ResearchsubjectStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#consent() consent} to consent.
     * @param consent The value for consent
     * @return {@code this} builder for chained invocation
     */
    public final Builder consent(Reference consent) {
      checkNotIsSet(consentIsSet(), "consent");
      this.consent = Objects.requireNonNull(consent, "consent");
      optBits |= OPT_BIT_CONSENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#consent() consent} to consent.
     * @param consent The value for consent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("consent")
    public final Builder consent(Optional<? extends Reference> consent) {
      checkNotIsSet(consentIsSet(), "consent");
      this.consent = consent.orElse(null);
      optBits |= OPT_BIT_CONSENT;
      return this;
    }

    /**
     * Initializes the value for the {@link ResearchSubject#individual() individual} attribute.
     * @param individual The value for individual 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("individual")
    public final Builder individual(Reference individual) {
      checkNotIsSet(individualIsSet(), "individual");
      this.individual = Objects.requireNonNull(individual, "individual");
      initBits &= ~INIT_BIT_INDIVIDUAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#assignedArm() assignedArm} to assignedArm.
     * @param assignedArm The value for assignedArm
     * @return {@code this} builder for chained invocation
     */
    public final Builder assignedArm(String assignedArm) {
      checkNotIsSet(assignedArmIsSet(), "assignedArm");
      this.assignedArm = Objects.requireNonNull(assignedArm, "assignedArm");
      optBits |= OPT_BIT_ASSIGNED_ARM;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#assignedArm() assignedArm} to assignedArm.
     * @param assignedArm The value for assignedArm
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assignedArm")
    public final Builder assignedArm(Optional<String> assignedArm) {
      checkNotIsSet(assignedArmIsSet(), "assignedArm");
      this.assignedArm = assignedArm.orElse(null);
      optBits |= OPT_BIT_ASSIGNED_ARM;
      return this;
    }

    /**
     * Initializes the value for the {@link ResearchSubject#study() study} attribute.
     * @param study The value for study 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("study")
    public final Builder study(Reference study) {
      checkNotIsSet(studyIsSet(), "study");
      this.study = Objects.requireNonNull(study, "study");
      initBits &= ~INIT_BIT_STUDY;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchSubject#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchSubject#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchSubject#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchSubject#text() text} to text.
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
     * Initializes the optional value {@link ResearchSubject#text() text} to text.
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
     * Initializes the optional value {@link ResearchSubject#contained() contained} to contained.
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
     * Initializes the optional value {@link ResearchSubject#contained() contained} to contained.
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
     * Initializes the optional value {@link ResearchSubject#id() id} to id.
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
     * Initializes the optional value {@link ResearchSubject#id() id} to id.
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
     * Initializes the optional value {@link ResearchSubject#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchSubject#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchSubject#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Builds a new {@link ResearchSubject ResearchSubject}.
     * @return An immutable instance of ResearchSubject
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ResearchSubject build() {
      checkRequiredAttributes();
      return new ImmutableResearchSubject(
          actualArm,
          resourceType,
          language,
          identifier,
          extension,
          status,
          consent,
          individual,
          assignedArm,
          study,
          meta,
          implicitRules,
          text,
          contained,
          id,
          modifierExtension,
          period);
    }

    private boolean actualArmIsSet() {
      return (optBits & OPT_BIT_ACTUAL_ARM) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean consentIsSet() {
      return (optBits & OPT_BIT_CONSENT) != 0;
    }

    private boolean assignedArmIsSet() {
      return (optBits & OPT_BIT_ASSIGNED_ARM) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean individualIsSet() {
      return (initBits & INIT_BIT_INDIVIDUAL) == 0;
    }

    private boolean studyIsSet() {
      return (initBits & INIT_BIT_STUDY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ResearchSubject is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!individualIsSet()) attributes.add("individual");
      if (!studyIsSet()) attributes.add("study");
      return "Cannot build ResearchSubject, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ResearchSubject", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ResearchSubject#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    IndividualBuildStage resourceType(String resourceType);
  }

  @Generated(from = "ResearchSubject", generator = "Immutables")
  public interface IndividualBuildStage {
    /**
     * Initializes the value for the {@link ResearchSubject#individual() individual} attribute.
     * @param individual The value for individual 
     * @return {@code this} builder for use in a chained invocation
     */
    StudyBuildStage individual(Reference individual);
  }

  @Generated(from = "ResearchSubject", generator = "Immutables")
  public interface StudyBuildStage {
    /**
     * Initializes the value for the {@link ResearchSubject#study() study} attribute.
     * @param study The value for study 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal study(Reference study);
  }

  @Generated(from = "ResearchSubject", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ResearchSubject#actualArm() actualArm} to actualArm.
     * @param actualArm The value for actualArm
     * @return {@code this} builder for chained invocation
     */
    BuildFinal actualArm(String actualArm);

    /**
     * Initializes the optional value {@link ResearchSubject#actualArm() actualArm} to actualArm.
     * @param actualArm The value for actualArm
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal actualArm(Optional<String> actualArm);

    /**
     * Initializes the optional value {@link ResearchSubject#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ResearchSubject#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ResearchSubject#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ResearchSubject#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ResearchSubject#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ResearchSubject#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ResearchSubject#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ResearchsubjectStatus status);

    /**
     * Initializes the optional value {@link ResearchSubject#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ResearchsubjectStatus> status);

    /**
     * Initializes the optional value {@link ResearchSubject#consent() consent} to consent.
     * @param consent The value for consent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal consent(Reference consent);

    /**
     * Initializes the optional value {@link ResearchSubject#consent() consent} to consent.
     * @param consent The value for consent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal consent(Optional<? extends Reference> consent);

    /**
     * Initializes the optional value {@link ResearchSubject#assignedArm() assignedArm} to assignedArm.
     * @param assignedArm The value for assignedArm
     * @return {@code this} builder for chained invocation
     */
    BuildFinal assignedArm(String assignedArm);

    /**
     * Initializes the optional value {@link ResearchSubject#assignedArm() assignedArm} to assignedArm.
     * @param assignedArm The value for assignedArm
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal assignedArm(Optional<String> assignedArm);

    /**
     * Initializes the optional value {@link ResearchSubject#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ResearchSubject#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ResearchSubject#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ResearchSubject#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ResearchSubject#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ResearchSubject#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ResearchSubject#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ResearchSubject#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ResearchSubject#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ResearchSubject#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ResearchSubject#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchSubject#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchSubject#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link ResearchSubject#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Builds a new {@link ResearchSubject ResearchSubject}.
     * @return An immutable instance of ResearchSubject
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ResearchSubject build();
  }
}

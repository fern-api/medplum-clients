//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ResearchSubject}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableResearchSubject.builder()}.
 */
@org.immutables.value.Generated(from = "ResearchSubject", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableResearchSubject implements com.fhir.ResearchSubject {
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String actualArm;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Reference consent;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.ResearchsubjectStatus status;
  private final com.fhir.Reference individual;
  private final @javax.annotation.Nullable java.lang.String assignedArm;
  private final com.fhir.Reference study;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;

  private ImmutableResearchSubject(
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String actualArm,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Reference consent,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Period period,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.ResearchsubjectStatus status,
      com.fhir.Reference individual,
      @javax.annotation.Nullable java.lang.String assignedArm,
      com.fhir.Reference study,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained) {
    this.meta = meta;
    this.actualArm = actualArm;
    this.resourceType = resourceType;
    this.consent = consent;
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.identifier = identifier;
    this.period = period;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.individual = individual;
    this.assignedArm = assignedArm;
    this.study = study;
    this.id = id;
    this.language = language;
    this.contained = contained;
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
   * @return The value of the {@code actualArm} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("actualArm")
  @Override
  public java.util.Optional<java.lang.String> actualArm() {
    return java.util.Optional.ofNullable(actualArm);
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
   * @return The value of the {@code consent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("consent")
  @Override
  public java.util.Optional<com.fhir.Reference> consent() {
    return java.util.Optional.ofNullable(consent);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("period")
  @Override
  public java.util.Optional<com.fhir.Period> period() {
    return java.util.Optional.ofNullable(period);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.ResearchsubjectStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code individual} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("individual")
  @Override
  public com.fhir.Reference individual() {
    return individual;
  }

  /**
   * @return The value of the {@code assignedArm} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("assignedArm")
  @Override
  public java.util.Optional<java.lang.String> assignedArm() {
    return java.util.Optional.ofNullable(assignedArm);
  }

  /**
   * @return The value of the {@code study} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("study")
  @Override
  public com.fhir.Reference study() {
    return study;
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableResearchSubject(
        newValue,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableResearchSubject(
        value,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#actualArm() actualArm} attribute.
   * @param value The value for actualArm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withActualArm(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "actualArm");
    if (java.util.Objects.equals(this.actualArm, newValue)) return this;
    return new ImmutableResearchSubject(
        this.meta,
        newValue,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#actualArm() actualArm} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actualArm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withActualArm(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.actualArm, value)) return this;
    return new ImmutableResearchSubject(
        this.meta,
        value,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ResearchSubject#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableResearchSubject withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        newValue,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#consent() consent} attribute.
   * @param value The value for consent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withConsent(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "consent");
    if (this.consent == newValue) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        newValue,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#consent() consent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for consent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withConsent(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.consent == value) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        value,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        newValue,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        value,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        newValue,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        value,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        newValue,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        value,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        newValue,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        value,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        newValue,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        value,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        newValue,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        value,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withStatus(com.fhir.ResearchsubjectStatus value) {
    @javax.annotation.Nullable com.fhir.ResearchsubjectStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        newValue,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withStatus(java.util.Optional<? extends com.fhir.ResearchsubjectStatus> optional) {
    @javax.annotation.Nullable com.fhir.ResearchsubjectStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        value,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ResearchSubject#individual() individual} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for individual
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableResearchSubject withIndividual(com.fhir.Reference value) {
    if (this.individual == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "individual");
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        newValue,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#assignedArm() assignedArm} attribute.
   * @param value The value for assignedArm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withAssignedArm(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "assignedArm");
    if (java.util.Objects.equals(this.assignedArm, newValue)) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        newValue,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#assignedArm() assignedArm} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for assignedArm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withAssignedArm(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.assignedArm, value)) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        value,
        this.study,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ResearchSubject#study() study} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for study
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableResearchSubject withStudy(com.fhir.Reference value) {
    if (this.study == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "study");
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        newValue,
        this.id,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        newValue,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        value,
        this.language,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        newValue,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        value,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchSubject#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchSubject withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchSubject#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchSubject withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableResearchSubject(
        this.meta,
        this.actualArm,
        this.resourceType,
        this.consent,
        this.implicitRules,
        this.extension,
        this.identifier,
        this.period,
        this.text,
        this.modifierExtension,
        this.status,
        this.individual,
        this.assignedArm,
        this.study,
        this.id,
        this.language,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableResearchSubject} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableResearchSubject
        && equalTo((ImmutableResearchSubject) another);
  }

  private boolean equalTo(ImmutableResearchSubject another) {
    return java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(actualArm, another.actualArm)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(consent, another.consent)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(period, another.period)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(status, another.status)
        && individual.equals(another.individual)
        && java.util.Objects.equals(assignedArm, another.assignedArm)
        && study.equals(another.study)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(contained, another.contained);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code actualArm}, {@code resourceType}, {@code consent}, {@code implicitRules}, {@code extension}, {@code identifier}, {@code period}, {@code text}, {@code modifierExtension}, {@code status}, {@code individual}, {@code assignedArm}, {@code study}, {@code id}, {@code language}, {@code contained}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(actualArm);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(consent);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + individual.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(assignedArm);
    h += (h << 5) + study.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    return h;
  }

  /**
   * Prints the immutable value {@code ResearchSubject} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ResearchSubject{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (actualArm != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("actualArm=").append(actualArm);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (consent != null) {
      builder.append(", ");
      builder.append("consent=").append(consent);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    builder.append(", ");
    builder.append("individual=").append(individual);
    if (assignedArm != null) {
      builder.append(", ");
      builder.append("assignedArm=").append(assignedArm);
    }
    builder.append(", ");
    builder.append("study=").append(study);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ResearchSubject", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ResearchSubject {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> actualArm = java.util.Optional.empty();
    boolean actualArmIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> consent = java.util.Optional.empty();
    boolean consentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ResearchsubjectStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable com.fhir.Reference individual;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> assignedArm = java.util.Optional.empty();
    boolean assignedArmIsSet;
    @javax.annotation.Nullable com.fhir.Reference study;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("actualArm")
    public void setActualArm(java.util.Optional<java.lang.String> actualArm) {
      this.actualArm = actualArm;
      this.actualArmIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("consent")
    public void setConsent(java.util.Optional<com.fhir.Reference> consent) {
      this.consent = consent;
      this.consentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ResearchsubjectStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("individual")
    public void setIndividual(com.fhir.Reference individual) {
      this.individual = individual;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("assignedArm")
    public void setAssignedArm(java.util.Optional<java.lang.String> assignedArm) {
      this.assignedArm = assignedArm;
      this.assignedArmIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("study")
    public void setStudy(com.fhir.Reference study) {
      this.study = study;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> actualArm() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> consent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ResearchsubjectStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference individual() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> assignedArm() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference study() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableResearchSubject fromJson(Json json) {
    ImmutableResearchSubject.Builder builder = ((ImmutableResearchSubject.Builder) ImmutableResearchSubject.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.actualArmIsSet) {
      builder.actualArm(json.actualArm);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.consentIsSet) {
      builder.consent(json.consent);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
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
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
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
        .meta(instance.meta())
        .actualArm(instance.actualArm())
        .resourceType(instance.resourceType())
        .consent(instance.consent())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .period(instance.period())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .individual(instance.individual())
        .assignedArm(instance.assignedArm())
        .study(instance.study())
        .id(instance.id())
        .language(instance.language())
        .contained(instance.contained())
        .build();
  }

  /**
   * Creates a builder for {@link ResearchSubject ResearchSubject}.
   * <pre>
   * ImmutableResearchSubject.builder()
   *    .meta(com.fhir.Meta) // optional {@link ResearchSubject#meta() meta}
   *    .actualArm(String) // optional {@link ResearchSubject#actualArm() actualArm}
   *    .resourceType(String) // required {@link ResearchSubject#resourceType() resourceType}
   *    .consent(com.fhir.Reference) // optional {@link ResearchSubject#consent() consent}
   *    .implicitRules(com.fhir.uri) // optional {@link ResearchSubject#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ResearchSubject#extension() extension}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ResearchSubject#identifier() identifier}
   *    .period(com.fhir.Period) // optional {@link ResearchSubject#period() period}
   *    .text(com.fhir.Narrative) // optional {@link ResearchSubject#text() text}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ResearchSubject#modifierExtension() modifierExtension}
   *    .status(com.fhir.ResearchsubjectStatus) // optional {@link ResearchSubject#status() status}
   *    .individual(com.fhir.Reference) // required {@link ResearchSubject#individual() individual}
   *    .assignedArm(String) // optional {@link ResearchSubject#assignedArm() assignedArm}
   *    .study(com.fhir.Reference) // required {@link ResearchSubject#study() study}
   *    .id(com.fhir.id) // optional {@link ResearchSubject#id() id}
   *    .language(com.fhir.code) // optional {@link ResearchSubject#language() language}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ResearchSubject#contained() contained}
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
  @org.immutables.value.Generated(from = "ResearchSubject", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, IndividualBuildStage, StudyBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_INDIVIDUAL = 0x2L;
    private static final long INIT_BIT_STUDY = 0x4L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_ACTUAL_ARM = 0x2L;
    private static final long OPT_BIT_CONSENT = 0x4L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_IDENTIFIER = 0x20L;
    private static final long OPT_BIT_PERIOD = 0x40L;
    private static final long OPT_BIT_TEXT = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_ASSIGNED_ARM = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private static final long OPT_BIT_CONTAINED = 0x2000L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String actualArm;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Reference consent;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.ResearchsubjectStatus status;
    private @javax.annotation.Nullable com.fhir.Reference individual;
    private @javax.annotation.Nullable java.lang.String assignedArm;
    private @javax.annotation.Nullable com.fhir.Reference study;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ResearchSubject#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchSubject#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchSubject#actualArm() actualArm} to actualArm.
     * @param actualArm The value for actualArm
     * @return {@code this} builder for chained invocation
     */
    public final Builder actualArm(java.lang.String actualArm) {
      checkNotIsSet(actualArmIsSet(), "actualArm");
      this.actualArm = java.util.Objects.requireNonNull(actualArm, "actualArm");
      optBits |= OPT_BIT_ACTUAL_ARM;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#actualArm() actualArm} to actualArm.
     * @param actualArm The value for actualArm
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actualArm")
    public final Builder actualArm(java.util.Optional<java.lang.String> actualArm) {
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
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#consent() consent} to consent.
     * @param consent The value for consent
     * @return {@code this} builder for chained invocation
     */
    public final Builder consent(com.fhir.Reference consent) {
      checkNotIsSet(consentIsSet(), "consent");
      this.consent = java.util.Objects.requireNonNull(consent, "consent");
      optBits |= OPT_BIT_CONSENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#consent() consent} to consent.
     * @param consent The value for consent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consent")
    public final Builder consent(java.util.Optional<? extends com.fhir.Reference> consent) {
      checkNotIsSet(consentIsSet(), "consent");
      this.consent = consent.orElse(null);
      optBits |= OPT_BIT_CONSENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchSubject#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchSubject#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchSubject#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchSubject#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(java.util.List<com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(com.fhir.Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = java.util.Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public final Builder period(java.util.Optional<? extends com.fhir.Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#text() text} to text.
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
     * Initializes the optional value {@link ResearchSubject#text() text} to text.
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
     * Initializes the optional value {@link ResearchSubject#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchSubject#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchSubject#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ResearchsubjectStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ResearchsubjectStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link ResearchSubject#individual() individual} attribute.
     * @param individual The value for individual 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("individual")
    public final Builder individual(com.fhir.Reference individual) {
      checkNotIsSet(individualIsSet(), "individual");
      this.individual = java.util.Objects.requireNonNull(individual, "individual");
      initBits &= ~INIT_BIT_INDIVIDUAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#assignedArm() assignedArm} to assignedArm.
     * @param assignedArm The value for assignedArm
     * @return {@code this} builder for chained invocation
     */
    public final Builder assignedArm(java.lang.String assignedArm) {
      checkNotIsSet(assignedArmIsSet(), "assignedArm");
      this.assignedArm = java.util.Objects.requireNonNull(assignedArm, "assignedArm");
      optBits |= OPT_BIT_ASSIGNED_ARM;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#assignedArm() assignedArm} to assignedArm.
     * @param assignedArm The value for assignedArm
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assignedArm")
    public final Builder assignedArm(java.util.Optional<java.lang.String> assignedArm) {
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
    @com.fasterxml.jackson.annotation.JsonProperty("study")
    public final Builder study(com.fhir.Reference study) {
      checkNotIsSet(studyIsSet(), "study");
      this.study = java.util.Objects.requireNonNull(study, "study");
      initBits &= ~INIT_BIT_STUDY;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchSubject#id() id} to id.
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
     * Initializes the optional value {@link ResearchSubject#id() id} to id.
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
     * Initializes the optional value {@link ResearchSubject#language() language} to language.
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
     * Initializes the optional value {@link ResearchSubject#language() language} to language.
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
     * Initializes the optional value {@link ResearchSubject#contained() contained} to contained.
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
     * Initializes the optional value {@link ResearchSubject#contained() contained} to contained.
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
     * Builds a new {@link ResearchSubject ResearchSubject}.
     * @return An immutable instance of ResearchSubject
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ResearchSubject build() {
      checkRequiredAttributes();
      return new ImmutableResearchSubject(
          meta,
          actualArm,
          resourceType,
          consent,
          implicitRules,
          extension,
          identifier,
          period,
          text,
          modifierExtension,
          status,
          individual,
          assignedArm,
          study,
          id,
          language,
          contained);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean actualArmIsSet() {
      return (optBits & OPT_BIT_ACTUAL_ARM) != 0;
    }

    private boolean consentIsSet() {
      return (optBits & OPT_BIT_CONSENT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean assignedArmIsSet() {
      return (optBits & OPT_BIT_ASSIGNED_ARM) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
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
      if (isSet) throw new java.lang.IllegalStateException("Builder of ResearchSubject is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!individualIsSet()) attributes.add("individual");
      if (!studyIsSet()) attributes.add("study");
      return "Cannot build ResearchSubject, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ResearchSubject", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ResearchSubject#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    IndividualBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ResearchSubject", generator = "Immutables")
  public interface IndividualBuildStage {
    /**
     * Initializes the value for the {@link ResearchSubject#individual() individual} attribute.
     * @param individual The value for individual 
     * @return {@code this} builder for use in a chained invocation
     */
    StudyBuildStage individual(com.fhir.Reference individual);
  }

  @org.immutables.value.Generated(from = "ResearchSubject", generator = "Immutables")
  public interface StudyBuildStage {
    /**
     * Initializes the value for the {@link ResearchSubject#study() study} attribute.
     * @param study The value for study 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal study(com.fhir.Reference study);
  }

  @org.immutables.value.Generated(from = "ResearchSubject", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ResearchSubject#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ResearchSubject#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ResearchSubject#actualArm() actualArm} to actualArm.
     * @param actualArm The value for actualArm
     * @return {@code this} builder for chained invocation
     */
    BuildFinal actualArm(java.lang.String actualArm);

    /**
     * Initializes the optional value {@link ResearchSubject#actualArm() actualArm} to actualArm.
     * @param actualArm The value for actualArm
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal actualArm(java.util.Optional<java.lang.String> actualArm);

    /**
     * Initializes the optional value {@link ResearchSubject#consent() consent} to consent.
     * @param consent The value for consent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal consent(com.fhir.Reference consent);

    /**
     * Initializes the optional value {@link ResearchSubject#consent() consent} to consent.
     * @param consent The value for consent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal consent(java.util.Optional<? extends com.fhir.Reference> consent);

    /**
     * Initializes the optional value {@link ResearchSubject#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ResearchSubject#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ResearchSubject#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ResearchSubject#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ResearchSubject#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ResearchSubject#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link ResearchSubject#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.Period period);

    /**
     * Initializes the optional value {@link ResearchSubject#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.Period> period);

    /**
     * Initializes the optional value {@link ResearchSubject#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ResearchSubject#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ResearchSubject#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchSubject#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchSubject#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ResearchsubjectStatus status);

    /**
     * Initializes the optional value {@link ResearchSubject#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ResearchsubjectStatus> status);

    /**
     * Initializes the optional value {@link ResearchSubject#assignedArm() assignedArm} to assignedArm.
     * @param assignedArm The value for assignedArm
     * @return {@code this} builder for chained invocation
     */
    BuildFinal assignedArm(java.lang.String assignedArm);

    /**
     * Initializes the optional value {@link ResearchSubject#assignedArm() assignedArm} to assignedArm.
     * @param assignedArm The value for assignedArm
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal assignedArm(java.util.Optional<java.lang.String> assignedArm);

    /**
     * Initializes the optional value {@link ResearchSubject#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ResearchSubject#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ResearchSubject#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ResearchSubject#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ResearchSubject#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ResearchSubject#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Builds a new {@link ResearchSubject ResearchSubject}.
     * @return An immutable instance of ResearchSubject
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ResearchSubject build();
  }
}

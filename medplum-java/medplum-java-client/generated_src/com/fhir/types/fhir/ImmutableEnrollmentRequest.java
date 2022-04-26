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
 * Immutable implementation of {@link EnrollmentRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEnrollmentRequest.builder()}.
 */
@Generated(from = "EnrollmentRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEnrollmentRequest implements EnrollmentRequest {
  private final @Nullable Reference coverage;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable DateTime created;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Code language;
  private final @Nullable Code status;
  private final @Nullable Reference candidate;
  private final @Nullable Meta meta;
  private final @Nullable Narrative text;
  private final @Nullable Reference provider;
  private final @Nullable Reference insurer;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Extension> extension;
  private final @Nullable Id id;
  private final String resourceType;

  private ImmutableEnrollmentRequest(
      @Nullable Reference coverage,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable DateTime created,
      @Nullable List<Extension> modifierExtension,
      @Nullable Code language,
      @Nullable Code status,
      @Nullable Reference candidate,
      @Nullable Meta meta,
      @Nullable Narrative text,
      @Nullable Reference provider,
      @Nullable Reference insurer,
      @Nullable List<Identifier> identifier,
      @Nullable List<Extension> extension,
      @Nullable Id id,
      String resourceType) {
    this.coverage = coverage;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.created = created;
    this.modifierExtension = modifierExtension;
    this.language = language;
    this.status = status;
    this.candidate = candidate;
    this.meta = meta;
    this.text = text;
    this.provider = provider;
    this.insurer = insurer;
    this.identifier = identifier;
    this.extension = extension;
    this.id = id;
    this.resourceType = resourceType;
  }

  /**
   * @return The value of the {@code coverage} attribute
   */
  @JsonProperty("coverage")
  @Override
  public Optional<Reference> coverage() {
    return Optional.ofNullable(coverage);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code created} attribute
   */
  @JsonProperty("created")
  @Override
  public Optional<DateTime> created() {
    return Optional.ofNullable(created);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code candidate} attribute
   */
  @JsonProperty("candidate")
  @Override
  public Optional<Reference> candidate() {
    return Optional.ofNullable(candidate);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code provider} attribute
   */
  @JsonProperty("provider")
  @Override
  public Optional<Reference> provider() {
    return Optional.ofNullable(provider);
  }

  /**
   * @return The value of the {@code insurer} attribute
   */
  @JsonProperty("insurer")
  @Override
  public Optional<Reference> insurer() {
    return Optional.ofNullable(insurer);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#coverage() coverage} attribute.
   * @param value The value for coverage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withCoverage(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "coverage");
    if (this.coverage == newValue) return this;
    return new ImmutableEnrollmentRequest(
        newValue,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#coverage() coverage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for coverage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withCoverage(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.coverage == value) return this;
    return new ImmutableEnrollmentRequest(
        value,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        newValue,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        value,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        newValue,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        value,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withCreated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        newValue,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withCreated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        value,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        newValue,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        value,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        newValue,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        value,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        newValue,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        value,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#candidate() candidate} attribute.
   * @param value The value for candidate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withCandidate(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "candidate");
    if (this.candidate == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        newValue,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#candidate() candidate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for candidate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withCandidate(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.candidate == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        value,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        newValue,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        value,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        newValue,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        value,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#provider() provider} attribute.
   * @param value The value for provider
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withProvider(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "provider");
    if (this.provider == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        newValue,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#provider() provider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withProvider(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.provider == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        value,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#insurer() insurer} attribute.
   * @param value The value for insurer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withInsurer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "insurer");
    if (this.insurer == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        newValue,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#insurer() insurer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withInsurer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.insurer == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        value,
        this.identifier,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        newValue,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        value,
        this.extension,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        newValue,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        value,
        this.id,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentRequest withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        newValue,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentRequest withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        value,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EnrollmentRequest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEnrollmentRequest withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEnrollmentRequest(
        this.coverage,
        this.implicitRules,
        this.contained,
        this.created,
        this.modifierExtension,
        this.language,
        this.status,
        this.candidate,
        this.meta,
        this.text,
        this.provider,
        this.insurer,
        this.identifier,
        this.extension,
        this.id,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEnrollmentRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEnrollmentRequest
        && equalTo((ImmutableEnrollmentRequest) another);
  }

  private boolean equalTo(ImmutableEnrollmentRequest another) {
    return Objects.equals(coverage, another.coverage)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(created, another.created)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(language, another.language)
        && Objects.equals(status, another.status)
        && Objects.equals(candidate, another.candidate)
        && Objects.equals(meta, another.meta)
        && Objects.equals(text, another.text)
        && Objects.equals(provider, another.provider)
        && Objects.equals(insurer, another.insurer)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && resourceType.equals(another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code coverage}, {@code implicitRules}, {@code contained}, {@code created}, {@code modifierExtension}, {@code language}, {@code status}, {@code candidate}, {@code meta}, {@code text}, {@code provider}, {@code insurer}, {@code identifier}, {@code extension}, {@code id}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(coverage);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(candidate);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(provider);
    h += (h << 5) + Objects.hashCode(insurer);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + resourceType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EnrollmentRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EnrollmentRequest{");
    if (coverage != null) {
      builder.append("coverage=").append(coverage);
    }
    if (implicitRules != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (created != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("created=").append(created);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (language != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (status != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (candidate != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("candidate=").append(candidate);
    }
    if (meta != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (text != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (provider != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("provider=").append(provider);
    }
    if (insurer != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("insurer=").append(insurer);
    }
    if (identifier != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "EnrollmentRequest", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements EnrollmentRequest {
    @Nullable Optional<Reference> coverage = Optional.empty();
    boolean coverageIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Reference> candidate = Optional.empty();
    boolean candidateIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Reference> provider = Optional.empty();
    boolean providerIsSet;
    @Nullable Optional<Reference> insurer = Optional.empty();
    boolean insurerIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable String resourceType;
    @JsonProperty("coverage")
    public void setCoverage(Optional<Reference> coverage) {
      this.coverage = coverage;
      this.coverageIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("candidate")
    public void setCandidate(Optional<Reference> candidate) {
      this.candidate = candidate;
      this.candidateIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("provider")
    public void setProvider(Optional<Reference> provider) {
      this.provider = provider;
      this.providerIsSet = true;
    }
    @JsonProperty("insurer")
    public void setInsurer(Optional<Reference> insurer) {
      this.insurer = insurer;
      this.insurerIsSet = true;
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
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @Override
    public Optional<Reference> coverage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> candidate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> provider() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> insurer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEnrollmentRequest fromJson(Json json) {
    ImmutableEnrollmentRequest.Builder builder = ((ImmutableEnrollmentRequest.Builder) ImmutableEnrollmentRequest.builder());
    if (json.coverageIsSet) {
      builder.coverage(json.coverage);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.candidateIsSet) {
      builder.candidate(json.candidate);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.providerIsSet) {
      builder.provider(json.provider);
    }
    if (json.insurerIsSet) {
      builder.insurer(json.insurer);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    return (ImmutableEnrollmentRequest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EnrollmentRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EnrollmentRequest instance
   */
  public static EnrollmentRequest copyOf(EnrollmentRequest instance) {
    if (instance instanceof ImmutableEnrollmentRequest) {
      return (ImmutableEnrollmentRequest) instance;
    }
    return ((ImmutableEnrollmentRequest.Builder) ImmutableEnrollmentRequest.builder())
        .coverage(instance.coverage())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .created(instance.created())
        .modifierExtension(instance.modifierExtension())
        .language(instance.language())
        .status(instance.status())
        .candidate(instance.candidate())
        .meta(instance.meta())
        .text(instance.text())
        .provider(instance.provider())
        .insurer(instance.insurer())
        .identifier(instance.identifier())
        .extension(instance.extension())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link EnrollmentRequest EnrollmentRequest}.
   * <pre>
   * ImmutableEnrollmentRequest.builder()
   *    .coverage(com.fhir.types.fhir.Reference) // optional {@link EnrollmentRequest#coverage() coverage}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link EnrollmentRequest#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link EnrollmentRequest#contained() contained}
   *    .created(com.fhir.types.fhir.DateTime) // optional {@link EnrollmentRequest#created() created}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link EnrollmentRequest#modifierExtension() modifierExtension}
   *    .language(com.fhir.types.fhir.Code) // optional {@link EnrollmentRequest#language() language}
   *    .status(com.fhir.types.fhir.Code) // optional {@link EnrollmentRequest#status() status}
   *    .candidate(com.fhir.types.fhir.Reference) // optional {@link EnrollmentRequest#candidate() candidate}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link EnrollmentRequest#meta() meta}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link EnrollmentRequest#text() text}
   *    .provider(com.fhir.types.fhir.Reference) // optional {@link EnrollmentRequest#provider() provider}
   *    .insurer(com.fhir.types.fhir.Reference) // optional {@link EnrollmentRequest#insurer() insurer}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link EnrollmentRequest#identifier() identifier}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link EnrollmentRequest#extension() extension}
   *    .id(com.fhir.types.fhir.Id) // optional {@link EnrollmentRequest#id() id}
   *    .resourceType(String) // required {@link EnrollmentRequest#resourceType() resourceType}
   *    .build();
   * </pre>
   * @return A new EnrollmentRequest builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableEnrollmentRequest.Builder();
  }

  /**
   * Builds instances of type {@link EnrollmentRequest EnrollmentRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EnrollmentRequest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_COVERAGE = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x4L;
    private static final long OPT_BIT_CREATED = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_STATUS = 0x40L;
    private static final long OPT_BIT_CANDIDATE = 0x80L;
    private static final long OPT_BIT_META = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_PROVIDER = 0x400L;
    private static final long OPT_BIT_INSURER = 0x800L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_ID = 0x4000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Reference coverage;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable DateTime created;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Code language;
    private @Nullable Code status;
    private @Nullable Reference candidate;
    private @Nullable Meta meta;
    private @Nullable Narrative text;
    private @Nullable Reference provider;
    private @Nullable Reference insurer;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Extension> extension;
    private @Nullable Id id;
    private @Nullable String resourceType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EnrollmentRequest#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for chained invocation
     */
    public final Builder coverage(Reference coverage) {
      checkNotIsSet(coverageIsSet(), "coverage");
      this.coverage = Objects.requireNonNull(coverage, "coverage");
      optBits |= OPT_BIT_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentRequest#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("coverage")
    public final Builder coverage(Optional<? extends Reference> coverage) {
      checkNotIsSet(coverageIsSet(), "coverage");
      this.coverage = coverage.orElse(null);
      optBits |= OPT_BIT_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EnrollmentRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EnrollmentRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link EnrollmentRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link EnrollmentRequest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    public final Builder created(DateTime created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = Objects.requireNonNull(created, "created");
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentRequest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("created")
    public final Builder created(Optional<? extends DateTime> created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = created.orElse(null);
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EnrollmentRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EnrollmentRequest#language() language} to language.
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
     * Initializes the optional value {@link EnrollmentRequest#language() language} to language.
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
     * Initializes the optional value {@link EnrollmentRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentRequest#candidate() candidate} to candidate.
     * @param candidate The value for candidate
     * @return {@code this} builder for chained invocation
     */
    public final Builder candidate(Reference candidate) {
      checkNotIsSet(candidateIsSet(), "candidate");
      this.candidate = Objects.requireNonNull(candidate, "candidate");
      optBits |= OPT_BIT_CANDIDATE;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentRequest#candidate() candidate} to candidate.
     * @param candidate The value for candidate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("candidate")
    public final Builder candidate(Optional<? extends Reference> candidate) {
      checkNotIsSet(candidateIsSet(), "candidate");
      this.candidate = candidate.orElse(null);
      optBits |= OPT_BIT_CANDIDATE;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link EnrollmentRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link EnrollmentRequest#text() text} to text.
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
     * Initializes the optional value {@link EnrollmentRequest#text() text} to text.
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
     * Initializes the optional value {@link EnrollmentRequest#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    public final Builder provider(Reference provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = Objects.requireNonNull(provider, "provider");
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentRequest#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provider")
    public final Builder provider(Optional<? extends Reference> provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = provider.orElse(null);
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentRequest#insurer() insurer} to insurer.
     * @param insurer The value for insurer
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurer(Reference insurer) {
      checkNotIsSet(insurerIsSet(), "insurer");
      this.insurer = Objects.requireNonNull(insurer, "insurer");
      optBits |= OPT_BIT_INSURER;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentRequest#insurer() insurer} to insurer.
     * @param insurer The value for insurer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("insurer")
    public final Builder insurer(Optional<? extends Reference> insurer) {
      checkNotIsSet(insurerIsSet(), "insurer");
      this.insurer = insurer.orElse(null);
      optBits |= OPT_BIT_INSURER;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EnrollmentRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EnrollmentRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link EnrollmentRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link EnrollmentRequest#id() id} to id.
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
     * Initializes the optional value {@link EnrollmentRequest#id() id} to id.
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
     * Initializes the value for the {@link EnrollmentRequest#resourceType() resourceType} attribute.
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
     * Builds a new {@link EnrollmentRequest EnrollmentRequest}.
     * @return An immutable instance of EnrollmentRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public EnrollmentRequest build() {
      checkRequiredAttributes();
      return new ImmutableEnrollmentRequest(
          coverage,
          implicitRules,
          contained,
          created,
          modifierExtension,
          language,
          status,
          candidate,
          meta,
          text,
          provider,
          insurer,
          identifier,
          extension,
          id,
          resourceType);
    }

    private boolean coverageIsSet() {
      return (optBits & OPT_BIT_COVERAGE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean candidateIsSet() {
      return (optBits & OPT_BIT_CANDIDATE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean providerIsSet() {
      return (optBits & OPT_BIT_PROVIDER) != 0;
    }

    private boolean insurerIsSet() {
      return (optBits & OPT_BIT_INSURER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of EnrollmentRequest is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build EnrollmentRequest, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "EnrollmentRequest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link EnrollmentRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "EnrollmentRequest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link EnrollmentRequest#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal coverage(Reference coverage);

    /**
     * Initializes the optional value {@link EnrollmentRequest#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverage(Optional<? extends Reference> coverage);

    /**
     * Initializes the optional value {@link EnrollmentRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link EnrollmentRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link EnrollmentRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link EnrollmentRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link EnrollmentRequest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(DateTime created);

    /**
     * Initializes the optional value {@link EnrollmentRequest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(Optional<? extends DateTime> created);

    /**
     * Initializes the optional value {@link EnrollmentRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link EnrollmentRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link EnrollmentRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link EnrollmentRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link EnrollmentRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link EnrollmentRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link EnrollmentRequest#candidate() candidate} to candidate.
     * @param candidate The value for candidate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal candidate(Reference candidate);

    /**
     * Initializes the optional value {@link EnrollmentRequest#candidate() candidate} to candidate.
     * @param candidate The value for candidate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal candidate(Optional<? extends Reference> candidate);

    /**
     * Initializes the optional value {@link EnrollmentRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link EnrollmentRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link EnrollmentRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link EnrollmentRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link EnrollmentRequest#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    BuildFinal provider(Reference provider);

    /**
     * Initializes the optional value {@link EnrollmentRequest#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal provider(Optional<? extends Reference> provider);

    /**
     * Initializes the optional value {@link EnrollmentRequest#insurer() insurer} to insurer.
     * @param insurer The value for insurer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurer(Reference insurer);

    /**
     * Initializes the optional value {@link EnrollmentRequest#insurer() insurer} to insurer.
     * @param insurer The value for insurer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurer(Optional<? extends Reference> insurer);

    /**
     * Initializes the optional value {@link EnrollmentRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link EnrollmentRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link EnrollmentRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link EnrollmentRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link EnrollmentRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link EnrollmentRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Builds a new {@link EnrollmentRequest EnrollmentRequest}.
     * @return An immutable instance of EnrollmentRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    EnrollmentRequest build();
  }
}

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
 * Immutable implementation of {@link EnrollmentResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEnrollmentResponse.builder()}.
 */
@Generated(from = "EnrollmentResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEnrollmentResponse implements EnrollmentResponse {
  private final @Nullable Narrative text;
  private final @Nullable Meta meta;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable List<Extension> extension;
  private final @Nullable DateTime created;
  private final @Nullable Id id;
  private final @Nullable Code status;
  private final String resourceType;
  private final @Nullable Reference requestProvider;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference organization;
  private final @Nullable Reference request;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable String disposition;
  private final @Nullable EnrollmentresponseOutcome outcome;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableEnrollmentResponse(
      @Nullable Narrative text,
      @Nullable Meta meta,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable List<Extension> extension,
      @Nullable DateTime created,
      @Nullable Id id,
      @Nullable Code status,
      String resourceType,
      @Nullable Reference requestProvider,
      @Nullable List<ResourceList> contained,
      @Nullable Reference organization,
      @Nullable Reference request,
      @Nullable List<Identifier> identifier,
      @Nullable String disposition,
      @Nullable EnrollmentresponseOutcome outcome,
      @Nullable List<Extension> modifierExtension) {
    this.text = text;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.language = language;
    this.extension = extension;
    this.created = created;
    this.id = id;
    this.status = status;
    this.resourceType = resourceType;
    this.requestProvider = requestProvider;
    this.contained = contained;
    this.organization = organization;
    this.request = request;
    this.identifier = identifier;
    this.disposition = disposition;
    this.outcome = outcome;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code requestProvider} attribute
   */
  @JsonProperty("requestProvider")
  @Override
  public Optional<Reference> requestProvider() {
    return Optional.ofNullable(requestProvider);
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
   * @return The value of the {@code organization} attribute
   */
  @JsonProperty("organization")
  @Override
  public Optional<Reference> organization() {
    return Optional.ofNullable(organization);
  }

  /**
   * @return The value of the {@code request} attribute
   */
  @JsonProperty("request")
  @Override
  public Optional<Reference> request() {
    return Optional.ofNullable(request);
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
   * @return The value of the {@code disposition} attribute
   */
  @JsonProperty("disposition")
  @Override
  public Optional<String> disposition() {
    return Optional.ofNullable(disposition);
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public Optional<EnrollmentresponseOutcome> outcome() {
    return Optional.ofNullable(outcome);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEnrollmentResponse(
        newValue,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEnrollmentResponse(
        value,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        newValue,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        value,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        newValue,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        value,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        newValue,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        value,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        newValue,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        value,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withCreated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        newValue,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withCreated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        value,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        newValue,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        value,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        newValue,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        value,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EnrollmentResponse#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEnrollmentResponse withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        newValue,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#requestProvider() requestProvider} attribute.
   * @param value The value for requestProvider
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withRequestProvider(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "requestProvider");
    if (this.requestProvider == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        newValue,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#requestProvider() requestProvider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestProvider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withRequestProvider(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.requestProvider == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        value,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        newValue,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        value,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#organization() organization} attribute.
   * @param value The value for organization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withOrganization(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "organization");
    if (this.organization == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        newValue,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#organization() organization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withOrganization(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.organization == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        value,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withRequest(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        newValue,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withRequest(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        value,
        this.identifier,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        newValue,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        value,
        this.disposition,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#disposition() disposition} attribute.
   * @param value The value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withDisposition(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "disposition");
    if (Objects.equals(this.disposition, newValue)) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        newValue,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#disposition() disposition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withDisposition(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.disposition, value)) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        value,
        this.outcome,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withOutcome(EnrollmentresponseOutcome value) {
    @Nullable EnrollmentresponseOutcome newValue = Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withOutcome(Optional<? extends EnrollmentresponseOutcome> optional) {
    @Nullable EnrollmentresponseOutcome value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EnrollmentResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEnrollmentResponse withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EnrollmentResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEnrollmentResponse withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEnrollmentResponse(
        this.text,
        this.meta,
        this.implicitRules,
        this.language,
        this.extension,
        this.created,
        this.id,
        this.status,
        this.resourceType,
        this.requestProvider,
        this.contained,
        this.organization,
        this.request,
        this.identifier,
        this.disposition,
        this.outcome,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEnrollmentResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEnrollmentResponse
        && equalTo((ImmutableEnrollmentResponse) another);
  }

  private boolean equalTo(ImmutableEnrollmentResponse another) {
    return Objects.equals(text, another.text)
        && Objects.equals(meta, another.meta)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(extension, another.extension)
        && Objects.equals(created, another.created)
        && Objects.equals(id, another.id)
        && Objects.equals(status, another.status)
        && resourceType.equals(another.resourceType)
        && Objects.equals(requestProvider, another.requestProvider)
        && Objects.equals(contained, another.contained)
        && Objects.equals(organization, another.organization)
        && Objects.equals(request, another.request)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(disposition, another.disposition)
        && Objects.equals(outcome, another.outcome)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code meta}, {@code implicitRules}, {@code language}, {@code extension}, {@code created}, {@code id}, {@code status}, {@code resourceType}, {@code requestProvider}, {@code contained}, {@code organization}, {@code request}, {@code identifier}, {@code disposition}, {@code outcome}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(requestProvider);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(organization);
    h += (h << 5) + Objects.hashCode(request);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(disposition);
    h += (h << 5) + Objects.hashCode(outcome);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code EnrollmentResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EnrollmentResponse{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (meta != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (created != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("created=").append(created);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (status != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (requestProvider != null) {
      builder.append(", ");
      builder.append("requestProvider=").append(requestProvider);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (organization != null) {
      builder.append(", ");
      builder.append("organization=").append(organization);
    }
    if (request != null) {
      builder.append(", ");
      builder.append("request=").append(request);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (disposition != null) {
      builder.append(", ");
      builder.append("disposition=").append(disposition);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
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
  @Generated(from = "EnrollmentResponse", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements EnrollmentResponse {
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Reference> requestProvider = Optional.empty();
    boolean requestProviderIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> organization = Optional.empty();
    boolean organizationIsSet;
    @Nullable Optional<Reference> request = Optional.empty();
    boolean requestIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<String> disposition = Optional.empty();
    boolean dispositionIsSet;
    @Nullable Optional<EnrollmentresponseOutcome> outcome = Optional.empty();
    boolean outcomeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
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
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("requestProvider")
    public void setRequestProvider(Optional<Reference> requestProvider) {
      this.requestProvider = requestProvider;
      this.requestProviderIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("organization")
    public void setOrganization(Optional<Reference> organization) {
      this.organization = organization;
      this.organizationIsSet = true;
    }
    @JsonProperty("request")
    public void setRequest(Optional<Reference> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("disposition")
    public void setDisposition(Optional<String> disposition) {
      this.disposition = disposition;
      this.dispositionIsSet = true;
    }
    @JsonProperty("outcome")
    public void setOutcome(Optional<EnrollmentresponseOutcome> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> requestProvider() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> organization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> request() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> disposition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<EnrollmentresponseOutcome> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEnrollmentResponse fromJson(Json json) {
    ImmutableEnrollmentResponse.Builder builder = ((ImmutableEnrollmentResponse.Builder) ImmutableEnrollmentResponse.builder());
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.requestProviderIsSet) {
      builder.requestProvider(json.requestProvider);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.organizationIsSet) {
      builder.organization(json.organization);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.dispositionIsSet) {
      builder.disposition(json.disposition);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableEnrollmentResponse) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EnrollmentResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EnrollmentResponse instance
   */
  public static EnrollmentResponse copyOf(EnrollmentResponse instance) {
    if (instance instanceof ImmutableEnrollmentResponse) {
      return (ImmutableEnrollmentResponse) instance;
    }
    return ((ImmutableEnrollmentResponse.Builder) ImmutableEnrollmentResponse.builder())
        .text(instance.text())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .extension(instance.extension())
        .created(instance.created())
        .id(instance.id())
        .status(instance.status())
        .resourceType(instance.resourceType())
        .requestProvider(instance.requestProvider())
        .contained(instance.contained())
        .organization(instance.organization())
        .request(instance.request())
        .identifier(instance.identifier())
        .disposition(instance.disposition())
        .outcome(instance.outcome())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link EnrollmentResponse EnrollmentResponse}.
   * <pre>
   * ImmutableEnrollmentResponse.builder()
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link EnrollmentResponse#text() text}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link EnrollmentResponse#meta() meta}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link EnrollmentResponse#implicitRules() implicitRules}
   *    .language(com.medplum.types.fhir.Code) // optional {@link EnrollmentResponse#language() language}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link EnrollmentResponse#extension() extension}
   *    .created(com.medplum.types.fhir.DateTime) // optional {@link EnrollmentResponse#created() created}
   *    .id(com.medplum.types.fhir.Id) // optional {@link EnrollmentResponse#id() id}
   *    .status(com.medplum.types.fhir.Code) // optional {@link EnrollmentResponse#status() status}
   *    .resourceType(String) // required {@link EnrollmentResponse#resourceType() resourceType}
   *    .requestProvider(com.medplum.types.fhir.Reference) // optional {@link EnrollmentResponse#requestProvider() requestProvider}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link EnrollmentResponse#contained() contained}
   *    .organization(com.medplum.types.fhir.Reference) // optional {@link EnrollmentResponse#organization() organization}
   *    .request(com.medplum.types.fhir.Reference) // optional {@link EnrollmentResponse#request() request}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link EnrollmentResponse#identifier() identifier}
   *    .disposition(String) // optional {@link EnrollmentResponse#disposition() disposition}
   *    .outcome(com.medplum.types.fhir.EnrollmentresponseOutcome) // optional {@link EnrollmentResponse#outcome() outcome}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link EnrollmentResponse#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new EnrollmentResponse builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableEnrollmentResponse.Builder();
  }

  /**
   * Builds instances of type {@link EnrollmentResponse EnrollmentResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EnrollmentResponse", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_CREATED = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_STATUS = 0x80L;
    private static final long OPT_BIT_REQUEST_PROVIDER = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_ORGANIZATION = 0x400L;
    private static final long OPT_BIT_REQUEST = 0x800L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_DISPOSITION = 0x2000L;
    private static final long OPT_BIT_OUTCOME = 0x4000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Narrative text;
    private @Nullable Meta meta;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable List<Extension> extension;
    private @Nullable DateTime created;
    private @Nullable Id id;
    private @Nullable Code status;
    private @Nullable String resourceType;
    private @Nullable Reference requestProvider;
    private @Nullable List<ResourceList> contained;
    private @Nullable Reference organization;
    private @Nullable Reference request;
    private @Nullable List<Identifier> identifier;
    private @Nullable String disposition;
    private @Nullable EnrollmentresponseOutcome outcome;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#text() text} to text.
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
     * Initializes the optional value {@link EnrollmentResponse#text() text} to text.
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
     * Initializes the optional value {@link EnrollmentResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link EnrollmentResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link EnrollmentResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EnrollmentResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EnrollmentResponse#language() language} to language.
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
     * Initializes the optional value {@link EnrollmentResponse#language() language} to language.
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
     * Initializes the optional value {@link EnrollmentResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link EnrollmentResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link EnrollmentResponse#created() created} to created.
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
     * Initializes the optional value {@link EnrollmentResponse#created() created} to created.
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
     * Initializes the optional value {@link EnrollmentResponse#id() id} to id.
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
     * Initializes the optional value {@link EnrollmentResponse#id() id} to id.
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
     * Initializes the optional value {@link EnrollmentResponse#status() status} to status.
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
     * Initializes the optional value {@link EnrollmentResponse#status() status} to status.
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
     * Initializes the value for the {@link EnrollmentResponse#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link EnrollmentResponse#requestProvider() requestProvider} to requestProvider.
     * @param requestProvider The value for requestProvider
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestProvider(Reference requestProvider) {
      checkNotIsSet(requestProviderIsSet(), "requestProvider");
      this.requestProvider = Objects.requireNonNull(requestProvider, "requestProvider");
      optBits |= OPT_BIT_REQUEST_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#requestProvider() requestProvider} to requestProvider.
     * @param requestProvider The value for requestProvider
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requestProvider")
    public final Builder requestProvider(Optional<? extends Reference> requestProvider) {
      checkNotIsSet(requestProviderIsSet(), "requestProvider");
      this.requestProvider = requestProvider.orElse(null);
      optBits |= OPT_BIT_REQUEST_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#contained() contained} to contained.
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
     * Initializes the optional value {@link EnrollmentResponse#contained() contained} to contained.
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
     * Initializes the optional value {@link EnrollmentResponse#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    public final Builder organization(Reference organization) {
      checkNotIsSet(organizationIsSet(), "organization");
      this.organization = Objects.requireNonNull(organization, "organization");
      optBits |= OPT_BIT_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organization")
    public final Builder organization(Optional<? extends Reference> organization) {
      checkNotIsSet(organizationIsSet(), "organization");
      this.organization = organization.orElse(null);
      optBits |= OPT_BIT_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(Reference request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("request")
    public final Builder request(Optional<? extends Reference> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EnrollmentResponse#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EnrollmentResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    public final Builder disposition(String disposition) {
      checkNotIsSet(dispositionIsSet(), "disposition");
      this.disposition = Objects.requireNonNull(disposition, "disposition");
      optBits |= OPT_BIT_DISPOSITION;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("disposition")
    public final Builder disposition(Optional<String> disposition) {
      checkNotIsSet(dispositionIsSet(), "disposition");
      this.disposition = disposition.orElse(null);
      optBits |= OPT_BIT_DISPOSITION;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(EnrollmentresponseOutcome outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(Optional<? extends EnrollmentresponseOutcome> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link EnrollmentResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EnrollmentResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link EnrollmentResponse EnrollmentResponse}.
     * @return An immutable instance of EnrollmentResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public EnrollmentResponse build() {
      checkRequiredAttributes();
      return new ImmutableEnrollmentResponse(
          text,
          meta,
          implicitRules,
          language,
          extension,
          created,
          id,
          status,
          resourceType,
          requestProvider,
          contained,
          organization,
          request,
          identifier,
          disposition,
          outcome,
          modifierExtension);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean requestProviderIsSet() {
      return (optBits & OPT_BIT_REQUEST_PROVIDER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean organizationIsSet() {
      return (optBits & OPT_BIT_ORGANIZATION) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean dispositionIsSet() {
      return (optBits & OPT_BIT_DISPOSITION) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of EnrollmentResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build EnrollmentResponse, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "EnrollmentResponse", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link EnrollmentResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "EnrollmentResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link EnrollmentResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link EnrollmentResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link EnrollmentResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link EnrollmentResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link EnrollmentResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link EnrollmentResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link EnrollmentResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link EnrollmentResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link EnrollmentResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link EnrollmentResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link EnrollmentResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(DateTime created);

    /**
     * Initializes the optional value {@link EnrollmentResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(Optional<? extends DateTime> created);

    /**
     * Initializes the optional value {@link EnrollmentResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link EnrollmentResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link EnrollmentResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link EnrollmentResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link EnrollmentResponse#requestProvider() requestProvider} to requestProvider.
     * @param requestProvider The value for requestProvider
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestProvider(Reference requestProvider);

    /**
     * Initializes the optional value {@link EnrollmentResponse#requestProvider() requestProvider} to requestProvider.
     * @param requestProvider The value for requestProvider
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestProvider(Optional<? extends Reference> requestProvider);

    /**
     * Initializes the optional value {@link EnrollmentResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link EnrollmentResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link EnrollmentResponse#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organization(Reference organization);

    /**
     * Initializes the optional value {@link EnrollmentResponse#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organization(Optional<? extends Reference> organization);

    /**
     * Initializes the optional value {@link EnrollmentResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(Reference request);

    /**
     * Initializes the optional value {@link EnrollmentResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(Optional<? extends Reference> request);

    /**
     * Initializes the optional value {@link EnrollmentResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link EnrollmentResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link EnrollmentResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disposition(String disposition);

    /**
     * Initializes the optional value {@link EnrollmentResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disposition(Optional<String> disposition);

    /**
     * Initializes the optional value {@link EnrollmentResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(EnrollmentresponseOutcome outcome);

    /**
     * Initializes the optional value {@link EnrollmentResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(Optional<? extends EnrollmentresponseOutcome> outcome);

    /**
     * Initializes the optional value {@link EnrollmentResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link EnrollmentResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link EnrollmentResponse EnrollmentResponse}.
     * @return An immutable instance of EnrollmentResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    EnrollmentResponse build();
  }
}

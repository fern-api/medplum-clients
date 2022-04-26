package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link SubstanceSpecification_Name}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSpecification_Name.builder()}.
 */
@Generated(from = "SubstanceSpecification_Name", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSpecification_Name
    implements SubstanceSpecification_Name {
  private final @Nullable CodeableConcept status;
  private final @Nullable String id;
  private final @Nullable List<CodeableConcept> domain;
  private final @Nullable Boolean preferred;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<SubstanceSpecification_Name> synonym;
  private final @Nullable List<SubstanceSpecification_Name> translation;
  private final @Nullable List<Reference> source;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable List<SubstanceSpecification_Official> official;
  private final @Nullable String name;
  private final @Nullable List<CodeableConcept> language;

  private ImmutableSubstanceSpecification_Name(
      @Nullable CodeableConcept status,
      @Nullable String id,
      @Nullable List<CodeableConcept> domain,
      @Nullable Boolean preferred,
      @Nullable CodeableConcept type,
      @Nullable List<SubstanceSpecification_Name> synonym,
      @Nullable List<SubstanceSpecification_Name> translation,
      @Nullable List<Reference> source,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable List<SubstanceSpecification_Official> official,
      @Nullable String name,
      @Nullable List<CodeableConcept> language) {
    this.status = status;
    this.id = id;
    this.domain = domain;
    this.preferred = preferred;
    this.type = type;
    this.synonym = synonym;
    this.translation = translation;
    this.source = source;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.jurisdiction = jurisdiction;
    this.official = official;
    this.name = name;
    this.language = language;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<CodeableConcept> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code domain} attribute
   */
  @JsonProperty("domain")
  @Override
  public Optional<List<CodeableConcept>> domain() {
    return Optional.ofNullable(domain);
  }

  /**
   * @return The value of the {@code preferred} attribute
   */
  @JsonProperty("preferred")
  @Override
  public Optional<Boolean> preferred() {
    return Optional.ofNullable(preferred);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code synonym} attribute
   */
  @JsonProperty("synonym")
  @Override
  public Optional<List<SubstanceSpecification_Name>> synonym() {
    return Optional.ofNullable(synonym);
  }

  /**
   * @return The value of the {@code translation} attribute
   */
  @JsonProperty("translation")
  @Override
  public Optional<List<SubstanceSpecification_Name>> translation() {
    return Optional.ofNullable(translation);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<List<Reference>> source() {
    return Optional.ofNullable(source);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
  }

  /**
   * @return The value of the {@code official} attribute
   */
  @JsonProperty("official")
  @Override
  public Optional<List<SubstanceSpecification_Official>> official() {
    return Optional.ofNullable(official);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<List<CodeableConcept>> language() {
    return Optional.ofNullable(language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSubstanceSpecification_Name(
        newValue,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Name withStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSubstanceSpecification_Name(
        value,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        newValue,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        value,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#domain() domain} attribute.
   * @param value The value for domain
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withDomain(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "domain");
    if (this.domain == newValue) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        newValue,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#domain() domain} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for domain
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Name withDomain(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.domain == value) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        value,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#preferred() preferred} attribute.
   * @param value The value for preferred
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withPreferred(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.preferred, newValue)) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        newValue,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#preferred() preferred} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preferred
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withPreferred(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.preferred, value)) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        value,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        newValue,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Name withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        value,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#synonym() synonym} attribute.
   * @param value The value for synonym
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withSynonym(List<SubstanceSpecification_Name> value) {
    @Nullable List<SubstanceSpecification_Name> newValue = Objects.requireNonNull(value, "synonym");
    if (this.synonym == newValue) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        newValue,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#synonym() synonym} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for synonym
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Name withSynonym(Optional<? extends List<SubstanceSpecification_Name>> optional) {
    @Nullable List<SubstanceSpecification_Name> value = optional.orElse(null);
    if (this.synonym == value) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        value,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#translation() translation} attribute.
   * @param value The value for translation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withTranslation(List<SubstanceSpecification_Name> value) {
    @Nullable List<SubstanceSpecification_Name> newValue = Objects.requireNonNull(value, "translation");
    if (this.translation == newValue) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        newValue,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#translation() translation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for translation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Name withTranslation(Optional<? extends List<SubstanceSpecification_Name>> optional) {
    @Nullable List<SubstanceSpecification_Name> value = optional.orElse(null);
    if (this.translation == value) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        value,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withSource(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        newValue,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Name withSource(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        value,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        newValue,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Name withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        value,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        newValue,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Name withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        value,
        this.jurisdiction,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        newValue,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Name withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        value,
        this.official,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#official() official} attribute.
   * @param value The value for official
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withOfficial(List<SubstanceSpecification_Official> value) {
    @Nullable List<SubstanceSpecification_Official> newValue = Objects.requireNonNull(value, "official");
    if (this.official == newValue) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        newValue,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#official() official} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for official
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Name withOfficial(Optional<? extends List<SubstanceSpecification_Official>> optional) {
    @Nullable List<SubstanceSpecification_Official> value = optional.orElse(null);
    if (this.official == value) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        value,
        this.name,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        newValue,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        value,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Name#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Name withLanguage(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Name#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Name withLanguage(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubstanceSpecification_Name(
        this.status,
        this.id,
        this.domain,
        this.preferred,
        this.type,
        this.synonym,
        this.translation,
        this.source,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.official,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSpecification_Name} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSpecification_Name
        && equalTo((ImmutableSubstanceSpecification_Name) another);
  }

  private boolean equalTo(ImmutableSubstanceSpecification_Name another) {
    return Objects.equals(status, another.status)
        && Objects.equals(id, another.id)
        && Objects.equals(domain, another.domain)
        && Objects.equals(preferred, another.preferred)
        && Objects.equals(type, another.type)
        && Objects.equals(synonym, another.synonym)
        && Objects.equals(translation, another.translation)
        && Objects.equals(source, another.source)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(official, another.official)
        && Objects.equals(name, another.name)
        && Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code id}, {@code domain}, {@code preferred}, {@code type}, {@code synonym}, {@code translation}, {@code source}, {@code extension}, {@code modifierExtension}, {@code jurisdiction}, {@code official}, {@code name}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(domain);
    h += (h << 5) + Objects.hashCode(preferred);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(synonym);
    h += (h << 5) + Objects.hashCode(translation);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(official);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSpecification_Name} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSpecification_Name{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (id != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (domain != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("domain=").append(domain);
    }
    if (preferred != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("preferred=").append(preferred);
    }
    if (type != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (synonym != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("synonym=").append(synonym);
    }
    if (translation != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("translation=").append(translation);
    }
    if (source != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (extension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (jurisdiction != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (official != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("official=").append(official);
    }
    if (name != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (language != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("language=").append(language);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSpecification_Name", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSpecification_Name {
    @Nullable Optional<CodeableConcept> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<CodeableConcept>> domain = Optional.empty();
    boolean domainIsSet;
    @Nullable Optional<Boolean> preferred = Optional.empty();
    boolean preferredIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<SubstanceSpecification_Name>> synonym = Optional.empty();
    boolean synonymIsSet;
    @Nullable Optional<List<SubstanceSpecification_Name>> translation = Optional.empty();
    boolean translationIsSet;
    @Nullable Optional<List<Reference>> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<List<SubstanceSpecification_Official>> official = Optional.empty();
    boolean officialIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<CodeableConcept>> language = Optional.empty();
    boolean languageIsSet;
    @JsonProperty("status")
    public void setStatus(Optional<CodeableConcept> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("domain")
    public void setDomain(Optional<List<CodeableConcept>> domain) {
      this.domain = domain;
      this.domainIsSet = true;
    }
    @JsonProperty("preferred")
    public void setPreferred(Optional<Boolean> preferred) {
      this.preferred = preferred;
      this.preferredIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("synonym")
    public void setSynonym(Optional<List<SubstanceSpecification_Name>> synonym) {
      this.synonym = synonym;
      this.synonymIsSet = true;
    }
    @JsonProperty("translation")
    public void setTranslation(Optional<List<SubstanceSpecification_Name>> translation) {
      this.translation = translation;
      this.translationIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<List<Reference>> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("official")
    public void setOfficial(Optional<List<SubstanceSpecification_Official>> official) {
      this.official = official;
      this.officialIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<List<CodeableConcept>> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> domain() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> preferred() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSpecification_Name>> synonym() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSpecification_Name>> translation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSpecification_Official>> official() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> language() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSpecification_Name fromJson(Json json) {
    ImmutableSubstanceSpecification_Name.Builder builder = ImmutableSubstanceSpecification_Name.builder();
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.domainIsSet) {
      builder.domain(json.domain);
    }
    if (json.preferredIsSet) {
      builder.preferred(json.preferred);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.synonymIsSet) {
      builder.synonym(json.synonym);
    }
    if (json.translationIsSet) {
      builder.translation(json.translation);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.officialIsSet) {
      builder.official(json.official);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    return (ImmutableSubstanceSpecification_Name) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSpecification_Name} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSpecification_Name instance
   */
  public static SubstanceSpecification_Name copyOf(SubstanceSpecification_Name instance) {
    if (instance instanceof ImmutableSubstanceSpecification_Name) {
      return (ImmutableSubstanceSpecification_Name) instance;
    }
    return ImmutableSubstanceSpecification_Name.builder()
        .status(instance.status())
        .id(instance.id())
        .domain(instance.domain())
        .preferred(instance.preferred())
        .type(instance.type())
        .synonym(instance.synonym())
        .translation(instance.translation())
        .source(instance.source())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .jurisdiction(instance.jurisdiction())
        .official(instance.official())
        .name(instance.name())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSpecification_Name SubstanceSpecification_Name}.
   * <pre>
   * ImmutableSubstanceSpecification_Name.builder()
   *    .status(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Name#status() status}
   *    .id(String) // optional {@link SubstanceSpecification_Name#id() id}
   *    .domain(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link SubstanceSpecification_Name#domain() domain}
   *    .preferred(Boolean) // optional {@link SubstanceSpecification_Name#preferred() preferred}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Name#type() type}
   *    .synonym(List&amp;lt;com.medplum.types.fhir.SubstanceSpecification_Name&amp;gt;) // optional {@link SubstanceSpecification_Name#synonym() synonym}
   *    .translation(List&amp;lt;com.medplum.types.fhir.SubstanceSpecification_Name&amp;gt;) // optional {@link SubstanceSpecification_Name#translation() translation}
   *    .source(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link SubstanceSpecification_Name#source() source}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Name#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Name#modifierExtension() modifierExtension}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link SubstanceSpecification_Name#jurisdiction() jurisdiction}
   *    .official(List&amp;lt;com.medplum.types.fhir.SubstanceSpecification_Official&amp;gt;) // optional {@link SubstanceSpecification_Name#official() official}
   *    .name(String) // optional {@link SubstanceSpecification_Name#name() name}
   *    .language(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link SubstanceSpecification_Name#language() language}
   *    .build();
   * </pre>
   * @return A new SubstanceSpecification_Name builder
   */
  public static ImmutableSubstanceSpecification_Name.Builder builder() {
    return new ImmutableSubstanceSpecification_Name.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSpecification_Name SubstanceSpecification_Name}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSpecification_Name", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_DOMAIN = 0x4L;
    private static final long OPT_BIT_PREFERRED = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_SYNONYM = 0x20L;
    private static final long OPT_BIT_TRANSLATION = 0x40L;
    private static final long OPT_BIT_SOURCE = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_JURISDICTION = 0x400L;
    private static final long OPT_BIT_OFFICIAL = 0x800L;
    private static final long OPT_BIT_NAME = 0x1000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000L;
    private long optBits;

    private @Nullable CodeableConcept status;
    private @Nullable String id;
    private @Nullable List<CodeableConcept> domain;
    private @Nullable Boolean preferred;
    private @Nullable CodeableConcept type;
    private @Nullable List<SubstanceSpecification_Name> synonym;
    private @Nullable List<SubstanceSpecification_Name> translation;
    private @Nullable List<Reference> source;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable List<SubstanceSpecification_Official> official;
    private @Nullable String name;
    private @Nullable List<CodeableConcept> language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(CodeableConcept status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends CodeableConcept> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    public final Builder domain(List<CodeableConcept> domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = Objects.requireNonNull(domain, "domain");
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("domain")
    public final Builder domain(Optional<? extends List<CodeableConcept>> domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = domain.orElse(null);
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#preferred() preferred} to preferred.
     * @param preferred The value for preferred
     * @return {@code this} builder for chained invocation
     */
    public final Builder preferred(boolean preferred) {
      checkNotIsSet(preferredIsSet(), "preferred");
      this.preferred = preferred;
      optBits |= OPT_BIT_PREFERRED;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#preferred() preferred} to preferred.
     * @param preferred The value for preferred
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preferred")
    public final Builder preferred(Optional<Boolean> preferred) {
      checkNotIsSet(preferredIsSet(), "preferred");
      this.preferred = preferred.orElse(null);
      optBits |= OPT_BIT_PREFERRED;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#synonym() synonym} to synonym.
     * @param synonym The value for synonym
     * @return {@code this} builder for chained invocation
     */
    public final Builder synonym(List<SubstanceSpecification_Name> synonym) {
      checkNotIsSet(synonymIsSet(), "synonym");
      this.synonym = Objects.requireNonNull(synonym, "synonym");
      optBits |= OPT_BIT_SYNONYM;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#synonym() synonym} to synonym.
     * @param synonym The value for synonym
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("synonym")
    public final Builder synonym(Optional<? extends List<SubstanceSpecification_Name>> synonym) {
      checkNotIsSet(synonymIsSet(), "synonym");
      this.synonym = synonym.orElse(null);
      optBits |= OPT_BIT_SYNONYM;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#translation() translation} to translation.
     * @param translation The value for translation
     * @return {@code this} builder for chained invocation
     */
    public final Builder translation(List<SubstanceSpecification_Name> translation) {
      checkNotIsSet(translationIsSet(), "translation");
      this.translation = Objects.requireNonNull(translation, "translation");
      optBits |= OPT_BIT_TRANSLATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#translation() translation} to translation.
     * @param translation The value for translation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("translation")
    public final Builder translation(Optional<? extends List<SubstanceSpecification_Name>> translation) {
      checkNotIsSet(translationIsSet(), "translation");
      this.translation = translation.orElse(null);
      optBits |= OPT_BIT_TRANSLATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(List<Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends List<Reference>> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Name#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Name#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Name#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Name#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(List<CodeableConcept> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jurisdiction")
    public final Builder jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#official() official} to official.
     * @param official The value for official
     * @return {@code this} builder for chained invocation
     */
    public final Builder official(List<SubstanceSpecification_Official> official) {
      checkNotIsSet(officialIsSet(), "official");
      this.official = Objects.requireNonNull(official, "official");
      optBits |= OPT_BIT_OFFICIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#official() official} to official.
     * @param official The value for official
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("official")
    public final Builder official(Optional<? extends List<SubstanceSpecification_Official>> official) {
      checkNotIsSet(officialIsSet(), "official");
      this.official = official.orElse(null);
      optBits |= OPT_BIT_OFFICIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(List<CodeableConcept> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Name#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends List<CodeableConcept>> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSpecification_Name SubstanceSpecification_Name}.
     * @return An immutable instance of SubstanceSpecification_Name
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSpecification_Name build() {
      return new ImmutableSubstanceSpecification_Name(
          status,
          id,
          domain,
          preferred,
          type,
          synonym,
          translation,
          source,
          extension,
          modifierExtension,
          jurisdiction,
          official,
          name,
          language);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean domainIsSet() {
      return (optBits & OPT_BIT_DOMAIN) != 0;
    }

    private boolean preferredIsSet() {
      return (optBits & OPT_BIT_PREFERRED) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean synonymIsSet() {
      return (optBits & OPT_BIT_SYNONYM) != 0;
    }

    private boolean translationIsSet() {
      return (optBits & OPT_BIT_TRANSLATION) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean officialIsSet() {
      return (optBits & OPT_BIT_OFFICIAL) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSpecification_Name is strict, attribute is already set: ".concat(name));
    }
  }
}

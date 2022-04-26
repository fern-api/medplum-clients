package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Consent_Provision}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConsent_Provision.builder()}.
 */
@Generated(from = "Consent_Provision", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConsent_Provision implements Consent_Provision {
  private final @Nullable String id;
  private final @Nullable List<Consent_Actor> actor;
  private final @Nullable List<Coding> purpose;
  private final @Nullable Consent_ProvisionType type;
  private final @Nullable List<Coding> securityLabel;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> code;
  private final @Nullable Period dataPeriod;
  private final @Nullable List<Consent_Provision> provision;
  private final @Nullable List<Coding> _class;
  private final @Nullable List<Consent_Data> data;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CodeableConcept> action;
  private final @Nullable Period period;

  private ImmutableConsent_Provision(
      @Nullable String id,
      @Nullable List<Consent_Actor> actor,
      @Nullable List<Coding> purpose,
      @Nullable Consent_ProvisionType type,
      @Nullable List<Coding> securityLabel,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> code,
      @Nullable Period dataPeriod,
      @Nullable List<Consent_Provision> provision,
      @Nullable List<Coding> _class,
      @Nullable List<Consent_Data> data,
      @Nullable List<Extension> extension,
      @Nullable List<CodeableConcept> action,
      @Nullable Period period) {
    this.id = id;
    this.actor = actor;
    this.purpose = purpose;
    this.type = type;
    this.securityLabel = securityLabel;
    this.modifierExtension = modifierExtension;
    this.code = code;
    this.dataPeriod = dataPeriod;
    this.provision = provision;
    this._class = _class;
    this.data = data;
    this.extension = extension;
    this.action = action;
    this.period = period;
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
   * @return The value of the {@code actor} attribute
   */
  @JsonProperty("actor")
  @Override
  public Optional<List<Consent_Actor>> actor() {
    return Optional.ofNullable(actor);
  }

  /**
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<List<Coding>> purpose() {
    return Optional.ofNullable(purpose);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Consent_ProvisionType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code securityLabel} attribute
   */
  @JsonProperty("securityLabel")
  @Override
  public Optional<List<Coding>> securityLabel() {
    return Optional.ofNullable(securityLabel);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<List<CodeableConcept>> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code dataPeriod} attribute
   */
  @JsonProperty("dataPeriod")
  @Override
  public Optional<Period> dataPeriod() {
    return Optional.ofNullable(dataPeriod);
  }

  /**
   * @return The value of the {@code provision} attribute
   */
  @JsonProperty("provision")
  @Override
  public Optional<List<Consent_Provision>> provision() {
    return Optional.ofNullable(provision);
  }

  /**
   * @return The value of the {@code _class} attribute
   */
  @JsonProperty("class")
  @Override
  public Optional<List<Coding>> _class() {
    return Optional.ofNullable(_class);
  }

  /**
   * @return The value of the {@code data} attribute
   */
  @JsonProperty("data")
  @Override
  public Optional<List<Consent_Data>> data() {
    return Optional.ofNullable(data);
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
   * @return The value of the {@code action} attribute
   */
  @JsonProperty("action")
  @Override
  public Optional<List<CodeableConcept>> action() {
    return Optional.ofNullable(action);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableConsent_Provision(
        newValue,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableConsent_Provision(
        value,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#actor() actor} attribute.
   * @param value The value for actor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withActor(List<Consent_Actor> value) {
    @Nullable List<Consent_Actor> newValue = Objects.requireNonNull(value, "actor");
    if (this.actor == newValue) return this;
    return new ImmutableConsent_Provision(
        this.id,
        newValue,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#actor() actor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Provision withActor(Optional<? extends List<Consent_Actor>> optional) {
    @Nullable List<Consent_Actor> value = optional.orElse(null);
    if (this.actor == value) return this;
    return new ImmutableConsent_Provision(
        this.id,
        value,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withPurpose(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        newValue,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Provision withPurpose(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        value,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withType(Consent_ProvisionType value) {
    @Nullable Consent_ProvisionType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        newValue,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Provision withType(Optional<? extends Consent_ProvisionType> optional) {
    @Nullable Consent_ProvisionType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        value,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#securityLabel() securityLabel} attribute.
   * @param value The value for securityLabel
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withSecurityLabel(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "securityLabel");
    if (this.securityLabel == newValue) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        newValue,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#securityLabel() securityLabel} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityLabel
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Provision withSecurityLabel(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.securityLabel == value) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        value,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        newValue,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Provision withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        value,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        newValue,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Provision withCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        value,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#dataPeriod() dataPeriod} attribute.
   * @param value The value for dataPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withDataPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "dataPeriod");
    if (this.dataPeriod == newValue) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        newValue,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#dataPeriod() dataPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dataPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Provision withDataPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.dataPeriod == value) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        value,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#provision() provision} attribute.
   * @param value The value for provision
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withProvision(List<Consent_Provision> value) {
    @Nullable List<Consent_Provision> newValue = Objects.requireNonNull(value, "provision");
    if (this.provision == newValue) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        newValue,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#provision() provision} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provision
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Provision withProvision(Optional<? extends List<Consent_Provision>> optional) {
    @Nullable List<Consent_Provision> value = optional.orElse(null);
    if (this.provision == value) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        value,
        this._class,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#_class() _class} attribute.
   * @param value The value for _class
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision with_class(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "_class");
    if (this._class == newValue) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        newValue,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#_class() _class} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _class
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Provision with_class(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this._class == value) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        value,
        this.data,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#data() data} attribute.
   * @param value The value for data
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withData(List<Consent_Data> value) {
    @Nullable List<Consent_Data> newValue = Objects.requireNonNull(value, "data");
    if (this.data == newValue) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        newValue,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#data() data} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for data
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Provision withData(Optional<? extends List<Consent_Data>> optional) {
    @Nullable List<Consent_Data> value = optional.orElse(null);
    if (this.data == value) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        value,
        this.extension,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        newValue,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Provision withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        value,
        this.action,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withAction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        newValue,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Provision withAction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        value,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Provision#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Provision withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Provision#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Provision withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableConsent_Provision(
        this.id,
        this.actor,
        this.purpose,
        this.type,
        this.securityLabel,
        this.modifierExtension,
        this.code,
        this.dataPeriod,
        this.provision,
        this._class,
        this.data,
        this.extension,
        this.action,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConsent_Provision} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConsent_Provision
        && equalTo((ImmutableConsent_Provision) another);
  }

  private boolean equalTo(ImmutableConsent_Provision another) {
    return Objects.equals(id, another.id)
        && Objects.equals(actor, another.actor)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(type, another.type)
        && Objects.equals(securityLabel, another.securityLabel)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(code, another.code)
        && Objects.equals(dataPeriod, another.dataPeriod)
        && Objects.equals(provision, another.provision)
        && Objects.equals(_class, another._class)
        && Objects.equals(data, another.data)
        && Objects.equals(extension, another.extension)
        && Objects.equals(action, another.action)
        && Objects.equals(period, another.period);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code actor}, {@code purpose}, {@code type}, {@code securityLabel}, {@code modifierExtension}, {@code code}, {@code dataPeriod}, {@code provision}, {@code _class}, {@code data}, {@code extension}, {@code action}, {@code period}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(actor);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(securityLabel);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(dataPeriod);
    h += (h << 5) + Objects.hashCode(provision);
    h += (h << 5) + Objects.hashCode(_class);
    h += (h << 5) + Objects.hashCode(data);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(action);
    h += (h << 5) + Objects.hashCode(period);
    return h;
  }

  /**
   * Prints the immutable value {@code Consent_Provision} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Consent_Provision{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (actor != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("actor=").append(actor);
    }
    if (purpose != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (type != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (securityLabel != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("securityLabel=").append(securityLabel);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (code != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (dataPeriod != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("dataPeriod=").append(dataPeriod);
    }
    if (provision != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("provision=").append(provision);
    }
    if (_class != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("_class=").append(_class);
    }
    if (data != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("data=").append(data);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (action != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("action=").append(action);
    }
    if (period != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("period=").append(period);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Consent_Provision", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Consent_Provision {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Consent_Actor>> actor = Optional.empty();
    boolean actorIsSet;
    @Nullable Optional<List<Coding>> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<Consent_ProvisionType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Coding>> securityLabel = Optional.empty();
    boolean securityLabelIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Period> dataPeriod = Optional.empty();
    boolean dataPeriodIsSet;
    @Nullable Optional<List<Consent_Provision>> provision = Optional.empty();
    boolean provisionIsSet;
    @Nullable Optional<List<Coding>> _class = Optional.empty();
    boolean _classIsSet;
    @Nullable Optional<List<Consent_Data>> data = Optional.empty();
    boolean dataIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CodeableConcept>> action = Optional.empty();
    boolean actionIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("actor")
    public void setActor(Optional<List<Consent_Actor>> actor) {
      this.actor = actor;
      this.actorIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<List<Coding>> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Consent_ProvisionType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("securityLabel")
    public void setSecurityLabel(Optional<List<Coding>> securityLabel) {
      this.securityLabel = securityLabel;
      this.securityLabelIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<List<CodeableConcept>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("dataPeriod")
    public void setDataPeriod(Optional<Period> dataPeriod) {
      this.dataPeriod = dataPeriod;
      this.dataPeriodIsSet = true;
    }
    @JsonProperty("provision")
    public void setProvision(Optional<List<Consent_Provision>> provision) {
      this.provision = provision;
      this.provisionIsSet = true;
    }
    @JsonProperty("class")
    public void set_class(Optional<List<Coding>> _class) {
      this._class = _class;
      this._classIsSet = true;
    }
    @JsonProperty("data")
    public void setData(Optional<List<Consent_Data>> data) {
      this.data = data;
      this.dataIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("action")
    public void setAction(Optional<List<CodeableConcept>> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Consent_Actor>> actor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Consent_ProvisionType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> securityLabel() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> dataPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Consent_Provision>> provision() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> _class() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Consent_Data>> data() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> action() { throw new UnsupportedOperationException(); }
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
  static ImmutableConsent_Provision fromJson(Json json) {
    ImmutableConsent_Provision.Builder builder = ImmutableConsent_Provision.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.actorIsSet) {
      builder.actor(json.actor);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.securityLabelIsSet) {
      builder.securityLabel(json.securityLabel);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.dataPeriodIsSet) {
      builder.dataPeriod(json.dataPeriod);
    }
    if (json.provisionIsSet) {
      builder.provision(json.provision);
    }
    if (json._classIsSet) {
      builder._class(json._class);
    }
    if (json.dataIsSet) {
      builder.data(json.data);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.actionIsSet) {
      builder.action(json.action);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    return (ImmutableConsent_Provision) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Consent_Provision} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Consent_Provision instance
   */
  public static Consent_Provision copyOf(Consent_Provision instance) {
    if (instance instanceof ImmutableConsent_Provision) {
      return (ImmutableConsent_Provision) instance;
    }
    return ImmutableConsent_Provision.builder()
        .id(instance.id())
        .actor(instance.actor())
        .purpose(instance.purpose())
        .type(instance.type())
        .securityLabel(instance.securityLabel())
        .modifierExtension(instance.modifierExtension())
        .code(instance.code())
        .dataPeriod(instance.dataPeriod())
        .provision(instance.provision())
        ._class(instance._class())
        .data(instance.data())
        .extension(instance.extension())
        .action(instance.action())
        .period(instance.period())
        .build();
  }

  /**
   * Creates a builder for {@link Consent_Provision Consent_Provision}.
   * <pre>
   * ImmutableConsent_Provision.builder()
   *    .id(String) // optional {@link Consent_Provision#id() id}
   *    .actor(List&amp;lt;com.fhir.types.fhir.Consent_Actor&amp;gt;) // optional {@link Consent_Provision#actor() actor}
   *    .purpose(List&amp;lt;com.fhir.types.fhir.Coding&amp;gt;) // optional {@link Consent_Provision#purpose() purpose}
   *    .type(Consent_ProvisionType) // optional {@link Consent_Provision#type() type}
   *    .securityLabel(List&amp;lt;com.fhir.types.fhir.Coding&amp;gt;) // optional {@link Consent_Provision#securityLabel() securityLabel}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Consent_Provision#modifierExtension() modifierExtension}
   *    .code(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Consent_Provision#code() code}
   *    .dataPeriod(com.fhir.types.fhir.Period) // optional {@link Consent_Provision#dataPeriod() dataPeriod}
   *    .provision(List&amp;lt;com.fhir.types.fhir.Consent_Provision&amp;gt;) // optional {@link Consent_Provision#provision() provision}
   *    ._class(List&amp;lt;com.fhir.types.fhir.Coding&amp;gt;) // optional {@link Consent_Provision#_class() _class}
   *    .data(List&amp;lt;com.fhir.types.fhir.Consent_Data&amp;gt;) // optional {@link Consent_Provision#data() data}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Consent_Provision#extension() extension}
   *    .action(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Consent_Provision#action() action}
   *    .period(com.fhir.types.fhir.Period) // optional {@link Consent_Provision#period() period}
   *    .build();
   * </pre>
   * @return A new Consent_Provision builder
   */
  public static ImmutableConsent_Provision.Builder builder() {
    return new ImmutableConsent_Provision.Builder();
  }

  /**
   * Builds instances of type {@link Consent_Provision Consent_Provision}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Consent_Provision", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_ACTOR = 0x2L;
    private static final long OPT_BIT_PURPOSE = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_SECURITY_LABEL = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_CODE = 0x40L;
    private static final long OPT_BIT_DATA_PERIOD = 0x80L;
    private static final long OPT_BIT_PROVISION = 0x100L;
    private static final long OPT_BIT__CLASS = 0x200L;
    private static final long OPT_BIT_DATA = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_ACTION = 0x1000L;
    private static final long OPT_BIT_PERIOD = 0x2000L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Consent_Actor> actor;
    private @Nullable List<Coding> purpose;
    private @Nullable Consent_ProvisionType type;
    private @Nullable List<Coding> securityLabel;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> code;
    private @Nullable Period dataPeriod;
    private @Nullable List<Consent_Provision> provision;
    private @Nullable List<Coding> _class;
    private @Nullable List<Consent_Data> data;
    private @Nullable List<Extension> extension;
    private @Nullable List<CodeableConcept> action;
    private @Nullable Period period;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Consent_Provision#id() id} to id.
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
     * Initializes the optional value {@link Consent_Provision#id() id} to id.
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
     * Initializes the optional value {@link Consent_Provision#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for chained invocation
     */
    public final Builder actor(List<Consent_Actor> actor) {
      checkNotIsSet(actorIsSet(), "actor");
      this.actor = Objects.requireNonNull(actor, "actor");
      optBits |= OPT_BIT_ACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("actor")
    public final Builder actor(Optional<? extends List<Consent_Actor>> actor) {
      checkNotIsSet(actorIsSet(), "actor");
      this.actor = actor.orElse(null);
      optBits |= OPT_BIT_ACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    public final Builder purpose(List<Coding> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = Objects.requireNonNull(purpose, "purpose");
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("purpose")
    public final Builder purpose(Optional<? extends List<Coding>> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = purpose.orElse(null);
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Consent_ProvisionType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Consent_ProvisionType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityLabel(List<Coding> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = Objects.requireNonNull(securityLabel, "securityLabel");
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("securityLabel")
    public final Builder securityLabel(Optional<? extends List<Coding>> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = securityLabel.orElse(null);
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent_Provision#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent_Provision#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(List<CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends List<CodeableConcept>> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#dataPeriod() dataPeriod} to dataPeriod.
     * @param dataPeriod The value for dataPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder dataPeriod(Period dataPeriod) {
      checkNotIsSet(dataPeriodIsSet(), "dataPeriod");
      this.dataPeriod = Objects.requireNonNull(dataPeriod, "dataPeriod");
      optBits |= OPT_BIT_DATA_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#dataPeriod() dataPeriod} to dataPeriod.
     * @param dataPeriod The value for dataPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataPeriod")
    public final Builder dataPeriod(Optional<? extends Period> dataPeriod) {
      checkNotIsSet(dataPeriodIsSet(), "dataPeriod");
      this.dataPeriod = dataPeriod.orElse(null);
      optBits |= OPT_BIT_DATA_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#provision() provision} to provision.
     * @param provision The value for provision
     * @return {@code this} builder for chained invocation
     */
    public final Builder provision(List<Consent_Provision> provision) {
      checkNotIsSet(provisionIsSet(), "provision");
      this.provision = Objects.requireNonNull(provision, "provision");
      optBits |= OPT_BIT_PROVISION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#provision() provision} to provision.
     * @param provision The value for provision
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provision")
    public final Builder provision(Optional<? extends List<Consent_Provision>> provision) {
      checkNotIsSet(provisionIsSet(), "provision");
      this.provision = provision.orElse(null);
      optBits |= OPT_BIT_PROVISION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for chained invocation
     */
    public final Builder _class(List<Coding> _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = Objects.requireNonNull(_class, "_class");
      optBits |= OPT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("class")
    public final Builder _class(Optional<? extends List<Coding>> _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = _class.orElse(null);
      optBits |= OPT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    public final Builder data(List<Consent_Data> data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = Objects.requireNonNull(data, "data");
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("data")
    public final Builder data(Optional<? extends List<Consent_Data>> data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = data.orElse(null);
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent_Provision#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent_Provision#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(List<CodeableConcept> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("action")
    public final Builder action(Optional<? extends List<CodeableConcept>> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Provision#period() period} to period.
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
     * Initializes the optional value {@link Consent_Provision#period() period} to period.
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
     * Builds a new {@link Consent_Provision Consent_Provision}.
     * @return An immutable instance of Consent_Provision
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Consent_Provision build() {
      return new ImmutableConsent_Provision(
          id,
          actor,
          purpose,
          type,
          securityLabel,
          modifierExtension,
          code,
          dataPeriod,
          provision,
          _class,
          data,
          extension,
          action,
          period);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean actorIsSet() {
      return (optBits & OPT_BIT_ACTOR) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean securityLabelIsSet() {
      return (optBits & OPT_BIT_SECURITY_LABEL) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean dataPeriodIsSet() {
      return (optBits & OPT_BIT_DATA_PERIOD) != 0;
    }

    private boolean provisionIsSet() {
      return (optBits & OPT_BIT_PROVISION) != 0;
    }

    private boolean _classIsSet() {
      return (optBits & OPT_BIT__CLASS) != 0;
    }

    private boolean dataIsSet() {
      return (optBits & OPT_BIT_DATA) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Consent_Provision is strict, attribute is already set: ".concat(name));
    }
  }
}

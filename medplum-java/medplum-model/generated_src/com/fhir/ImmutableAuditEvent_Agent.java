package com.fhir;

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
 * Immutable implementation of {@link AuditEvent_Agent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuditEvent_Agent.builder()}.
 */
@Generated(from = "AuditEvent_Agent", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAuditEvent_Agent implements AuditEvent_Agent {
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean requestor;
  private final @Nullable Coding media;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable AuditEvent_Network network;
  private final @Nullable String id;
  private final @Nullable String altId;
  private final @Nullable List<com.fhir.uri> policy;
  private final @Nullable List<CodeableConcept> role;
  private final @Nullable CodeableConcept type;
  private final @Nullable Reference who;
  private final @Nullable String name;
  private final @Nullable List<CodeableConcept> purposeOfUse;
  private final @Nullable Reference location;

  private ImmutableAuditEvent_Agent(
      @Nullable List<Extension> extension,
      @Nullable Boolean requestor,
      @Nullable Coding media,
      @Nullable List<Extension> modifierExtension,
      @Nullable AuditEvent_Network network,
      @Nullable String id,
      @Nullable String altId,
      @Nullable List<com.fhir.uri> policy,
      @Nullable List<CodeableConcept> role,
      @Nullable CodeableConcept type,
      @Nullable Reference who,
      @Nullable String name,
      @Nullable List<CodeableConcept> purposeOfUse,
      @Nullable Reference location) {
    this.extension = extension;
    this.requestor = requestor;
    this.media = media;
    this.modifierExtension = modifierExtension;
    this.network = network;
    this.id = id;
    this.altId = altId;
    this.policy = policy;
    this.role = role;
    this.type = type;
    this.who = who;
    this.name = name;
    this.purposeOfUse = purposeOfUse;
    this.location = location;
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
   * @return The value of the {@code requestor} attribute
   */
  @JsonProperty("requestor")
  @Override
  public Optional<Boolean> requestor() {
    return Optional.ofNullable(requestor);
  }

  /**
   * @return The value of the {@code media} attribute
   */
  @JsonProperty("media")
  @Override
  public Optional<Coding> media() {
    return Optional.ofNullable(media);
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
   * @return The value of the {@code network} attribute
   */
  @JsonProperty("network")
  @Override
  public Optional<AuditEvent_Network> network() {
    return Optional.ofNullable(network);
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
   * @return The value of the {@code altId} attribute
   */
  @JsonProperty("altId")
  @Override
  public Optional<String> altId() {
    return Optional.ofNullable(altId);
  }

  /**
   * @return The value of the {@code policy} attribute
   */
  @JsonProperty("policy")
  @Override
  public Optional<List<com.fhir.uri>> policy() {
    return Optional.ofNullable(policy);
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public Optional<List<CodeableConcept>> role() {
    return Optional.ofNullable(role);
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
   * @return The value of the {@code who} attribute
   */
  @JsonProperty("who")
  @Override
  public Optional<Reference> who() {
    return Optional.ofNullable(who);
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
   * @return The value of the {@code purposeOfUse} attribute
   */
  @JsonProperty("purposeOfUse")
  @Override
  public Optional<List<CodeableConcept>> purposeOfUse() {
    return Optional.ofNullable(purposeOfUse);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<Reference> location() {
    return Optional.ofNullable(location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAuditEvent_Agent(
        newValue,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Agent withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAuditEvent_Agent(
        value,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#requestor() requestor} attribute.
   * @param value The value for requestor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withRequestor(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.requestor, newValue)) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        newValue,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#requestor() requestor} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withRequestor(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.requestor, value)) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        value,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#media() media} attribute.
   * @param value The value for media
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withMedia(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "media");
    if (this.media == newValue) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        newValue,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#media() media} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for media
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Agent withMedia(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.media == value) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        value,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        newValue,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Agent withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        value,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#network() network} attribute.
   * @param value The value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withNetwork(AuditEvent_Network value) {
    @Nullable AuditEvent_Network newValue = Objects.requireNonNull(value, "network");
    if (this.network == newValue) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        newValue,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#network() network} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for network
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Agent withNetwork(Optional<? extends AuditEvent_Network> optional) {
    @Nullable AuditEvent_Network value = optional.orElse(null);
    if (this.network == value) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        value,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        newValue,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        value,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#altId() altId} attribute.
   * @param value The value for altId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withAltId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "altId");
    if (Objects.equals(this.altId, newValue)) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        newValue,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#altId() altId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for altId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withAltId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.altId, value)) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        value,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#policy() policy} attribute.
   * @param value The value for policy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withPolicy(List<com.fhir.uri> value) {
    @Nullable List<com.fhir.uri> newValue = Objects.requireNonNull(value, "policy");
    if (this.policy == newValue) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        newValue,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#policy() policy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for policy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Agent withPolicy(Optional<? extends List<com.fhir.uri>> optional) {
    @Nullable List<com.fhir.uri> value = optional.orElse(null);
    if (this.policy == value) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        value,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withRole(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        newValue,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Agent withRole(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        value,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        newValue,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Agent withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        value,
        this.who,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#who() who} attribute.
   * @param value The value for who
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withWho(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "who");
    if (this.who == newValue) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        newValue,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#who() who} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for who
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Agent withWho(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.who == value) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        value,
        this.name,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        newValue,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        value,
        this.purposeOfUse,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#purposeOfUse() purposeOfUse} attribute.
   * @param value The value for purposeOfUse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withPurposeOfUse(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "purposeOfUse");
    if (this.purposeOfUse == newValue) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        newValue,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#purposeOfUse() purposeOfUse} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purposeOfUse
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Agent withPurposeOfUse(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.purposeOfUse == value) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        value,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Agent#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Agent withLocation(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Agent#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Agent withLocation(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableAuditEvent_Agent(
        this.extension,
        this.requestor,
        this.media,
        this.modifierExtension,
        this.network,
        this.id,
        this.altId,
        this.policy,
        this.role,
        this.type,
        this.who,
        this.name,
        this.purposeOfUse,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuditEvent_Agent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuditEvent_Agent
        && equalTo((ImmutableAuditEvent_Agent) another);
  }

  private boolean equalTo(ImmutableAuditEvent_Agent another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(requestor, another.requestor)
        && Objects.equals(media, another.media)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(network, another.network)
        && Objects.equals(id, another.id)
        && Objects.equals(altId, another.altId)
        && Objects.equals(policy, another.policy)
        && Objects.equals(role, another.role)
        && Objects.equals(type, another.type)
        && Objects.equals(who, another.who)
        && Objects.equals(name, another.name)
        && Objects.equals(purposeOfUse, another.purposeOfUse)
        && Objects.equals(location, another.location);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code requestor}, {@code media}, {@code modifierExtension}, {@code network}, {@code id}, {@code altId}, {@code policy}, {@code role}, {@code type}, {@code who}, {@code name}, {@code purposeOfUse}, {@code location}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(requestor);
    h += (h << 5) + Objects.hashCode(media);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(network);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(altId);
    h += (h << 5) + Objects.hashCode(policy);
    h += (h << 5) + Objects.hashCode(role);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(who);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(purposeOfUse);
    h += (h << 5) + Objects.hashCode(location);
    return h;
  }

  /**
   * Prints the immutable value {@code AuditEvent_Agent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AuditEvent_Agent{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (requestor != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("requestor=").append(requestor);
    }
    if (media != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("media=").append(media);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (network != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("network=").append(network);
    }
    if (id != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (altId != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("altId=").append(altId);
    }
    if (policy != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("policy=").append(policy);
    }
    if (role != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("role=").append(role);
    }
    if (type != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (who != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("who=").append(who);
    }
    if (name != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (purposeOfUse != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("purposeOfUse=").append(purposeOfUse);
    }
    if (location != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("location=").append(location);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AuditEvent_Agent", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AuditEvent_Agent {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> requestor = Optional.empty();
    boolean requestorIsSet;
    @Nullable Optional<Coding> media = Optional.empty();
    boolean mediaIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<AuditEvent_Network> network = Optional.empty();
    boolean networkIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> altId = Optional.empty();
    boolean altIdIsSet;
    @Nullable Optional<List<com.fhir.uri>> policy = Optional.empty();
    boolean policyIsSet;
    @Nullable Optional<List<CodeableConcept>> role = Optional.empty();
    boolean roleIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Reference> who = Optional.empty();
    boolean whoIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<CodeableConcept>> purposeOfUse = Optional.empty();
    boolean purposeOfUseIsSet;
    @Nullable Optional<Reference> location = Optional.empty();
    boolean locationIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("requestor")
    public void setRequestor(Optional<Boolean> requestor) {
      this.requestor = requestor;
      this.requestorIsSet = true;
    }
    @JsonProperty("media")
    public void setMedia(Optional<Coding> media) {
      this.media = media;
      this.mediaIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("network")
    public void setNetwork(Optional<AuditEvent_Network> network) {
      this.network = network;
      this.networkIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("altId")
    public void setAltId(Optional<String> altId) {
      this.altId = altId;
      this.altIdIsSet = true;
    }
    @JsonProperty("policy")
    public void setPolicy(Optional<List<com.fhir.uri>> policy) {
      this.policy = policy;
      this.policyIsSet = true;
    }
    @JsonProperty("role")
    public void setRole(Optional<List<CodeableConcept>> role) {
      this.role = role;
      this.roleIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("who")
    public void setWho(Optional<Reference> who) {
      this.who = who;
      this.whoIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("purposeOfUse")
    public void setPurposeOfUse(Optional<List<CodeableConcept>> purposeOfUse) {
      this.purposeOfUse = purposeOfUse;
      this.purposeOfUseIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> requestor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> media() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<AuditEvent_Network> network() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> altId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<com.fhir.uri>> policy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> role() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> who() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> purposeOfUse() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> location() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAuditEvent_Agent fromJson(Json json) {
    ImmutableAuditEvent_Agent.Builder builder = ImmutableAuditEvent_Agent.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.requestorIsSet) {
      builder.requestor(json.requestor);
    }
    if (json.mediaIsSet) {
      builder.media(json.media);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.networkIsSet) {
      builder.network(json.network);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.altIdIsSet) {
      builder.altId(json.altId);
    }
    if (json.policyIsSet) {
      builder.policy(json.policy);
    }
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.whoIsSet) {
      builder.who(json.who);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.purposeOfUseIsSet) {
      builder.purposeOfUse(json.purposeOfUse);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    return (ImmutableAuditEvent_Agent) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AuditEvent_Agent} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuditEvent_Agent instance
   */
  public static AuditEvent_Agent copyOf(AuditEvent_Agent instance) {
    if (instance instanceof ImmutableAuditEvent_Agent) {
      return (ImmutableAuditEvent_Agent) instance;
    }
    return ImmutableAuditEvent_Agent.builder()
        .extension(instance.extension())
        .requestor(instance.requestor())
        .media(instance.media())
        .modifierExtension(instance.modifierExtension())
        .network(instance.network())
        .id(instance.id())
        .altId(instance.altId())
        .policy(instance.policy())
        .role(instance.role())
        .type(instance.type())
        .who(instance.who())
        .name(instance.name())
        .purposeOfUse(instance.purposeOfUse())
        .location(instance.location())
        .build();
  }

  /**
   * Creates a builder for {@link AuditEvent_Agent AuditEvent_Agent}.
   * <pre>
   * ImmutableAuditEvent_Agent.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AuditEvent_Agent#extension() extension}
   *    .requestor(Boolean) // optional {@link AuditEvent_Agent#requestor() requestor}
   *    .media(com.fhir.Coding) // optional {@link AuditEvent_Agent#media() media}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AuditEvent_Agent#modifierExtension() modifierExtension}
   *    .network(com.fhir.AuditEvent_Network) // optional {@link AuditEvent_Agent#network() network}
   *    .id(String) // optional {@link AuditEvent_Agent#id() id}
   *    .altId(String) // optional {@link AuditEvent_Agent#altId() altId}
   *    .policy(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link AuditEvent_Agent#policy() policy}
   *    .role(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link AuditEvent_Agent#role() role}
   *    .type(com.fhir.CodeableConcept) // optional {@link AuditEvent_Agent#type() type}
   *    .who(com.fhir.Reference) // optional {@link AuditEvent_Agent#who() who}
   *    .name(String) // optional {@link AuditEvent_Agent#name() name}
   *    .purposeOfUse(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link AuditEvent_Agent#purposeOfUse() purposeOfUse}
   *    .location(com.fhir.Reference) // optional {@link AuditEvent_Agent#location() location}
   *    .build();
   * </pre>
   * @return A new AuditEvent_Agent builder
   */
  public static ImmutableAuditEvent_Agent.Builder builder() {
    return new ImmutableAuditEvent_Agent.Builder();
  }

  /**
   * Builds instances of type {@link AuditEvent_Agent AuditEvent_Agent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AuditEvent_Agent", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_REQUESTOR = 0x2L;
    private static final long OPT_BIT_MEDIA = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_NETWORK = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_ALT_ID = 0x40L;
    private static final long OPT_BIT_POLICY = 0x80L;
    private static final long OPT_BIT_ROLE = 0x100L;
    private static final long OPT_BIT_TYPE = 0x200L;
    private static final long OPT_BIT_WHO = 0x400L;
    private static final long OPT_BIT_NAME = 0x800L;
    private static final long OPT_BIT_PURPOSE_OF_USE = 0x1000L;
    private static final long OPT_BIT_LOCATION = 0x2000L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Boolean requestor;
    private @Nullable Coding media;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable AuditEvent_Network network;
    private @Nullable String id;
    private @Nullable String altId;
    private @Nullable List<com.fhir.uri> policy;
    private @Nullable List<CodeableConcept> role;
    private @Nullable CodeableConcept type;
    private @Nullable Reference who;
    private @Nullable String name;
    private @Nullable List<CodeableConcept> purposeOfUse;
    private @Nullable Reference location;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#extension() extension} to extension.
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
     * Initializes the optional value {@link AuditEvent_Agent#extension() extension} to extension.
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
     * Initializes the optional value {@link AuditEvent_Agent#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestor(boolean requestor) {
      checkNotIsSet(requestorIsSet(), "requestor");
      this.requestor = requestor;
      optBits |= OPT_BIT_REQUESTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requestor")
    public final Builder requestor(Optional<Boolean> requestor) {
      checkNotIsSet(requestorIsSet(), "requestor");
      this.requestor = requestor.orElse(null);
      optBits |= OPT_BIT_REQUESTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#media() media} to media.
     * @param media The value for media
     * @return {@code this} builder for chained invocation
     */
    public final Builder media(Coding media) {
      checkNotIsSet(mediaIsSet(), "media");
      this.media = Objects.requireNonNull(media, "media");
      optBits |= OPT_BIT_MEDIA;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#media() media} to media.
     * @param media The value for media
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("media")
    public final Builder media(Optional<? extends Coding> media) {
      checkNotIsSet(mediaIsSet(), "media");
      this.media = media.orElse(null);
      optBits |= OPT_BIT_MEDIA;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AuditEvent_Agent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AuditEvent_Agent#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    public final Builder network(AuditEvent_Network network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = Objects.requireNonNull(network, "network");
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("network")
    public final Builder network(Optional<? extends AuditEvent_Network> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = network.orElse(null);
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent_Agent#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent_Agent#altId() altId} to altId.
     * @param altId The value for altId
     * @return {@code this} builder for chained invocation
     */
    public final Builder altId(String altId) {
      checkNotIsSet(altIdIsSet(), "altId");
      this.altId = Objects.requireNonNull(altId, "altId");
      optBits |= OPT_BIT_ALT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#altId() altId} to altId.
     * @param altId The value for altId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("altId")
    public final Builder altId(Optional<String> altId) {
      checkNotIsSet(altIdIsSet(), "altId");
      this.altId = altId.orElse(null);
      optBits |= OPT_BIT_ALT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for chained invocation
     */
    public final Builder policy(List<com.fhir.uri> policy) {
      checkNotIsSet(policyIsSet(), "policy");
      this.policy = Objects.requireNonNull(policy, "policy");
      optBits |= OPT_BIT_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("policy")
    public final Builder policy(Optional<? extends List<com.fhir.uri>> policy) {
      checkNotIsSet(policyIsSet(), "policy");
      this.policy = policy.orElse(null);
      optBits |= OPT_BIT_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    public final Builder role(List<CodeableConcept> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = Objects.requireNonNull(role, "role");
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(Optional<? extends List<CodeableConcept>> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = role.orElse(null);
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#type() type} to type.
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
     * Initializes the optional value {@link AuditEvent_Agent#type() type} to type.
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
     * Initializes the optional value {@link AuditEvent_Agent#who() who} to who.
     * @param who The value for who
     * @return {@code this} builder for chained invocation
     */
    public final Builder who(Reference who) {
      checkNotIsSet(whoIsSet(), "who");
      this.who = Objects.requireNonNull(who, "who");
      optBits |= OPT_BIT_WHO;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#who() who} to who.
     * @param who The value for who
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("who")
    public final Builder who(Optional<? extends Reference> who) {
      checkNotIsSet(whoIsSet(), "who");
      this.who = who.orElse(null);
      optBits |= OPT_BIT_WHO;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#name() name} to name.
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
     * Initializes the optional value {@link AuditEvent_Agent#name() name} to name.
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
     * Initializes the optional value {@link AuditEvent_Agent#purposeOfUse() purposeOfUse} to purposeOfUse.
     * @param purposeOfUse The value for purposeOfUse
     * @return {@code this} builder for chained invocation
     */
    public final Builder purposeOfUse(List<CodeableConcept> purposeOfUse) {
      checkNotIsSet(purposeOfUseIsSet(), "purposeOfUse");
      this.purposeOfUse = Objects.requireNonNull(purposeOfUse, "purposeOfUse");
      optBits |= OPT_BIT_PURPOSE_OF_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#purposeOfUse() purposeOfUse} to purposeOfUse.
     * @param purposeOfUse The value for purposeOfUse
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("purposeOfUse")
    public final Builder purposeOfUse(Optional<? extends List<CodeableConcept>> purposeOfUse) {
      checkNotIsSet(purposeOfUseIsSet(), "purposeOfUse");
      this.purposeOfUse = purposeOfUse.orElse(null);
      optBits |= OPT_BIT_PURPOSE_OF_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Agent#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Builds a new {@link AuditEvent_Agent AuditEvent_Agent}.
     * @return An immutable instance of AuditEvent_Agent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AuditEvent_Agent build() {
      return new ImmutableAuditEvent_Agent(
          extension,
          requestor,
          media,
          modifierExtension,
          network,
          id,
          altId,
          policy,
          role,
          type,
          who,
          name,
          purposeOfUse,
          location);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean requestorIsSet() {
      return (optBits & OPT_BIT_REQUESTOR) != 0;
    }

    private boolean mediaIsSet() {
      return (optBits & OPT_BIT_MEDIA) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean networkIsSet() {
      return (optBits & OPT_BIT_NETWORK) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean altIdIsSet() {
      return (optBits & OPT_BIT_ALT_ID) != 0;
    }

    private boolean policyIsSet() {
      return (optBits & OPT_BIT_POLICY) != 0;
    }

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean whoIsSet() {
      return (optBits & OPT_BIT_WHO) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean purposeOfUseIsSet() {
      return (optBits & OPT_BIT_PURPOSE_OF_USE) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AuditEvent_Agent is strict, attribute is already set: ".concat(name));
    }
  }
}

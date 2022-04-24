//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Bundle}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBundle.builder()}.
 */
@org.immutables.value.Generated(from = "Bundle", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBundle implements com.fhir.Bundle {
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Entry> entry;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Signature signature;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final @javax.annotation.Nullable com.fhir.unsignedInt total;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Link> link;
  private final @javax.annotation.Nullable com.fhir.instant timestamp;
  private final @javax.annotation.Nullable com.fhir.BundleType type;

  private ImmutableBundle(
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Entry> entry,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Signature signature,
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      @javax.annotation.Nullable com.fhir.unsignedInt total,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Link> link,
      @javax.annotation.Nullable com.fhir.instant timestamp,
      @javax.annotation.Nullable com.fhir.BundleType type) {
    this.language = language;
    this.entry = entry;
    this.implicitRules = implicitRules;
    this.id = id;
    this.meta = meta;
    this.signature = signature;
    this.identifier = identifier;
    this.total = total;
    this.resourceType = resourceType;
    this.link = link;
    this.timestamp = timestamp;
    this.type = type;
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
   * @return The value of the {@code entry} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("entry")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Bundle_Entry>> entry() {
    return java.util.Optional.ofNullable(entry);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code signature} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("signature")
  @Override
  public java.util.Optional<com.fhir.Signature> signature() {
    return java.util.Optional.ofNullable(signature);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code total} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("total")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> total() {
    return java.util.Optional.ofNullable(total);
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
   * @return The value of the {@code link} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("link")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Bundle_Link>> link() {
    return java.util.Optional.ofNullable(link);
  }

  /**
   * @return The value of the {@code timestamp} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
  @Override
  public java.util.Optional<com.fhir.instant> timestamp() {
    return java.util.Optional.ofNullable(timestamp);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.BundleType> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableBundle(
        newValue,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableBundle(
        value,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#entry() entry} attribute.
   * @param value The value for entry
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withEntry(java.util.List<com.fhir.Bundle_Entry> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Entry> newValue = java.util.Objects.requireNonNull(value, "entry");
    if (this.entry == newValue) return this;
    return new ImmutableBundle(
        this.language,
        newValue,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#entry() entry} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entry
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withEntry(java.util.Optional<? extends java.util.List<com.fhir.Bundle_Entry>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Entry> value = optional.orElse(null);
    if (this.entry == value) return this;
    return new ImmutableBundle(
        this.language,
        value,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        newValue,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        value,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        newValue,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        value,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        newValue,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        value,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#signature() signature} attribute.
   * @param value The value for signature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withSignature(com.fhir.Signature value) {
    @javax.annotation.Nullable com.fhir.Signature newValue = java.util.Objects.requireNonNull(value, "signature");
    if (this.signature == newValue) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        newValue,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#signature() signature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for signature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withSignature(java.util.Optional<? extends com.fhir.Signature> optional) {
    @javax.annotation.Nullable com.fhir.Signature value = optional.orElse(null);
    if (this.signature == value) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        value,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        newValue,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        value,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#total() total} attribute.
   * @param value The value for total
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withTotal(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "total");
    if (this.total == newValue) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        newValue,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#total() total} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for total
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withTotal(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.total == value) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        value,
        this.resourceType,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Bundle#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBundle withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        newValue,
        this.link,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withLink(java.util.List<com.fhir.Bundle_Link> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Link> newValue = java.util.Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        newValue,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withLink(java.util.Optional<? extends java.util.List<com.fhir.Bundle_Link>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        value,
        this.timestamp,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#timestamp() timestamp} attribute.
   * @param value The value for timestamp
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withTimestamp(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "timestamp");
    if (this.timestamp == newValue) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        newValue,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#timestamp() timestamp} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timestamp
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withTimestamp(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.timestamp == value) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        value,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withType(com.fhir.BundleType value) {
    @javax.annotation.Nullable com.fhir.BundleType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withType(java.util.Optional<? extends com.fhir.BundleType> optional) {
    @javax.annotation.Nullable com.fhir.BundleType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableBundle(
        this.language,
        this.entry,
        this.implicitRules,
        this.id,
        this.meta,
        this.signature,
        this.identifier,
        this.total,
        this.resourceType,
        this.link,
        this.timestamp,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBundle} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBundle
        && equalTo((ImmutableBundle) another);
  }

  private boolean equalTo(ImmutableBundle another) {
    return java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(entry, another.entry)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(signature, another.signature)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(total, another.total)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(link, another.link)
        && java.util.Objects.equals(timestamp, another.timestamp)
        && java.util.Objects.equals(type, another.type);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code entry}, {@code implicitRules}, {@code id}, {@code meta}, {@code signature}, {@code identifier}, {@code total}, {@code resourceType}, {@code link}, {@code timestamp}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(entry);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(signature);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(total);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(link);
    h += (h << 5) + java.util.Objects.hashCode(timestamp);
    h += (h << 5) + java.util.Objects.hashCode(type);
    return h;
  }

  /**
   * Prints the immutable value {@code Bundle} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Bundle{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (entry != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("entry=").append(entry);
    }
    if (implicitRules != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (id != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (signature != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("signature=").append(signature);
    }
    if (identifier != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (total != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("total=").append(total);
    }
    if (builder.length() > 7) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (link != null) {
      builder.append(", ");
      builder.append("link=").append(link);
    }
    if (timestamp != null) {
      builder.append(", ");
      builder.append("timestamp=").append(timestamp);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Bundle", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Bundle {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Bundle_Entry>> entry = java.util.Optional.empty();
    boolean entryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Signature> signature = java.util.Optional.empty();
    boolean signatureIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> total = java.util.Optional.empty();
    boolean totalIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Bundle_Link>> link = java.util.Optional.empty();
    boolean linkIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> timestamp = java.util.Optional.empty();
    boolean timestampIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.BundleType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("entry")
    public void setEntry(java.util.Optional<java.util.List<com.fhir.Bundle_Entry>> entry) {
      this.entry = entry;
      this.entryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    public void setSignature(java.util.Optional<com.fhir.Signature> signature) {
      this.signature = signature;
      this.signatureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    public void setTotal(java.util.Optional<com.fhir.unsignedInt> total) {
      this.total = total;
      this.totalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public void setLink(java.util.Optional<java.util.List<com.fhir.Bundle_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    public void setTimestamp(java.util.Optional<com.fhir.instant> timestamp) {
      this.timestamp = timestamp;
      this.timestampIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.BundleType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Bundle_Entry>> entry() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Signature> signature() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> total() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Bundle_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> timestamp() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.BundleType> type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableBundle fromJson(Json json) {
    ImmutableBundle.Builder builder = ((ImmutableBundle.Builder) ImmutableBundle.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.entryIsSet) {
      builder.entry(json.entry);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.signatureIsSet) {
      builder.signature(json.signature);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.totalIsSet) {
      builder.total(json.total);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.timestampIsSet) {
      builder.timestamp(json.timestamp);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    return (ImmutableBundle) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Bundle} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Bundle instance
   */
  public static Bundle copyOf(Bundle instance) {
    if (instance instanceof ImmutableBundle) {
      return (ImmutableBundle) instance;
    }
    return ((ImmutableBundle.Builder) ImmutableBundle.builder())
        .language(instance.language())
        .entry(instance.entry())
        .implicitRules(instance.implicitRules())
        .id(instance.id())
        .meta(instance.meta())
        .signature(instance.signature())
        .identifier(instance.identifier())
        .total(instance.total())
        .resourceType(instance.resourceType())
        .link(instance.link())
        .timestamp(instance.timestamp())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link Bundle Bundle}.
   * <pre>
   * ImmutableBundle.builder()
   *    .language(com.fhir.code) // optional {@link Bundle#language() language}
   *    .entry(List&amp;lt;com.fhir.Bundle_Entry&amp;gt;) // optional {@link Bundle#entry() entry}
   *    .implicitRules(com.fhir.uri) // optional {@link Bundle#implicitRules() implicitRules}
   *    .id(com.fhir.id) // optional {@link Bundle#id() id}
   *    .meta(com.fhir.Meta) // optional {@link Bundle#meta() meta}
   *    .signature(com.fhir.Signature) // optional {@link Bundle#signature() signature}
   *    .identifier(com.fhir.Identifier) // optional {@link Bundle#identifier() identifier}
   *    .total(com.fhir.unsignedInt) // optional {@link Bundle#total() total}
   *    .resourceType(String) // required {@link Bundle#resourceType() resourceType}
   *    .link(List&amp;lt;com.fhir.Bundle_Link&amp;gt;) // optional {@link Bundle#link() link}
   *    .timestamp(com.fhir.instant) // optional {@link Bundle#timestamp() timestamp}
   *    .type(com.fhir.BundleType) // optional {@link Bundle#type() type}
   *    .build();
   * </pre>
   * @return A new Bundle builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableBundle.Builder();
  }

  /**
   * Builds instances of type {@link Bundle Bundle}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Bundle", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_ENTRY = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_SIGNATURE = 0x20L;
    private static final long OPT_BIT_IDENTIFIER = 0x40L;
    private static final long OPT_BIT_TOTAL = 0x80L;
    private static final long OPT_BIT_LINK = 0x100L;
    private static final long OPT_BIT_TIMESTAMP = 0x200L;
    private static final long OPT_BIT_TYPE = 0x400L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Entry> entry;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Signature signature;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable com.fhir.unsignedInt total;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Link> link;
    private @javax.annotation.Nullable com.fhir.instant timestamp;
    private @javax.annotation.Nullable com.fhir.BundleType type;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Bundle#language() language} to language.
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
     * Initializes the optional value {@link Bundle#language() language} to language.
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
     * Initializes the optional value {@link Bundle#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for chained invocation
     */
    public final Builder entry(java.util.List<com.fhir.Bundle_Entry> entry) {
      checkNotIsSet(entryIsSet(), "entry");
      this.entry = java.util.Objects.requireNonNull(entry, "entry");
      optBits |= OPT_BIT_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entry")
    public final Builder entry(java.util.Optional<? extends java.util.List<com.fhir.Bundle_Entry>> entry) {
      checkNotIsSet(entryIsSet(), "entry");
      this.entry = entry.orElse(null);
      optBits |= OPT_BIT_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Bundle#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Bundle#id() id} to id.
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
     * Initializes the optional value {@link Bundle#id() id} to id.
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
     * Initializes the optional value {@link Bundle#meta() meta} to meta.
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
     * Initializes the optional value {@link Bundle#meta() meta} to meta.
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
     * Initializes the optional value {@link Bundle#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for chained invocation
     */
    public final Builder signature(com.fhir.Signature signature) {
      checkNotIsSet(signatureIsSet(), "signature");
      this.signature = java.util.Objects.requireNonNull(signature, "signature");
      optBits |= OPT_BIT_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    public final Builder signature(java.util.Optional<? extends com.fhir.Signature> signature) {
      checkNotIsSet(signatureIsSet(), "signature");
      this.signature = signature.orElse(null);
      optBits |= OPT_BIT_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    public final Builder total(com.fhir.unsignedInt total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = java.util.Objects.requireNonNull(total, "total");
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    public final Builder total(java.util.Optional<? extends com.fhir.unsignedInt> total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = total.orElse(null);
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the value for the {@link Bundle#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Bundle#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(java.util.List<com.fhir.Bundle_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = java.util.Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public final Builder link(java.util.Optional<? extends java.util.List<com.fhir.Bundle_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#timestamp() timestamp} to timestamp.
     * @param timestamp The value for timestamp
     * @return {@code this} builder for chained invocation
     */
    public final Builder timestamp(com.fhir.instant timestamp) {
      checkNotIsSet(timestampIsSet(), "timestamp");
      this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp");
      optBits |= OPT_BIT_TIMESTAMP;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#timestamp() timestamp} to timestamp.
     * @param timestamp The value for timestamp
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    public final Builder timestamp(java.util.Optional<? extends com.fhir.instant> timestamp) {
      checkNotIsSet(timestampIsSet(), "timestamp");
      this.timestamp = timestamp.orElse(null);
      optBits |= OPT_BIT_TIMESTAMP;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.BundleType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.BundleType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Builds a new {@link Bundle Bundle}.
     * @return An immutable instance of Bundle
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Bundle build() {
      checkRequiredAttributes();
      return new ImmutableBundle(
          language,
          entry,
          implicitRules,
          id,
          meta,
          signature,
          identifier,
          total,
          resourceType,
          link,
          timestamp,
          type);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean entryIsSet() {
      return (optBits & OPT_BIT_ENTRY) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean signatureIsSet() {
      return (optBits & OPT_BIT_SIGNATURE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean totalIsSet() {
      return (optBits & OPT_BIT_TOTAL) != 0;
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean timestampIsSet() {
      return (optBits & OPT_BIT_TIMESTAMP) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Bundle is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Bundle, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Bundle", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Bundle#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Bundle", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Bundle#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Bundle#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Bundle#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for chained invocation
     */
    BuildFinal entry(java.util.List<com.fhir.Bundle_Entry> entry);

    /**
     * Initializes the optional value {@link Bundle#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal entry(java.util.Optional<? extends java.util.List<com.fhir.Bundle_Entry>> entry);

    /**
     * Initializes the optional value {@link Bundle#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Bundle#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Bundle#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Bundle#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Bundle#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Bundle#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Bundle#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for chained invocation
     */
    BuildFinal signature(com.fhir.Signature signature);

    /**
     * Initializes the optional value {@link Bundle#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal signature(java.util.Optional<? extends com.fhir.Signature> signature);

    /**
     * Initializes the optional value {@link Bundle#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link Bundle#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Bundle#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    BuildFinal total(com.fhir.unsignedInt total);

    /**
     * Initializes the optional value {@link Bundle#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal total(java.util.Optional<? extends com.fhir.unsignedInt> total);

    /**
     * Initializes the optional value {@link Bundle#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    BuildFinal link(java.util.List<com.fhir.Bundle_Link> link);

    /**
     * Initializes the optional value {@link Bundle#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal link(java.util.Optional<? extends java.util.List<com.fhir.Bundle_Link>> link);

    /**
     * Initializes the optional value {@link Bundle#timestamp() timestamp} to timestamp.
     * @param timestamp The value for timestamp
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timestamp(com.fhir.instant timestamp);

    /**
     * Initializes the optional value {@link Bundle#timestamp() timestamp} to timestamp.
     * @param timestamp The value for timestamp
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timestamp(java.util.Optional<? extends com.fhir.instant> timestamp);

    /**
     * Initializes the optional value {@link Bundle#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.BundleType type);

    /**
     * Initializes the optional value {@link Bundle#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.BundleType> type);

    /**
     * Builds a new {@link Bundle Bundle}.
     * @return An immutable instance of Bundle
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Bundle build();
  }
}

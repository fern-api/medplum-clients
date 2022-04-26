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
 * Immutable implementation of {@link Bundle}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBundle.builder()}.
 */
@Generated(from = "Bundle", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBundle implements Bundle {
  private final @Nullable Id id;
  private final @Nullable Code language;
  private final @Nullable Identifier identifier;
  private final @Nullable Signature signature;
  private final @Nullable Meta meta;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Bundle_Link> link;
  private final @Nullable List<Bundle_Entry> entry;
  private final String resourceType;
  private final @Nullable UnsignedInt total;
  private final @Nullable BundleType type;
  private final @Nullable Instant timestamp;

  private ImmutableBundle(
      @Nullable Id id,
      @Nullable Code language,
      @Nullable Identifier identifier,
      @Nullable Signature signature,
      @Nullable Meta meta,
      @Nullable Uri implicitRules,
      @Nullable List<Bundle_Link> link,
      @Nullable List<Bundle_Entry> entry,
      String resourceType,
      @Nullable UnsignedInt total,
      @Nullable BundleType type,
      @Nullable Instant timestamp) {
    this.id = id;
    this.language = language;
    this.identifier = identifier;
    this.signature = signature;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.link = link;
    this.entry = entry;
    this.resourceType = resourceType;
    this.total = total;
    this.type = type;
    this.timestamp = timestamp;
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
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code signature} attribute
   */
  @JsonProperty("signature")
  @Override
  public Optional<Signature> signature() {
    return Optional.ofNullable(signature);
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
   * @return The value of the {@code link} attribute
   */
  @JsonProperty("link")
  @Override
  public Optional<List<Bundle_Link>> link() {
    return Optional.ofNullable(link);
  }

  /**
   * @return The value of the {@code entry} attribute
   */
  @JsonProperty("entry")
  @Override
  public Optional<List<Bundle_Entry>> entry() {
    return Optional.ofNullable(entry);
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
   * @return The value of the {@code total} attribute
   */
  @JsonProperty("total")
  @Override
  public Optional<UnsignedInt> total() {
    return Optional.ofNullable(total);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<BundleType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code timestamp} attribute
   */
  @JsonProperty("timestamp")
  @Override
  public Optional<Instant> timestamp() {
    return Optional.ofNullable(timestamp);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableBundle(
        newValue,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableBundle(
        value,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableBundle(
        this.id,
        newValue,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableBundle(
        this.id,
        value,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        newValue,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        value,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#signature() signature} attribute.
   * @param value The value for signature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withSignature(Signature value) {
    @Nullable Signature newValue = Objects.requireNonNull(value, "signature");
    if (this.signature == newValue) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        newValue,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#signature() signature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for signature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withSignature(Optional<? extends Signature> optional) {
    @Nullable Signature value = optional.orElse(null);
    if (this.signature == value) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        value,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        newValue,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        value,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        newValue,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        value,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withLink(List<Bundle_Link> value) {
    @Nullable List<Bundle_Link> newValue = Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        newValue,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withLink(Optional<? extends List<Bundle_Link>> optional) {
    @Nullable List<Bundle_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        value,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#entry() entry} attribute.
   * @param value The value for entry
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withEntry(List<Bundle_Entry> value) {
    @Nullable List<Bundle_Entry> newValue = Objects.requireNonNull(value, "entry");
    if (this.entry == newValue) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        newValue,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#entry() entry} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entry
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withEntry(Optional<? extends List<Bundle_Entry>> optional) {
    @Nullable List<Bundle_Entry> value = optional.orElse(null);
    if (this.entry == value) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        value,
        this.resourceType,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Bundle#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBundle withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        newValue,
        this.total,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#total() total} attribute.
   * @param value The value for total
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withTotal(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "total");
    if (this.total == newValue) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        newValue,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#total() total} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for total
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withTotal(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.total == value) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        value,
        this.type,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withType(BundleType value) {
    @Nullable BundleType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        newValue,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withType(Optional<? extends BundleType> optional) {
    @Nullable BundleType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        value,
        this.timestamp);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle#timestamp() timestamp} attribute.
   * @param value The value for timestamp
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle withTimestamp(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "timestamp");
    if (this.timestamp == newValue) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle#timestamp() timestamp} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timestamp
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle withTimestamp(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.timestamp == value) return this;
    return new ImmutableBundle(
        this.id,
        this.language,
        this.identifier,
        this.signature,
        this.meta,
        this.implicitRules,
        this.link,
        this.entry,
        this.resourceType,
        this.total,
        this.type,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBundle} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBundle
        && equalTo((ImmutableBundle) another);
  }

  private boolean equalTo(ImmutableBundle another) {
    return Objects.equals(id, another.id)
        && Objects.equals(language, another.language)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(signature, another.signature)
        && Objects.equals(meta, another.meta)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(link, another.link)
        && Objects.equals(entry, another.entry)
        && resourceType.equals(another.resourceType)
        && Objects.equals(total, another.total)
        && Objects.equals(type, another.type)
        && Objects.equals(timestamp, another.timestamp);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code language}, {@code identifier}, {@code signature}, {@code meta}, {@code implicitRules}, {@code link}, {@code entry}, {@code resourceType}, {@code total}, {@code type}, {@code timestamp}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(signature);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(link);
    h += (h << 5) + Objects.hashCode(entry);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(total);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(timestamp);
    return h;
  }

  /**
   * Prints the immutable value {@code Bundle} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Bundle{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (language != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (identifier != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (signature != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("signature=").append(signature);
    }
    if (meta != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (link != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("link=").append(link);
    }
    if (entry != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("entry=").append(entry);
    }
    if (builder.length() > 7) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (total != null) {
      builder.append(", ");
      builder.append("total=").append(total);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (timestamp != null) {
      builder.append(", ");
      builder.append("timestamp=").append(timestamp);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Bundle", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Bundle {
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Signature> signature = Optional.empty();
    boolean signatureIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Bundle_Link>> link = Optional.empty();
    boolean linkIsSet;
    @Nullable Optional<List<Bundle_Entry>> entry = Optional.empty();
    boolean entryIsSet;
    @Nullable String resourceType;
    @Nullable Optional<UnsignedInt> total = Optional.empty();
    boolean totalIsSet;
    @Nullable Optional<BundleType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Instant> timestamp = Optional.empty();
    boolean timestampIsSet;
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("signature")
    public void setSignature(Optional<Signature> signature) {
      this.signature = signature;
      this.signatureIsSet = true;
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
    @JsonProperty("link")
    public void setLink(Optional<List<Bundle_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @JsonProperty("entry")
    public void setEntry(Optional<List<Bundle_Entry>> entry) {
      this.entry = entry;
      this.entryIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("total")
    public void setTotal(Optional<UnsignedInt> total) {
      this.total = total;
      this.totalIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<BundleType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("timestamp")
    public void setTimestamp(Optional<Instant> timestamp) {
      this.timestamp = timestamp;
      this.timestampIsSet = true;
    }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Signature> signature() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Bundle_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Bundle_Entry>> entry() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UnsignedInt> total() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<BundleType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> timestamp() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBundle fromJson(Json json) {
    ImmutableBundle.Builder builder = ((ImmutableBundle.Builder) ImmutableBundle.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.signatureIsSet) {
      builder.signature(json.signature);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.entryIsSet) {
      builder.entry(json.entry);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.totalIsSet) {
      builder.total(json.total);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.timestampIsSet) {
      builder.timestamp(json.timestamp);
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
        .id(instance.id())
        .language(instance.language())
        .identifier(instance.identifier())
        .signature(instance.signature())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .link(instance.link())
        .entry(instance.entry())
        .resourceType(instance.resourceType())
        .total(instance.total())
        .type(instance.type())
        .timestamp(instance.timestamp())
        .build();
  }

  /**
   * Creates a builder for {@link Bundle Bundle}.
   * <pre>
   * ImmutableBundle.builder()
   *    .id(com.fhir.types.fhir.Id) // optional {@link Bundle#id() id}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Bundle#language() language}
   *    .identifier(com.fhir.types.fhir.Identifier) // optional {@link Bundle#identifier() identifier}
   *    .signature(com.fhir.types.fhir.Signature) // optional {@link Bundle#signature() signature}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Bundle#meta() meta}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Bundle#implicitRules() implicitRules}
   *    .link(List&amp;lt;com.fhir.types.fhir.Bundle_Link&amp;gt;) // optional {@link Bundle#link() link}
   *    .entry(List&amp;lt;com.fhir.types.fhir.Bundle_Entry&amp;gt;) // optional {@link Bundle#entry() entry}
   *    .resourceType(String) // required {@link Bundle#resourceType() resourceType}
   *    .total(com.fhir.types.fhir.UnsignedInt) // optional {@link Bundle#total() total}
   *    .type(com.fhir.types.fhir.BundleType) // optional {@link Bundle#type() type}
   *    .timestamp(com.fhir.types.fhir.Instant) // optional {@link Bundle#timestamp() timestamp}
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
  @Generated(from = "Bundle", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x4L;
    private static final long OPT_BIT_SIGNATURE = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_LINK = 0x40L;
    private static final long OPT_BIT_ENTRY = 0x80L;
    private static final long OPT_BIT_TOTAL = 0x100L;
    private static final long OPT_BIT_TYPE = 0x200L;
    private static final long OPT_BIT_TIMESTAMP = 0x400L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Id id;
    private @Nullable Code language;
    private @Nullable Identifier identifier;
    private @Nullable Signature signature;
    private @Nullable Meta meta;
    private @Nullable Uri implicitRules;
    private @Nullable List<Bundle_Link> link;
    private @Nullable List<Bundle_Entry> entry;
    private @Nullable String resourceType;
    private @Nullable UnsignedInt total;
    private @Nullable BundleType type;
    private @Nullable Instant timestamp;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Bundle#id() id} to id.
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
     * Initializes the optional value {@link Bundle#id() id} to id.
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
     * Initializes the optional value {@link Bundle#language() language} to language.
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
     * Initializes the optional value {@link Bundle#language() language} to language.
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
     * Initializes the optional value {@link Bundle#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for chained invocation
     */
    public final Builder signature(Signature signature) {
      checkNotIsSet(signatureIsSet(), "signature");
      this.signature = Objects.requireNonNull(signature, "signature");
      optBits |= OPT_BIT_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("signature")
    public final Builder signature(Optional<? extends Signature> signature) {
      checkNotIsSet(signatureIsSet(), "signature");
      this.signature = signature.orElse(null);
      optBits |= OPT_BIT_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#meta() meta} to meta.
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
     * Initializes the optional value {@link Bundle#meta() meta} to meta.
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
     * Initializes the optional value {@link Bundle#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Bundle#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Bundle#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(List<Bundle_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("link")
    public final Builder link(Optional<? extends List<Bundle_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for chained invocation
     */
    public final Builder entry(List<Bundle_Entry> entry) {
      checkNotIsSet(entryIsSet(), "entry");
      this.entry = Objects.requireNonNull(entry, "entry");
      optBits |= OPT_BIT_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entry")
    public final Builder entry(Optional<? extends List<Bundle_Entry>> entry) {
      checkNotIsSet(entryIsSet(), "entry");
      this.entry = entry.orElse(null);
      optBits |= OPT_BIT_ENTRY;
      return this;
    }

    /**
     * Initializes the value for the {@link Bundle#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Bundle#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    public final Builder total(UnsignedInt total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = Objects.requireNonNull(total, "total");
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("total")
    public final Builder total(Optional<? extends UnsignedInt> total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = total.orElse(null);
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(BundleType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends BundleType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#timestamp() timestamp} to timestamp.
     * @param timestamp The value for timestamp
     * @return {@code this} builder for chained invocation
     */
    public final Builder timestamp(Instant timestamp) {
      checkNotIsSet(timestampIsSet(), "timestamp");
      this.timestamp = Objects.requireNonNull(timestamp, "timestamp");
      optBits |= OPT_BIT_TIMESTAMP;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle#timestamp() timestamp} to timestamp.
     * @param timestamp The value for timestamp
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timestamp")
    public final Builder timestamp(Optional<? extends Instant> timestamp) {
      checkNotIsSet(timestampIsSet(), "timestamp");
      this.timestamp = timestamp.orElse(null);
      optBits |= OPT_BIT_TIMESTAMP;
      return this;
    }

    /**
     * Builds a new {@link Bundle Bundle}.
     * @return An immutable instance of Bundle
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Bundle build() {
      checkRequiredAttributes();
      return new ImmutableBundle(
          id,
          language,
          identifier,
          signature,
          meta,
          implicitRules,
          link,
          entry,
          resourceType,
          total,
          type,
          timestamp);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean signatureIsSet() {
      return (optBits & OPT_BIT_SIGNATURE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean entryIsSet() {
      return (optBits & OPT_BIT_ENTRY) != 0;
    }

    private boolean totalIsSet() {
      return (optBits & OPT_BIT_TOTAL) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean timestampIsSet() {
      return (optBits & OPT_BIT_TIMESTAMP) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Bundle is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Bundle, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Bundle", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Bundle#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Bundle", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Bundle#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Bundle#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Bundle#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Bundle#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Bundle#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link Bundle#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link Bundle#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for chained invocation
     */
    BuildFinal signature(Signature signature);

    /**
     * Initializes the optional value {@link Bundle#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal signature(Optional<? extends Signature> signature);

    /**
     * Initializes the optional value {@link Bundle#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Bundle#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Bundle#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Bundle#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Bundle#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    BuildFinal link(List<Bundle_Link> link);

    /**
     * Initializes the optional value {@link Bundle#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal link(Optional<? extends List<Bundle_Link>> link);

    /**
     * Initializes the optional value {@link Bundle#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for chained invocation
     */
    BuildFinal entry(List<Bundle_Entry> entry);

    /**
     * Initializes the optional value {@link Bundle#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal entry(Optional<? extends List<Bundle_Entry>> entry);

    /**
     * Initializes the optional value {@link Bundle#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    BuildFinal total(UnsignedInt total);

    /**
     * Initializes the optional value {@link Bundle#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal total(Optional<? extends UnsignedInt> total);

    /**
     * Initializes the optional value {@link Bundle#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(BundleType type);

    /**
     * Initializes the optional value {@link Bundle#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends BundleType> type);

    /**
     * Initializes the optional value {@link Bundle#timestamp() timestamp} to timestamp.
     * @param timestamp The value for timestamp
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timestamp(Instant timestamp);

    /**
     * Initializes the optional value {@link Bundle#timestamp() timestamp} to timestamp.
     * @param timestamp The value for timestamp
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timestamp(Optional<? extends Instant> timestamp);

    /**
     * Builds a new {@link Bundle Bundle}.
     * @return An immutable instance of Bundle
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Bundle build();
  }
}

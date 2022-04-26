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
 * Immutable implementation of {@link DataRequirement}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDataRequirement.builder()}.
 */
@Generated(from = "DataRequirement", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDataRequirement implements DataRequirement {
  private final @Nullable CodeableConcept subjectCodeableConcept;
  private final @Nullable List<String> mustSupport;
  private final @Nullable Reference subjectReference;
  private final @Nullable String id;
  private final @Nullable List<Canonical> profile;
  private final @Nullable Code type;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<DataRequirement_DateFilter> dateFilter;
  private final @Nullable List<DataRequirement_Sort> sort;
  private final @Nullable PositiveInt limit;
  private final @Nullable List<DataRequirement_CodeFilter> codeFilter;

  private ImmutableDataRequirement(
      @Nullable CodeableConcept subjectCodeableConcept,
      @Nullable List<String> mustSupport,
      @Nullable Reference subjectReference,
      @Nullable String id,
      @Nullable List<Canonical> profile,
      @Nullable Code type,
      @Nullable List<Extension> extension,
      @Nullable List<DataRequirement_DateFilter> dateFilter,
      @Nullable List<DataRequirement_Sort> sort,
      @Nullable PositiveInt limit,
      @Nullable List<DataRequirement_CodeFilter> codeFilter) {
    this.subjectCodeableConcept = subjectCodeableConcept;
    this.mustSupport = mustSupport;
    this.subjectReference = subjectReference;
    this.id = id;
    this.profile = profile;
    this.type = type;
    this.extension = extension;
    this.dateFilter = dateFilter;
    this.sort = sort;
    this.limit = limit;
    this.codeFilter = codeFilter;
  }

  /**
   * @return The value of the {@code subjectCodeableConcept} attribute
   */
  @JsonProperty("subjectCodeableConcept")
  @Override
  public Optional<CodeableConcept> subjectCodeableConcept() {
    return Optional.ofNullable(subjectCodeableConcept);
  }

  /**
   * @return The value of the {@code mustSupport} attribute
   */
  @JsonProperty("mustSupport")
  @Override
  public Optional<List<String>> mustSupport() {
    return Optional.ofNullable(mustSupport);
  }

  /**
   * @return The value of the {@code subjectReference} attribute
   */
  @JsonProperty("subjectReference")
  @Override
  public Optional<Reference> subjectReference() {
    return Optional.ofNullable(subjectReference);
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
   * @return The value of the {@code profile} attribute
   */
  @JsonProperty("profile")
  @Override
  public Optional<List<Canonical>> profile() {
    return Optional.ofNullable(profile);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Code> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code dateFilter} attribute
   */
  @JsonProperty("dateFilter")
  @Override
  public Optional<List<DataRequirement_DateFilter>> dateFilter() {
    return Optional.ofNullable(dateFilter);
  }

  /**
   * @return The value of the {@code sort} attribute
   */
  @JsonProperty("sort")
  @Override
  public Optional<List<DataRequirement_Sort>> sort() {
    return Optional.ofNullable(sort);
  }

  /**
   * @return The value of the {@code limit} attribute
   */
  @JsonProperty("limit")
  @Override
  public Optional<PositiveInt> limit() {
    return Optional.ofNullable(limit);
  }

  /**
   * @return The value of the {@code codeFilter} attribute
   */
  @JsonProperty("codeFilter")
  @Override
  public Optional<List<DataRequirement_CodeFilter>> codeFilter() {
    return Optional.ofNullable(codeFilter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * @param value The value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withSubjectCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "subjectCodeableConcept");
    if (this.subjectCodeableConcept == newValue) return this;
    return new ImmutableDataRequirement(
        newValue,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withSubjectCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.subjectCodeableConcept == value) return this;
    return new ImmutableDataRequirement(
        value,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#mustSupport() mustSupport} attribute.
   * @param value The value for mustSupport
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withMustSupport(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "mustSupport");
    if (this.mustSupport == newValue) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        newValue,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#mustSupport() mustSupport} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mustSupport
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withMustSupport(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.mustSupport == value) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        value,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#subjectReference() subjectReference} attribute.
   * @param value The value for subjectReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withSubjectReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subjectReference");
    if (this.subjectReference == newValue) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        newValue,
        this.id,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#subjectReference() subjectReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withSubjectReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subjectReference == value) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        value,
        this.id,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        newValue,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        value,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withProfile(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        newValue,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withProfile(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        value,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withType(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        newValue,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withType(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        value,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        newValue,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        value,
        this.dateFilter,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#dateFilter() dateFilter} attribute.
   * @param value The value for dateFilter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withDateFilter(List<DataRequirement_DateFilter> value) {
    @Nullable List<DataRequirement_DateFilter> newValue = Objects.requireNonNull(value, "dateFilter");
    if (this.dateFilter == newValue) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        this.extension,
        newValue,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#dateFilter() dateFilter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateFilter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withDateFilter(Optional<? extends List<DataRequirement_DateFilter>> optional) {
    @Nullable List<DataRequirement_DateFilter> value = optional.orElse(null);
    if (this.dateFilter == value) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        this.extension,
        value,
        this.sort,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#sort() sort} attribute.
   * @param value The value for sort
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withSort(List<DataRequirement_Sort> value) {
    @Nullable List<DataRequirement_Sort> newValue = Objects.requireNonNull(value, "sort");
    if (this.sort == newValue) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        newValue,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#sort() sort} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sort
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withSort(Optional<? extends List<DataRequirement_Sort>> optional) {
    @Nullable List<DataRequirement_Sort> value = optional.orElse(null);
    if (this.sort == value) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        value,
        this.limit,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#limit() limit} attribute.
   * @param value The value for limit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withLimit(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "limit");
    if (this.limit == newValue) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        newValue,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#limit() limit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for limit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withLimit(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.limit == value) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        value,
        this.codeFilter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#codeFilter() codeFilter} attribute.
   * @param value The value for codeFilter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withCodeFilter(List<DataRequirement_CodeFilter> value) {
    @Nullable List<DataRequirement_CodeFilter> newValue = Objects.requireNonNull(value, "codeFilter");
    if (this.codeFilter == newValue) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#codeFilter() codeFilter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeFilter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withCodeFilter(Optional<? extends List<DataRequirement_CodeFilter>> optional) {
    @Nullable List<DataRequirement_CodeFilter> value = optional.orElse(null);
    if (this.codeFilter == value) return this;
    return new ImmutableDataRequirement(
        this.subjectCodeableConcept,
        this.mustSupport,
        this.subjectReference,
        this.id,
        this.profile,
        this.type,
        this.extension,
        this.dateFilter,
        this.sort,
        this.limit,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDataRequirement} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDataRequirement
        && equalTo((ImmutableDataRequirement) another);
  }

  private boolean equalTo(ImmutableDataRequirement another) {
    return Objects.equals(subjectCodeableConcept, another.subjectCodeableConcept)
        && Objects.equals(mustSupport, another.mustSupport)
        && Objects.equals(subjectReference, another.subjectReference)
        && Objects.equals(id, another.id)
        && Objects.equals(profile, another.profile)
        && Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(dateFilter, another.dateFilter)
        && Objects.equals(sort, another.sort)
        && Objects.equals(limit, another.limit)
        && Objects.equals(codeFilter, another.codeFilter);
  }

  /**
   * Computes a hash code from attributes: {@code subjectCodeableConcept}, {@code mustSupport}, {@code subjectReference}, {@code id}, {@code profile}, {@code type}, {@code extension}, {@code dateFilter}, {@code sort}, {@code limit}, {@code codeFilter}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(subjectCodeableConcept);
    h += (h << 5) + Objects.hashCode(mustSupport);
    h += (h << 5) + Objects.hashCode(subjectReference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(profile);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(dateFilter);
    h += (h << 5) + Objects.hashCode(sort);
    h += (h << 5) + Objects.hashCode(limit);
    h += (h << 5) + Objects.hashCode(codeFilter);
    return h;
  }

  /**
   * Prints the immutable value {@code DataRequirement} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DataRequirement{");
    if (subjectCodeableConcept != null) {
      builder.append("subjectCodeableConcept=").append(subjectCodeableConcept);
    }
    if (mustSupport != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("mustSupport=").append(mustSupport);
    }
    if (subjectReference != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("subjectReference=").append(subjectReference);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (profile != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (type != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (dateFilter != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("dateFilter=").append(dateFilter);
    }
    if (sort != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("sort=").append(sort);
    }
    if (limit != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("limit=").append(limit);
    }
    if (codeFilter != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("codeFilter=").append(codeFilter);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DataRequirement", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DataRequirement {
    @Nullable Optional<CodeableConcept> subjectCodeableConcept = Optional.empty();
    boolean subjectCodeableConceptIsSet;
    @Nullable Optional<List<String>> mustSupport = Optional.empty();
    boolean mustSupportIsSet;
    @Nullable Optional<Reference> subjectReference = Optional.empty();
    boolean subjectReferenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Canonical>> profile = Optional.empty();
    boolean profileIsSet;
    @Nullable Optional<Code> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<DataRequirement_DateFilter>> dateFilter = Optional.empty();
    boolean dateFilterIsSet;
    @Nullable Optional<List<DataRequirement_Sort>> sort = Optional.empty();
    boolean sortIsSet;
    @Nullable Optional<PositiveInt> limit = Optional.empty();
    boolean limitIsSet;
    @Nullable Optional<List<DataRequirement_CodeFilter>> codeFilter = Optional.empty();
    boolean codeFilterIsSet;
    @JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(Optional<CodeableConcept> subjectCodeableConcept) {
      this.subjectCodeableConcept = subjectCodeableConcept;
      this.subjectCodeableConceptIsSet = true;
    }
    @JsonProperty("mustSupport")
    public void setMustSupport(Optional<List<String>> mustSupport) {
      this.mustSupport = mustSupport;
      this.mustSupportIsSet = true;
    }
    @JsonProperty("subjectReference")
    public void setSubjectReference(Optional<Reference> subjectReference) {
      this.subjectReference = subjectReference;
      this.subjectReferenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("profile")
    public void setProfile(Optional<List<Canonical>> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Code> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("dateFilter")
    public void setDateFilter(Optional<List<DataRequirement_DateFilter>> dateFilter) {
      this.dateFilter = dateFilter;
      this.dateFilterIsSet = true;
    }
    @JsonProperty("sort")
    public void setSort(Optional<List<DataRequirement_Sort>> sort) {
      this.sort = sort;
      this.sortIsSet = true;
    }
    @JsonProperty("limit")
    public void setLimit(Optional<PositiveInt> limit) {
      this.limit = limit;
      this.limitIsSet = true;
    }
    @JsonProperty("codeFilter")
    public void setCodeFilter(Optional<List<DataRequirement_CodeFilter>> codeFilter) {
      this.codeFilter = codeFilter;
      this.codeFilterIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> subjectCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> mustSupport() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subjectReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> profile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DataRequirement_DateFilter>> dateFilter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DataRequirement_Sort>> sort() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> limit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DataRequirement_CodeFilter>> codeFilter() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDataRequirement fromJson(Json json) {
    ImmutableDataRequirement.Builder builder = ImmutableDataRequirement.builder();
    if (json.subjectCodeableConceptIsSet) {
      builder.subjectCodeableConcept(json.subjectCodeableConcept);
    }
    if (json.mustSupportIsSet) {
      builder.mustSupport(json.mustSupport);
    }
    if (json.subjectReferenceIsSet) {
      builder.subjectReference(json.subjectReference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.dateFilterIsSet) {
      builder.dateFilter(json.dateFilter);
    }
    if (json.sortIsSet) {
      builder.sort(json.sort);
    }
    if (json.limitIsSet) {
      builder.limit(json.limit);
    }
    if (json.codeFilterIsSet) {
      builder.codeFilter(json.codeFilter);
    }
    return (ImmutableDataRequirement) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DataRequirement} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DataRequirement instance
   */
  public static DataRequirement copyOf(DataRequirement instance) {
    if (instance instanceof ImmutableDataRequirement) {
      return (ImmutableDataRequirement) instance;
    }
    return ImmutableDataRequirement.builder()
        .subjectCodeableConcept(instance.subjectCodeableConcept())
        .mustSupport(instance.mustSupport())
        .subjectReference(instance.subjectReference())
        .id(instance.id())
        .profile(instance.profile())
        .type(instance.type())
        .extension(instance.extension())
        .dateFilter(instance.dateFilter())
        .sort(instance.sort())
        .limit(instance.limit())
        .codeFilter(instance.codeFilter())
        .build();
  }

  /**
   * Creates a builder for {@link DataRequirement DataRequirement}.
   * <pre>
   * ImmutableDataRequirement.builder()
   *    .subjectCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link DataRequirement#subjectCodeableConcept() subjectCodeableConcept}
   *    .mustSupport(List&amp;lt;String&amp;gt;) // optional {@link DataRequirement#mustSupport() mustSupport}
   *    .subjectReference(com.fhir.types.fhir.Reference) // optional {@link DataRequirement#subjectReference() subjectReference}
   *    .id(String) // optional {@link DataRequirement#id() id}
   *    .profile(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link DataRequirement#profile() profile}
   *    .type(com.fhir.types.fhir.Code) // optional {@link DataRequirement#type() type}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DataRequirement#extension() extension}
   *    .dateFilter(List&amp;lt;com.fhir.types.fhir.DataRequirement_DateFilter&amp;gt;) // optional {@link DataRequirement#dateFilter() dateFilter}
   *    .sort(List&amp;lt;com.fhir.types.fhir.DataRequirement_Sort&amp;gt;) // optional {@link DataRequirement#sort() sort}
   *    .limit(com.fhir.types.fhir.PositiveInt) // optional {@link DataRequirement#limit() limit}
   *    .codeFilter(List&amp;lt;com.fhir.types.fhir.DataRequirement_CodeFilter&amp;gt;) // optional {@link DataRequirement#codeFilter() codeFilter}
   *    .build();
   * </pre>
   * @return A new DataRequirement builder
   */
  public static ImmutableDataRequirement.Builder builder() {
    return new ImmutableDataRequirement.Builder();
  }

  /**
   * Builds instances of type {@link DataRequirement DataRequirement}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DataRequirement", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SUBJECT_CODEABLE_CONCEPT = 0x1L;
    private static final long OPT_BIT_MUST_SUPPORT = 0x2L;
    private static final long OPT_BIT_SUBJECT_REFERENCE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_PROFILE = 0x10L;
    private static final long OPT_BIT_TYPE = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_DATE_FILTER = 0x80L;
    private static final long OPT_BIT_SORT = 0x100L;
    private static final long OPT_BIT_LIMIT = 0x200L;
    private static final long OPT_BIT_CODE_FILTER = 0x400L;
    private long optBits;

    private @Nullable CodeableConcept subjectCodeableConcept;
    private @Nullable List<String> mustSupport;
    private @Nullable Reference subjectReference;
    private @Nullable String id;
    private @Nullable List<Canonical> profile;
    private @Nullable Code type;
    private @Nullable List<Extension> extension;
    private @Nullable List<DataRequirement_DateFilter> dateFilter;
    private @Nullable List<DataRequirement_Sort> sort;
    private @Nullable PositiveInt limit;
    private @Nullable List<DataRequirement_CodeFilter> codeFilter;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DataRequirement#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectCodeableConcept(CodeableConcept subjectCodeableConcept) {
      checkNotIsSet(subjectCodeableConceptIsSet(), "subjectCodeableConcept");
      this.subjectCodeableConcept = Objects.requireNonNull(subjectCodeableConcept, "subjectCodeableConcept");
      optBits |= OPT_BIT_SUBJECT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subjectCodeableConcept")
    public final Builder subjectCodeableConcept(Optional<? extends CodeableConcept> subjectCodeableConcept) {
      checkNotIsSet(subjectCodeableConceptIsSet(), "subjectCodeableConcept");
      this.subjectCodeableConcept = subjectCodeableConcept.orElse(null);
      optBits |= OPT_BIT_SUBJECT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#mustSupport() mustSupport} to mustSupport.
     * @param mustSupport The value for mustSupport
     * @return {@code this} builder for chained invocation
     */
    public final Builder mustSupport(List<String> mustSupport) {
      checkNotIsSet(mustSupportIsSet(), "mustSupport");
      this.mustSupport = Objects.requireNonNull(mustSupport, "mustSupport");
      optBits |= OPT_BIT_MUST_SUPPORT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#mustSupport() mustSupport} to mustSupport.
     * @param mustSupport The value for mustSupport
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mustSupport")
    public final Builder mustSupport(Optional<? extends List<String>> mustSupport) {
      checkNotIsSet(mustSupportIsSet(), "mustSupport");
      this.mustSupport = mustSupport.orElse(null);
      optBits |= OPT_BIT_MUST_SUPPORT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectReference(Reference subjectReference) {
      checkNotIsSet(subjectReferenceIsSet(), "subjectReference");
      this.subjectReference = Objects.requireNonNull(subjectReference, "subjectReference");
      optBits |= OPT_BIT_SUBJECT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subjectReference")
    public final Builder subjectReference(Optional<? extends Reference> subjectReference) {
      checkNotIsSet(subjectReferenceIsSet(), "subjectReference");
      this.subjectReference = subjectReference.orElse(null);
      optBits |= OPT_BIT_SUBJECT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#id() id} to id.
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
     * Initializes the optional value {@link DataRequirement#id() id} to id.
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
     * Initializes the optional value {@link DataRequirement#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(List<Canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("profile")
    public final Builder profile(Optional<? extends List<Canonical>> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Code type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Code> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#extension() extension} to extension.
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
     * Initializes the optional value {@link DataRequirement#extension() extension} to extension.
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
     * Initializes the optional value {@link DataRequirement#dateFilter() dateFilter} to dateFilter.
     * @param dateFilter The value for dateFilter
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateFilter(List<DataRequirement_DateFilter> dateFilter) {
      checkNotIsSet(dateFilterIsSet(), "dateFilter");
      this.dateFilter = Objects.requireNonNull(dateFilter, "dateFilter");
      optBits |= OPT_BIT_DATE_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#dateFilter() dateFilter} to dateFilter.
     * @param dateFilter The value for dateFilter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dateFilter")
    public final Builder dateFilter(Optional<? extends List<DataRequirement_DateFilter>> dateFilter) {
      checkNotIsSet(dateFilterIsSet(), "dateFilter");
      this.dateFilter = dateFilter.orElse(null);
      optBits |= OPT_BIT_DATE_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#sort() sort} to sort.
     * @param sort The value for sort
     * @return {@code this} builder for chained invocation
     */
    public final Builder sort(List<DataRequirement_Sort> sort) {
      checkNotIsSet(sortIsSet(), "sort");
      this.sort = Objects.requireNonNull(sort, "sort");
      optBits |= OPT_BIT_SORT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#sort() sort} to sort.
     * @param sort The value for sort
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sort")
    public final Builder sort(Optional<? extends List<DataRequirement_Sort>> sort) {
      checkNotIsSet(sortIsSet(), "sort");
      this.sort = sort.orElse(null);
      optBits |= OPT_BIT_SORT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#limit() limit} to limit.
     * @param limit The value for limit
     * @return {@code this} builder for chained invocation
     */
    public final Builder limit(PositiveInt limit) {
      checkNotIsSet(limitIsSet(), "limit");
      this.limit = Objects.requireNonNull(limit, "limit");
      optBits |= OPT_BIT_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#limit() limit} to limit.
     * @param limit The value for limit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("limit")
    public final Builder limit(Optional<? extends PositiveInt> limit) {
      checkNotIsSet(limitIsSet(), "limit");
      this.limit = limit.orElse(null);
      optBits |= OPT_BIT_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#codeFilter() codeFilter} to codeFilter.
     * @param codeFilter The value for codeFilter
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeFilter(List<DataRequirement_CodeFilter> codeFilter) {
      checkNotIsSet(codeFilterIsSet(), "codeFilter");
      this.codeFilter = Objects.requireNonNull(codeFilter, "codeFilter");
      optBits |= OPT_BIT_CODE_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#codeFilter() codeFilter} to codeFilter.
     * @param codeFilter The value for codeFilter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("codeFilter")
    public final Builder codeFilter(Optional<? extends List<DataRequirement_CodeFilter>> codeFilter) {
      checkNotIsSet(codeFilterIsSet(), "codeFilter");
      this.codeFilter = codeFilter.orElse(null);
      optBits |= OPT_BIT_CODE_FILTER;
      return this;
    }

    /**
     * Builds a new {@link DataRequirement DataRequirement}.
     * @return An immutable instance of DataRequirement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DataRequirement build() {
      return new ImmutableDataRequirement(
          subjectCodeableConcept,
          mustSupport,
          subjectReference,
          id,
          profile,
          type,
          extension,
          dateFilter,
          sort,
          limit,
          codeFilter);
    }

    private boolean subjectCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBJECT_CODEABLE_CONCEPT) != 0;
    }

    private boolean mustSupportIsSet() {
      return (optBits & OPT_BIT_MUST_SUPPORT) != 0;
    }

    private boolean subjectReferenceIsSet() {
      return (optBits & OPT_BIT_SUBJECT_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean dateFilterIsSet() {
      return (optBits & OPT_BIT_DATE_FILTER) != 0;
    }

    private boolean sortIsSet() {
      return (optBits & OPT_BIT_SORT) != 0;
    }

    private boolean limitIsSet() {
      return (optBits & OPT_BIT_LIMIT) != 0;
    }

    private boolean codeFilterIsSet() {
      return (optBits & OPT_BIT_CODE_FILTER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DataRequirement is strict, attribute is already set: ".concat(name));
    }
  }
}

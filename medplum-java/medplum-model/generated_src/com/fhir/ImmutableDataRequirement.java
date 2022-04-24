//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link DataRequirement}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDataRequirement.builder()}.
 */
@org.immutables.value.Generated(from = "DataRequirement", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDataRequirement implements com.fhir.DataRequirement {
  private final @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_Sort> sort;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_DateFilter> dateFilter;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> profile;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_CodeFilter> codeFilter;
  private final @javax.annotation.Nullable com.fhir.positiveInt limit;
  private final @javax.annotation.Nullable com.fhir.code type;
  private final @javax.annotation.Nullable com.fhir.Reference subjectReference;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> mustSupport;

  private ImmutableDataRequirement(
      @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_Sort> sort,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept,
      @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_DateFilter> dateFilter,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> profile,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_CodeFilter> codeFilter,
      @javax.annotation.Nullable com.fhir.positiveInt limit,
      @javax.annotation.Nullable com.fhir.code type,
      @javax.annotation.Nullable com.fhir.Reference subjectReference,
      @javax.annotation.Nullable java.util.List<java.lang.String> mustSupport) {
    this.sort = sort;
    this.id = id;
    this.subjectCodeableConcept = subjectCodeableConcept;
    this.dateFilter = dateFilter;
    this.profile = profile;
    this.extension = extension;
    this.codeFilter = codeFilter;
    this.limit = limit;
    this.type = type;
    this.subjectReference = subjectReference;
    this.mustSupport = mustSupport;
  }

  /**
   * @return The value of the {@code sort} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sort")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DataRequirement_Sort>> sort() {
    return java.util.Optional.ofNullable(sort);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code subjectCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subjectCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept() {
    return java.util.Optional.ofNullable(subjectCodeableConcept);
  }

  /**
   * @return The value of the {@code dateFilter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dateFilter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DataRequirement_DateFilter>> dateFilter() {
    return java.util.Optional.ofNullable(dateFilter);
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("profile")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> profile() {
    return java.util.Optional.ofNullable(profile);
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
   * @return The value of the {@code codeFilter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("codeFilter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DataRequirement_CodeFilter>> codeFilter() {
    return java.util.Optional.ofNullable(codeFilter);
  }

  /**
   * @return The value of the {@code limit} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("limit")
  @Override
  public java.util.Optional<com.fhir.positiveInt> limit() {
    return java.util.Optional.ofNullable(limit);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.code> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code subjectReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
  @Override
  public java.util.Optional<com.fhir.Reference> subjectReference() {
    return java.util.Optional.ofNullable(subjectReference);
  }

  /**
   * @return The value of the {@code mustSupport} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("mustSupport")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> mustSupport() {
    return java.util.Optional.ofNullable(mustSupport);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#sort() sort} attribute.
   * @param value The value for sort
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withSort(java.util.List<com.fhir.DataRequirement_Sort> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_Sort> newValue = java.util.Objects.requireNonNull(value, "sort");
    if (this.sort == newValue) return this;
    return new ImmutableDataRequirement(
        newValue,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#sort() sort} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sort
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withSort(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement_Sort>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_Sort> value = optional.orElse(null);
    if (this.sort == value) return this;
    return new ImmutableDataRequirement(
        value,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableDataRequirement(
        this.sort,
        newValue,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableDataRequirement(
        this.sort,
        value,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * @param value The value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withSubjectCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "subjectCodeableConcept");
    if (this.subjectCodeableConcept == newValue) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        newValue,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withSubjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.subjectCodeableConcept == value) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        value,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#dateFilter() dateFilter} attribute.
   * @param value The value for dateFilter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withDateFilter(java.util.List<com.fhir.DataRequirement_DateFilter> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_DateFilter> newValue = java.util.Objects.requireNonNull(value, "dateFilter");
    if (this.dateFilter == newValue) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        newValue,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#dateFilter() dateFilter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateFilter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withDateFilter(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement_DateFilter>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_DateFilter> value = optional.orElse(null);
    if (this.dateFilter == value) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        value,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withProfile(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        newValue,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withProfile(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        value,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        newValue,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        value,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#codeFilter() codeFilter} attribute.
   * @param value The value for codeFilter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withCodeFilter(java.util.List<com.fhir.DataRequirement_CodeFilter> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_CodeFilter> newValue = java.util.Objects.requireNonNull(value, "codeFilter");
    if (this.codeFilter == newValue) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        newValue,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#codeFilter() codeFilter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeFilter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withCodeFilter(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement_CodeFilter>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_CodeFilter> value = optional.orElse(null);
    if (this.codeFilter == value) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        value,
        this.limit,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#limit() limit} attribute.
   * @param value The value for limit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withLimit(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "limit");
    if (this.limit == newValue) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        newValue,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#limit() limit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for limit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withLimit(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.limit == value) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        value,
        this.type,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withType(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        newValue,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withType(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        value,
        this.subjectReference,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#subjectReference() subjectReference} attribute.
   * @param value The value for subjectReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withSubjectReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subjectReference");
    if (this.subjectReference == newValue) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        newValue,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#subjectReference() subjectReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withSubjectReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subjectReference == value) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        value,
        this.mustSupport);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement#mustSupport() mustSupport} attribute.
   * @param value The value for mustSupport
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement withMustSupport(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "mustSupport");
    if (this.mustSupport == newValue) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement#mustSupport() mustSupport} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mustSupport
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement withMustSupport(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.mustSupport == value) return this;
    return new ImmutableDataRequirement(
        this.sort,
        this.id,
        this.subjectCodeableConcept,
        this.dateFilter,
        this.profile,
        this.extension,
        this.codeFilter,
        this.limit,
        this.type,
        this.subjectReference,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDataRequirement} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDataRequirement
        && equalTo((ImmutableDataRequirement) another);
  }

  private boolean equalTo(ImmutableDataRequirement another) {
    return java.util.Objects.equals(sort, another.sort)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(subjectCodeableConcept, another.subjectCodeableConcept)
        && java.util.Objects.equals(dateFilter, another.dateFilter)
        && java.util.Objects.equals(profile, another.profile)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(codeFilter, another.codeFilter)
        && java.util.Objects.equals(limit, another.limit)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(subjectReference, another.subjectReference)
        && java.util.Objects.equals(mustSupport, another.mustSupport);
  }

  /**
   * Computes a hash code from attributes: {@code sort}, {@code id}, {@code subjectCodeableConcept}, {@code dateFilter}, {@code profile}, {@code extension}, {@code codeFilter}, {@code limit}, {@code type}, {@code subjectReference}, {@code mustSupport}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(sort);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(subjectCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(dateFilter);
    h += (h << 5) + java.util.Objects.hashCode(profile);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(codeFilter);
    h += (h << 5) + java.util.Objects.hashCode(limit);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(subjectReference);
    h += (h << 5) + java.util.Objects.hashCode(mustSupport);
    return h;
  }

  /**
   * Prints the immutable value {@code DataRequirement} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("DataRequirement{");
    if (sort != null) {
      builder.append("sort=").append(sort);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (subjectCodeableConcept != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("subjectCodeableConcept=").append(subjectCodeableConcept);
    }
    if (dateFilter != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("dateFilter=").append(dateFilter);
    }
    if (profile != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (codeFilter != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("codeFilter=").append(codeFilter);
    }
    if (limit != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("limit=").append(limit);
    }
    if (type != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (subjectReference != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("subjectReference=").append(subjectReference);
    }
    if (mustSupport != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("mustSupport=").append(mustSupport);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "DataRequirement", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.DataRequirement {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DataRequirement_Sort>> sort = java.util.Optional.empty();
    boolean sortIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept = java.util.Optional.empty();
    boolean subjectCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DataRequirement_DateFilter>> dateFilter = java.util.Optional.empty();
    boolean dateFilterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> profile = java.util.Optional.empty();
    boolean profileIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DataRequirement_CodeFilter>> codeFilter = java.util.Optional.empty();
    boolean codeFilterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> limit = java.util.Optional.empty();
    boolean limitIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subjectReference = java.util.Optional.empty();
    boolean subjectReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> mustSupport = java.util.Optional.empty();
    boolean mustSupportIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("sort")
    public void setSort(java.util.Optional<java.util.List<com.fhir.DataRequirement_Sort>> sort) {
      this.sort = sort;
      this.sortIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept) {
      this.subjectCodeableConcept = subjectCodeableConcept;
      this.subjectCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dateFilter")
    public void setDateFilter(java.util.Optional<java.util.List<com.fhir.DataRequirement_DateFilter>> dateFilter) {
      this.dateFilter = dateFilter;
      this.dateFilterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public void setProfile(java.util.Optional<java.util.List<com.fhir.canonical>> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("codeFilter")
    public void setCodeFilter(java.util.Optional<java.util.List<com.fhir.DataRequirement_CodeFilter>> codeFilter) {
      this.codeFilter = codeFilter;
      this.codeFilterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    public void setLimit(java.util.Optional<com.fhir.positiveInt> limit) {
      this.limit = limit;
      this.limitIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.code> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
    public void setSubjectReference(java.util.Optional<com.fhir.Reference> subjectReference) {
      this.subjectReference = subjectReference;
      this.subjectReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("mustSupport")
    public void setMustSupport(java.util.Optional<java.util.List<java.lang.String>> mustSupport) {
      this.mustSupport = mustSupport;
      this.mustSupportIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DataRequirement_Sort>> sort() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DataRequirement_DateFilter>> dateFilter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> profile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DataRequirement_CodeFilter>> codeFilter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> limit() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subjectReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> mustSupport() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDataRequirement fromJson(Json json) {
    ImmutableDataRequirement.Builder builder = ImmutableDataRequirement.builder();
    if (json.sortIsSet) {
      builder.sort(json.sort);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.subjectCodeableConceptIsSet) {
      builder.subjectCodeableConcept(json.subjectCodeableConcept);
    }
    if (json.dateFilterIsSet) {
      builder.dateFilter(json.dateFilter);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeFilterIsSet) {
      builder.codeFilter(json.codeFilter);
    }
    if (json.limitIsSet) {
      builder.limit(json.limit);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.subjectReferenceIsSet) {
      builder.subjectReference(json.subjectReference);
    }
    if (json.mustSupportIsSet) {
      builder.mustSupport(json.mustSupport);
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
        .sort(instance.sort())
        .id(instance.id())
        .subjectCodeableConcept(instance.subjectCodeableConcept())
        .dateFilter(instance.dateFilter())
        .profile(instance.profile())
        .extension(instance.extension())
        .codeFilter(instance.codeFilter())
        .limit(instance.limit())
        .type(instance.type())
        .subjectReference(instance.subjectReference())
        .mustSupport(instance.mustSupport())
        .build();
  }

  /**
   * Creates a builder for {@link DataRequirement DataRequirement}.
   * <pre>
   * ImmutableDataRequirement.builder()
   *    .sort(List&amp;lt;com.fhir.DataRequirement_Sort&amp;gt;) // optional {@link DataRequirement#sort() sort}
   *    .id(String) // optional {@link DataRequirement#id() id}
   *    .subjectCodeableConcept(com.fhir.CodeableConcept) // optional {@link DataRequirement#subjectCodeableConcept() subjectCodeableConcept}
   *    .dateFilter(List&amp;lt;com.fhir.DataRequirement_DateFilter&amp;gt;) // optional {@link DataRequirement#dateFilter() dateFilter}
   *    .profile(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link DataRequirement#profile() profile}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DataRequirement#extension() extension}
   *    .codeFilter(List&amp;lt;com.fhir.DataRequirement_CodeFilter&amp;gt;) // optional {@link DataRequirement#codeFilter() codeFilter}
   *    .limit(com.fhir.positiveInt) // optional {@link DataRequirement#limit() limit}
   *    .type(com.fhir.code) // optional {@link DataRequirement#type() type}
   *    .subjectReference(com.fhir.Reference) // optional {@link DataRequirement#subjectReference() subjectReference}
   *    .mustSupport(List&amp;lt;String&amp;gt;) // optional {@link DataRequirement#mustSupport() mustSupport}
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
  @org.immutables.value.Generated(from = "DataRequirement", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SORT = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_SUBJECT_CODEABLE_CONCEPT = 0x4L;
    private static final long OPT_BIT_DATE_FILTER = 0x8L;
    private static final long OPT_BIT_PROFILE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_CODE_FILTER = 0x40L;
    private static final long OPT_BIT_LIMIT = 0x80L;
    private static final long OPT_BIT_TYPE = 0x100L;
    private static final long OPT_BIT_SUBJECT_REFERENCE = 0x200L;
    private static final long OPT_BIT_MUST_SUPPORT = 0x400L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_Sort> sort;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
    private @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_DateFilter> dateFilter;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> profile;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement_CodeFilter> codeFilter;
    private @javax.annotation.Nullable com.fhir.positiveInt limit;
    private @javax.annotation.Nullable com.fhir.code type;
    private @javax.annotation.Nullable com.fhir.Reference subjectReference;
    private @javax.annotation.Nullable java.util.List<java.lang.String> mustSupport;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DataRequirement#sort() sort} to sort.
     * @param sort The value for sort
     * @return {@code this} builder for chained invocation
     */
    public final Builder sort(java.util.List<com.fhir.DataRequirement_Sort> sort) {
      checkNotIsSet(sortIsSet(), "sort");
      this.sort = java.util.Objects.requireNonNull(sort, "sort");
      optBits |= OPT_BIT_SORT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#sort() sort} to sort.
     * @param sort The value for sort
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sort")
    public final Builder sort(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement_Sort>> sort) {
      checkNotIsSet(sortIsSet(), "sort");
      this.sort = sort.orElse(null);
      optBits |= OPT_BIT_SORT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectCodeableConcept(com.fhir.CodeableConcept subjectCodeableConcept) {
      checkNotIsSet(subjectCodeableConceptIsSet(), "subjectCodeableConcept");
      this.subjectCodeableConcept = java.util.Objects.requireNonNull(subjectCodeableConcept, "subjectCodeableConcept");
      optBits |= OPT_BIT_SUBJECT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectCodeableConcept")
    public final Builder subjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> subjectCodeableConcept) {
      checkNotIsSet(subjectCodeableConceptIsSet(), "subjectCodeableConcept");
      this.subjectCodeableConcept = subjectCodeableConcept.orElse(null);
      optBits |= OPT_BIT_SUBJECT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#dateFilter() dateFilter} to dateFilter.
     * @param dateFilter The value for dateFilter
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateFilter(java.util.List<com.fhir.DataRequirement_DateFilter> dateFilter) {
      checkNotIsSet(dateFilterIsSet(), "dateFilter");
      this.dateFilter = java.util.Objects.requireNonNull(dateFilter, "dateFilter");
      optBits |= OPT_BIT_DATE_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#dateFilter() dateFilter} to dateFilter.
     * @param dateFilter The value for dateFilter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dateFilter")
    public final Builder dateFilter(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement_DateFilter>> dateFilter) {
      checkNotIsSet(dateFilterIsSet(), "dateFilter");
      this.dateFilter = dateFilter.orElse(null);
      optBits |= OPT_BIT_DATE_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(java.util.List<com.fhir.canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = java.util.Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public final Builder profile(java.util.Optional<? extends java.util.List<com.fhir.canonical>> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#extension() extension} to extension.
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
     * Initializes the optional value {@link DataRequirement#extension() extension} to extension.
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
     * Initializes the optional value {@link DataRequirement#codeFilter() codeFilter} to codeFilter.
     * @param codeFilter The value for codeFilter
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeFilter(java.util.List<com.fhir.DataRequirement_CodeFilter> codeFilter) {
      checkNotIsSet(codeFilterIsSet(), "codeFilter");
      this.codeFilter = java.util.Objects.requireNonNull(codeFilter, "codeFilter");
      optBits |= OPT_BIT_CODE_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#codeFilter() codeFilter} to codeFilter.
     * @param codeFilter The value for codeFilter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("codeFilter")
    public final Builder codeFilter(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement_CodeFilter>> codeFilter) {
      checkNotIsSet(codeFilterIsSet(), "codeFilter");
      this.codeFilter = codeFilter.orElse(null);
      optBits |= OPT_BIT_CODE_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#limit() limit} to limit.
     * @param limit The value for limit
     * @return {@code this} builder for chained invocation
     */
    public final Builder limit(com.fhir.positiveInt limit) {
      checkNotIsSet(limitIsSet(), "limit");
      this.limit = java.util.Objects.requireNonNull(limit, "limit");
      optBits |= OPT_BIT_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#limit() limit} to limit.
     * @param limit The value for limit
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    public final Builder limit(java.util.Optional<? extends com.fhir.positiveInt> limit) {
      checkNotIsSet(limitIsSet(), "limit");
      this.limit = limit.orElse(null);
      optBits |= OPT_BIT_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.code type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.code> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectReference(com.fhir.Reference subjectReference) {
      checkNotIsSet(subjectReferenceIsSet(), "subjectReference");
      this.subjectReference = java.util.Objects.requireNonNull(subjectReference, "subjectReference");
      optBits |= OPT_BIT_SUBJECT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
    public final Builder subjectReference(java.util.Optional<? extends com.fhir.Reference> subjectReference) {
      checkNotIsSet(subjectReferenceIsSet(), "subjectReference");
      this.subjectReference = subjectReference.orElse(null);
      optBits |= OPT_BIT_SUBJECT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#mustSupport() mustSupport} to mustSupport.
     * @param mustSupport The value for mustSupport
     * @return {@code this} builder for chained invocation
     */
    public final Builder mustSupport(java.util.List<java.lang.String> mustSupport) {
      checkNotIsSet(mustSupportIsSet(), "mustSupport");
      this.mustSupport = java.util.Objects.requireNonNull(mustSupport, "mustSupport");
      optBits |= OPT_BIT_MUST_SUPPORT;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement#mustSupport() mustSupport} to mustSupport.
     * @param mustSupport The value for mustSupport
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mustSupport")
    public final Builder mustSupport(java.util.Optional<? extends java.util.List<java.lang.String>> mustSupport) {
      checkNotIsSet(mustSupportIsSet(), "mustSupport");
      this.mustSupport = mustSupport.orElse(null);
      optBits |= OPT_BIT_MUST_SUPPORT;
      return this;
    }

    /**
     * Builds a new {@link DataRequirement DataRequirement}.
     * @return An immutable instance of DataRequirement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.DataRequirement build() {
      return new ImmutableDataRequirement(
          sort,
          id,
          subjectCodeableConcept,
          dateFilter,
          profile,
          extension,
          codeFilter,
          limit,
          type,
          subjectReference,
          mustSupport);
    }

    private boolean sortIsSet() {
      return (optBits & OPT_BIT_SORT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean subjectCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBJECT_CODEABLE_CONCEPT) != 0;
    }

    private boolean dateFilterIsSet() {
      return (optBits & OPT_BIT_DATE_FILTER) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeFilterIsSet() {
      return (optBits & OPT_BIT_CODE_FILTER) != 0;
    }

    private boolean limitIsSet() {
      return (optBits & OPT_BIT_LIMIT) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean subjectReferenceIsSet() {
      return (optBits & OPT_BIT_SUBJECT_REFERENCE) != 0;
    }

    private boolean mustSupportIsSet() {
      return (optBits & OPT_BIT_MUST_SUPPORT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of DataRequirement is strict, attribute is already set: ".concat(name));
    }
  }
}

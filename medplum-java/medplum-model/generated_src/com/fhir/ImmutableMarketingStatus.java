//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MarketingStatus}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMarketingStatus.builder()}.
 */
@org.immutables.value.Generated(from = "MarketingStatus", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMarketingStatus implements com.fhir.MarketingStatus {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.dateTime restoreDate;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept jurisdiction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final com.fhir.CodeableConcept country;
  private final com.fhir.Period dateRange;
  private final com.fhir.CodeableConcept status;
  private final @javax.annotation.Nullable java.lang.String id;

  private ImmutableMarketingStatus(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.dateTime restoreDate,
      @javax.annotation.Nullable com.fhir.CodeableConcept jurisdiction,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      com.fhir.CodeableConcept country,
      com.fhir.Period dateRange,
      com.fhir.CodeableConcept status,
      @javax.annotation.Nullable java.lang.String id) {
    this.extension = extension;
    this.restoreDate = restoreDate;
    this.jurisdiction = jurisdiction;
    this.modifierExtension = modifierExtension;
    this.country = country;
    this.dateRange = dateRange;
    this.status = status;
    this.id = id;
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
   * @return The value of the {@code restoreDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("restoreDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> restoreDate() {
    return java.util.Optional.ofNullable(restoreDate);
  }

  /**
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code country} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("country")
  @Override
  public com.fhir.CodeableConcept country() {
    return country;
  }

  /**
   * @return The value of the {@code dateRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dateRange")
  @Override
  public com.fhir.Period dateRange() {
    return dateRange;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public com.fhir.CodeableConcept status() {
    return status;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MarketingStatus#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketingStatus withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMarketingStatus(
        newValue,
        this.restoreDate,
        this.jurisdiction,
        this.modifierExtension,
        this.country,
        this.dateRange,
        this.status,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MarketingStatus#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMarketingStatus withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMarketingStatus(
        value,
        this.restoreDate,
        this.jurisdiction,
        this.modifierExtension,
        this.country,
        this.dateRange,
        this.status,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MarketingStatus#restoreDate() restoreDate} attribute.
   * @param value The value for restoreDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketingStatus withRestoreDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "restoreDate");
    if (this.restoreDate == newValue) return this;
    return new ImmutableMarketingStatus(
        this.extension,
        newValue,
        this.jurisdiction,
        this.modifierExtension,
        this.country,
        this.dateRange,
        this.status,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MarketingStatus#restoreDate() restoreDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for restoreDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMarketingStatus withRestoreDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.restoreDate == value) return this;
    return new ImmutableMarketingStatus(
        this.extension,
        value,
        this.jurisdiction,
        this.modifierExtension,
        this.country,
        this.dateRange,
        this.status,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MarketingStatus#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketingStatus withJurisdiction(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableMarketingStatus(
        this.extension,
        this.restoreDate,
        newValue,
        this.modifierExtension,
        this.country,
        this.dateRange,
        this.status,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MarketingStatus#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMarketingStatus withJurisdiction(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableMarketingStatus(
        this.extension,
        this.restoreDate,
        value,
        this.modifierExtension,
        this.country,
        this.dateRange,
        this.status,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MarketingStatus#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketingStatus withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMarketingStatus(
        this.extension,
        this.restoreDate,
        this.jurisdiction,
        newValue,
        this.country,
        this.dateRange,
        this.status,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MarketingStatus#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMarketingStatus withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMarketingStatus(
        this.extension,
        this.restoreDate,
        this.jurisdiction,
        value,
        this.country,
        this.dateRange,
        this.status,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketingStatus#country() country} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for country
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketingStatus withCountry(com.fhir.CodeableConcept value) {
    if (this.country == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "country");
    return new ImmutableMarketingStatus(
        this.extension,
        this.restoreDate,
        this.jurisdiction,
        this.modifierExtension,
        newValue,
        this.dateRange,
        this.status,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketingStatus#dateRange() dateRange} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dateRange
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketingStatus withDateRange(com.fhir.Period value) {
    if (this.dateRange == value) return this;
    com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "dateRange");
    return new ImmutableMarketingStatus(
        this.extension,
        this.restoreDate,
        this.jurisdiction,
        this.modifierExtension,
        this.country,
        newValue,
        this.status,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketingStatus#status() status} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketingStatus withStatus(com.fhir.CodeableConcept value) {
    if (this.status == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "status");
    return new ImmutableMarketingStatus(
        this.extension,
        this.restoreDate,
        this.jurisdiction,
        this.modifierExtension,
        this.country,
        this.dateRange,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MarketingStatus#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketingStatus withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableMarketingStatus(
        this.extension,
        this.restoreDate,
        this.jurisdiction,
        this.modifierExtension,
        this.country,
        this.dateRange,
        this.status,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MarketingStatus#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketingStatus withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableMarketingStatus(
        this.extension,
        this.restoreDate,
        this.jurisdiction,
        this.modifierExtension,
        this.country,
        this.dateRange,
        this.status,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMarketingStatus} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMarketingStatus
        && equalTo((ImmutableMarketingStatus) another);
  }

  private boolean equalTo(ImmutableMarketingStatus another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(restoreDate, another.restoreDate)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && country.equals(another.country)
        && dateRange.equals(another.dateRange)
        && status.equals(another.status)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code restoreDate}, {@code jurisdiction}, {@code modifierExtension}, {@code country}, {@code dateRange}, {@code status}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(restoreDate);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + country.hashCode();
    h += (h << 5) + dateRange.hashCode();
    h += (h << 5) + status.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code MarketingStatus} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MarketingStatus{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (restoreDate != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("restoreDate=").append(restoreDate);
    }
    if (jurisdiction != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("country=").append(country);
    builder.append(", ");
    builder.append("dateRange=").append(dateRange);
    builder.append(", ");
    builder.append("status=").append(status);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MarketingStatus", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MarketingStatus {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> restoreDate = java.util.Optional.empty();
    boolean restoreDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept country;
    @javax.annotation.Nullable com.fhir.Period dateRange;
    @javax.annotation.Nullable com.fhir.CodeableConcept status;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("restoreDate")
    public void setRestoreDate(java.util.Optional<com.fhir.dateTime> restoreDate) {
      this.restoreDate = restoreDate;
      this.restoreDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<com.fhir.CodeableConcept> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    public void setCountry(com.fhir.CodeableConcept country) {
      this.country = country;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dateRange")
    public void setDateRange(com.fhir.Period dateRange) {
      this.dateRange = dateRange;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(com.fhir.CodeableConcept status) {
      this.status = status;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> restoreDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept country() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Period dateRange() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMarketingStatus fromJson(Json json) {
    ImmutableMarketingStatus.Builder builder = ((ImmutableMarketingStatus.Builder) ImmutableMarketingStatus.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.restoreDateIsSet) {
      builder.restoreDate(json.restoreDate);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.country != null) {
      builder.country(json.country);
    }
    if (json.dateRange != null) {
      builder.dateRange(json.dateRange);
    }
    if (json.status != null) {
      builder.status(json.status);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableMarketingStatus) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MarketingStatus} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MarketingStatus instance
   */
  public static MarketingStatus copyOf(MarketingStatus instance) {
    if (instance instanceof ImmutableMarketingStatus) {
      return (ImmutableMarketingStatus) instance;
    }
    return ((ImmutableMarketingStatus.Builder) ImmutableMarketingStatus.builder())
        .extension(instance.extension())
        .restoreDate(instance.restoreDate())
        .jurisdiction(instance.jurisdiction())
        .modifierExtension(instance.modifierExtension())
        .country(instance.country())
        .dateRange(instance.dateRange())
        .status(instance.status())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link MarketingStatus MarketingStatus}.
   * <pre>
   * ImmutableMarketingStatus.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MarketingStatus#extension() extension}
   *    .restoreDate(com.fhir.dateTime) // optional {@link MarketingStatus#restoreDate() restoreDate}
   *    .jurisdiction(com.fhir.CodeableConcept) // optional {@link MarketingStatus#jurisdiction() jurisdiction}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MarketingStatus#modifierExtension() modifierExtension}
   *    .country(com.fhir.CodeableConcept) // required {@link MarketingStatus#country() country}
   *    .dateRange(com.fhir.Period) // required {@link MarketingStatus#dateRange() dateRange}
   *    .status(com.fhir.CodeableConcept) // required {@link MarketingStatus#status() status}
   *    .id(String) // optional {@link MarketingStatus#id() id}
   *    .build();
   * </pre>
   * @return A new MarketingStatus builder
   */
  public static CountryBuildStage builder() {
    return new ImmutableMarketingStatus.Builder();
  }

  /**
   * Builds instances of type {@link MarketingStatus MarketingStatus}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MarketingStatus", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements CountryBuildStage, DateRangeBuildStage, StatusBuildStage, BuildFinal {
    private static final long INIT_BIT_COUNTRY = 0x1L;
    private static final long INIT_BIT_DATE_RANGE = 0x2L;
    private static final long INIT_BIT_STATUS = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_RESTORE_DATE = 0x2L;
    private static final long OPT_BIT_JURISDICTION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.dateTime restoreDate;
    private @javax.annotation.Nullable com.fhir.CodeableConcept jurisdiction;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept country;
    private @javax.annotation.Nullable com.fhir.Period dateRange;
    private @javax.annotation.Nullable com.fhir.CodeableConcept status;
    private @javax.annotation.Nullable java.lang.String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MarketingStatus#extension() extension} to extension.
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
     * Initializes the optional value {@link MarketingStatus#extension() extension} to extension.
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
     * Initializes the optional value {@link MarketingStatus#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder restoreDate(com.fhir.dateTime restoreDate) {
      checkNotIsSet(restoreDateIsSet(), "restoreDate");
      this.restoreDate = java.util.Objects.requireNonNull(restoreDate, "restoreDate");
      optBits |= OPT_BIT_RESTORE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MarketingStatus#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restoreDate")
    public final Builder restoreDate(java.util.Optional<? extends com.fhir.dateTime> restoreDate) {
      checkNotIsSet(restoreDateIsSet(), "restoreDate");
      this.restoreDate = restoreDate.orElse(null);
      optBits |= OPT_BIT_RESTORE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MarketingStatus#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(com.fhir.CodeableConcept jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = java.util.Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MarketingStatus#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public final Builder jurisdiction(java.util.Optional<? extends com.fhir.CodeableConcept> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MarketingStatus#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MarketingStatus#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link MarketingStatus#country() country} attribute.
     * @param country The value for country 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    public final Builder country(com.fhir.CodeableConcept country) {
      checkNotIsSet(countryIsSet(), "country");
      this.country = java.util.Objects.requireNonNull(country, "country");
      initBits &= ~INIT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the value for the {@link MarketingStatus#dateRange() dateRange} attribute.
     * @param dateRange The value for dateRange 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dateRange")
    public final Builder dateRange(com.fhir.Period dateRange) {
      checkNotIsSet(dateRangeIsSet(), "dateRange");
      this.dateRange = java.util.Objects.requireNonNull(dateRange, "dateRange");
      initBits &= ~INIT_BIT_DATE_RANGE;
      return this;
    }

    /**
     * Initializes the value for the {@link MarketingStatus#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(com.fhir.CodeableConcept status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MarketingStatus#id() id} to id.
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
     * Initializes the optional value {@link MarketingStatus#id() id} to id.
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
     * Builds a new {@link MarketingStatus MarketingStatus}.
     * @return An immutable instance of MarketingStatus
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MarketingStatus build() {
      checkRequiredAttributes();
      return new ImmutableMarketingStatus(extension, restoreDate, jurisdiction, modifierExtension, country, dateRange, status, id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean restoreDateIsSet() {
      return (optBits & OPT_BIT_RESTORE_DATE) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean countryIsSet() {
      return (initBits & INIT_BIT_COUNTRY) == 0;
    }

    private boolean dateRangeIsSet() {
      return (initBits & INIT_BIT_DATE_RANGE) == 0;
    }

    private boolean statusIsSet() {
      return (initBits & INIT_BIT_STATUS) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MarketingStatus is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!countryIsSet()) attributes.add("country");
      if (!dateRangeIsSet()) attributes.add("dateRange");
      if (!statusIsSet()) attributes.add("status");
      return "Cannot build MarketingStatus, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MarketingStatus", generator = "Immutables")
  public interface CountryBuildStage {
    /**
     * Initializes the value for the {@link MarketingStatus#country() country} attribute.
     * @param country The value for country 
     * @return {@code this} builder for use in a chained invocation
     */
    DateRangeBuildStage country(com.fhir.CodeableConcept country);
  }

  @org.immutables.value.Generated(from = "MarketingStatus", generator = "Immutables")
  public interface DateRangeBuildStage {
    /**
     * Initializes the value for the {@link MarketingStatus#dateRange() dateRange} attribute.
     * @param dateRange The value for dateRange 
     * @return {@code this} builder for use in a chained invocation
     */
    StatusBuildStage dateRange(com.fhir.Period dateRange);
  }

  @org.immutables.value.Generated(from = "MarketingStatus", generator = "Immutables")
  public interface StatusBuildStage {
    /**
     * Initializes the value for the {@link MarketingStatus#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(com.fhir.CodeableConcept status);
  }

  @org.immutables.value.Generated(from = "MarketingStatus", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MarketingStatus#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MarketingStatus#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MarketingStatus#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal restoreDate(com.fhir.dateTime restoreDate);

    /**
     * Initializes the optional value {@link MarketingStatus#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal restoreDate(java.util.Optional<? extends com.fhir.dateTime> restoreDate);

    /**
     * Initializes the optional value {@link MarketingStatus#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(com.fhir.CodeableConcept jurisdiction);

    /**
     * Initializes the optional value {@link MarketingStatus#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link MarketingStatus#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MarketingStatus#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MarketingStatus#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link MarketingStatus#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Builds a new {@link MarketingStatus MarketingStatus}.
     * @return An immutable instance of MarketingStatus
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MarketingStatus build();
  }
}

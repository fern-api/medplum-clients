//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Location_HoursOfOperation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLocation_HoursOfOperation.builder()}.
 */
@org.immutables.value.Generated(from = "Location_HoursOfOperation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableLocation_HoursOfOperation implements com.fhir.Location_HoursOfOperation {
  private final @javax.annotation.Nullable java.util.List<com.fhir.code> daysOfWeek;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.Boolean allDay;
  private final @javax.annotation.Nullable com.fhir.time openingTime;
  private final @javax.annotation.Nullable com.fhir.time closingTime;

  private ImmutableLocation_HoursOfOperation(
      @javax.annotation.Nullable java.util.List<com.fhir.code> daysOfWeek,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.Boolean allDay,
      @javax.annotation.Nullable com.fhir.time openingTime,
      @javax.annotation.Nullable com.fhir.time closingTime) {
    this.daysOfWeek = daysOfWeek;
    this.extension = extension;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.allDay = allDay;
    this.openingTime = openingTime;
    this.closingTime = closingTime;
  }

  /**
   * @return The value of the {@code daysOfWeek} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("daysOfWeek")
  @Override
  public java.util.Optional<java.util.List<com.fhir.code>> daysOfWeek() {
    return java.util.Optional.ofNullable(daysOfWeek);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code allDay} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("allDay")
  @Override
  public java.util.Optional<java.lang.Boolean> allDay() {
    return java.util.Optional.ofNullable(allDay);
  }

  /**
   * @return The value of the {@code openingTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("openingTime")
  @Override
  public java.util.Optional<com.fhir.time> openingTime() {
    return java.util.Optional.ofNullable(openingTime);
  }

  /**
   * @return The value of the {@code closingTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("closingTime")
  @Override
  public java.util.Optional<com.fhir.time> closingTime() {
    return java.util.Optional.ofNullable(closingTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#daysOfWeek() daysOfWeek} attribute.
   * @param value The value for daysOfWeek
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withDaysOfWeek(java.util.List<com.fhir.code> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> newValue = java.util.Objects.requireNonNull(value, "daysOfWeek");
    if (this.daysOfWeek == newValue) return this;
    return new ImmutableLocation_HoursOfOperation(
        newValue,
        this.extension,
        this.id,
        this.modifierExtension,
        this.allDay,
        this.openingTime,
        this.closingTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#daysOfWeek() daysOfWeek} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for daysOfWeek
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_HoursOfOperation withDaysOfWeek(java.util.Optional<? extends java.util.List<com.fhir.code>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> value = optional.orElse(null);
    if (this.daysOfWeek == value) return this;
    return new ImmutableLocation_HoursOfOperation(
        value,
        this.extension,
        this.id,
        this.modifierExtension,
        this.allDay,
        this.openingTime,
        this.closingTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.daysOfWeek,
        newValue,
        this.id,
        this.modifierExtension,
        this.allDay,
        this.openingTime,
        this.closingTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_HoursOfOperation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.daysOfWeek,
        value,
        this.id,
        this.modifierExtension,
        this.allDay,
        this.openingTime,
        this.closingTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.daysOfWeek,
        this.extension,
        newValue,
        this.modifierExtension,
        this.allDay,
        this.openingTime,
        this.closingTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.daysOfWeek,
        this.extension,
        value,
        this.modifierExtension,
        this.allDay,
        this.openingTime,
        this.closingTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.daysOfWeek,
        this.extension,
        this.id,
        newValue,
        this.allDay,
        this.openingTime,
        this.closingTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_HoursOfOperation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.daysOfWeek,
        this.extension,
        this.id,
        value,
        this.allDay,
        this.openingTime,
        this.closingTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#allDay() allDay} attribute.
   * @param value The value for allDay
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withAllDay(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.allDay, newValue)) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.daysOfWeek,
        this.extension,
        this.id,
        this.modifierExtension,
        newValue,
        this.openingTime,
        this.closingTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#allDay() allDay} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allDay
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withAllDay(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.allDay, value)) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.daysOfWeek,
        this.extension,
        this.id,
        this.modifierExtension,
        value,
        this.openingTime,
        this.closingTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#openingTime() openingTime} attribute.
   * @param value The value for openingTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withOpeningTime(com.fhir.time value) {
    @javax.annotation.Nullable com.fhir.time newValue = java.util.Objects.requireNonNull(value, "openingTime");
    if (this.openingTime == newValue) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.daysOfWeek,
        this.extension,
        this.id,
        this.modifierExtension,
        this.allDay,
        newValue,
        this.closingTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#openingTime() openingTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for openingTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_HoursOfOperation withOpeningTime(java.util.Optional<? extends com.fhir.time> optional) {
    @javax.annotation.Nullable com.fhir.time value = optional.orElse(null);
    if (this.openingTime == value) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.daysOfWeek,
        this.extension,
        this.id,
        this.modifierExtension,
        this.allDay,
        value,
        this.closingTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#closingTime() closingTime} attribute.
   * @param value The value for closingTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withClosingTime(com.fhir.time value) {
    @javax.annotation.Nullable com.fhir.time newValue = java.util.Objects.requireNonNull(value, "closingTime");
    if (this.closingTime == newValue) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.daysOfWeek,
        this.extension,
        this.id,
        this.modifierExtension,
        this.allDay,
        this.openingTime,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#closingTime() closingTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for closingTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_HoursOfOperation withClosingTime(java.util.Optional<? extends com.fhir.time> optional) {
    @javax.annotation.Nullable com.fhir.time value = optional.orElse(null);
    if (this.closingTime == value) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.daysOfWeek,
        this.extension,
        this.id,
        this.modifierExtension,
        this.allDay,
        this.openingTime,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLocation_HoursOfOperation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLocation_HoursOfOperation
        && equalTo((ImmutableLocation_HoursOfOperation) another);
  }

  private boolean equalTo(ImmutableLocation_HoursOfOperation another) {
    return java.util.Objects.equals(daysOfWeek, another.daysOfWeek)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(allDay, another.allDay)
        && java.util.Objects.equals(openingTime, another.openingTime)
        && java.util.Objects.equals(closingTime, another.closingTime);
  }

  /**
   * Computes a hash code from attributes: {@code daysOfWeek}, {@code extension}, {@code id}, {@code modifierExtension}, {@code allDay}, {@code openingTime}, {@code closingTime}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(daysOfWeek);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(allDay);
    h += (h << 5) + java.util.Objects.hashCode(openingTime);
    h += (h << 5) + java.util.Objects.hashCode(closingTime);
    return h;
  }

  /**
   * Prints the immutable value {@code Location_HoursOfOperation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Location_HoursOfOperation{");
    if (daysOfWeek != null) {
      builder.append("daysOfWeek=").append(daysOfWeek);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (allDay != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("allDay=").append(allDay);
    }
    if (openingTime != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("openingTime=").append(openingTime);
    }
    if (closingTime != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("closingTime=").append(closingTime);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Location_HoursOfOperation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Location_HoursOfOperation {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.code>> daysOfWeek = java.util.Optional.empty();
    boolean daysOfWeekIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> allDay = java.util.Optional.empty();
    boolean allDayIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.time> openingTime = java.util.Optional.empty();
    boolean openingTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.time> closingTime = java.util.Optional.empty();
    boolean closingTimeIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("daysOfWeek")
    public void setDaysOfWeek(java.util.Optional<java.util.List<com.fhir.code>> daysOfWeek) {
      this.daysOfWeek = daysOfWeek;
      this.daysOfWeekIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("allDay")
    public void setAllDay(java.util.Optional<java.lang.Boolean> allDay) {
      this.allDay = allDay;
      this.allDayIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("openingTime")
    public void setOpeningTime(java.util.Optional<com.fhir.time> openingTime) {
      this.openingTime = openingTime;
      this.openingTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("closingTime")
    public void setClosingTime(java.util.Optional<com.fhir.time> closingTime) {
      this.closingTime = closingTime;
      this.closingTimeIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.code>> daysOfWeek() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> allDay() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.time> openingTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.time> closingTime() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableLocation_HoursOfOperation fromJson(Json json) {
    ImmutableLocation_HoursOfOperation.Builder builder = ImmutableLocation_HoursOfOperation.builder();
    if (json.daysOfWeekIsSet) {
      builder.daysOfWeek(json.daysOfWeek);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.allDayIsSet) {
      builder.allDay(json.allDay);
    }
    if (json.openingTimeIsSet) {
      builder.openingTime(json.openingTime);
    }
    if (json.closingTimeIsSet) {
      builder.closingTime(json.closingTime);
    }
    return (ImmutableLocation_HoursOfOperation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Location_HoursOfOperation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Location_HoursOfOperation instance
   */
  public static Location_HoursOfOperation copyOf(Location_HoursOfOperation instance) {
    if (instance instanceof ImmutableLocation_HoursOfOperation) {
      return (ImmutableLocation_HoursOfOperation) instance;
    }
    return ImmutableLocation_HoursOfOperation.builder()
        .daysOfWeek(instance.daysOfWeek())
        .extension(instance.extension())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .allDay(instance.allDay())
        .openingTime(instance.openingTime())
        .closingTime(instance.closingTime())
        .build();
  }

  /**
   * Creates a builder for {@link Location_HoursOfOperation Location_HoursOfOperation}.
   * <pre>
   * ImmutableLocation_HoursOfOperation.builder()
   *    .daysOfWeek(List&amp;lt;com.fhir.code&amp;gt;) // optional {@link Location_HoursOfOperation#daysOfWeek() daysOfWeek}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Location_HoursOfOperation#extension() extension}
   *    .id(String) // optional {@link Location_HoursOfOperation#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Location_HoursOfOperation#modifierExtension() modifierExtension}
   *    .allDay(Boolean) // optional {@link Location_HoursOfOperation#allDay() allDay}
   *    .openingTime(com.fhir.time) // optional {@link Location_HoursOfOperation#openingTime() openingTime}
   *    .closingTime(com.fhir.time) // optional {@link Location_HoursOfOperation#closingTime() closingTime}
   *    .build();
   * </pre>
   * @return A new Location_HoursOfOperation builder
   */
  public static ImmutableLocation_HoursOfOperation.Builder builder() {
    return new ImmutableLocation_HoursOfOperation.Builder();
  }

  /**
   * Builds instances of type {@link Location_HoursOfOperation Location_HoursOfOperation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Location_HoursOfOperation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DAYS_OF_WEEK = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ALL_DAY = 0x10L;
    private static final long OPT_BIT_OPENING_TIME = 0x20L;
    private static final long OPT_BIT_CLOSING_TIME = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.code> daysOfWeek;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.Boolean allDay;
    private @javax.annotation.Nullable com.fhir.time openingTime;
    private @javax.annotation.Nullable com.fhir.time closingTime;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#daysOfWeek() daysOfWeek} to daysOfWeek.
     * @param daysOfWeek The value for daysOfWeek
     * @return {@code this} builder for chained invocation
     */
    public final Builder daysOfWeek(java.util.List<com.fhir.code> daysOfWeek) {
      checkNotIsSet(daysOfWeekIsSet(), "daysOfWeek");
      this.daysOfWeek = java.util.Objects.requireNonNull(daysOfWeek, "daysOfWeek");
      optBits |= OPT_BIT_DAYS_OF_WEEK;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#daysOfWeek() daysOfWeek} to daysOfWeek.
     * @param daysOfWeek The value for daysOfWeek
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("daysOfWeek")
    public final Builder daysOfWeek(java.util.Optional<? extends java.util.List<com.fhir.code>> daysOfWeek) {
      checkNotIsSet(daysOfWeekIsSet(), "daysOfWeek");
      this.daysOfWeek = daysOfWeek.orElse(null);
      optBits |= OPT_BIT_DAYS_OF_WEEK;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#extension() extension} to extension.
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
     * Initializes the optional value {@link Location_HoursOfOperation#extension() extension} to extension.
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
     * Initializes the optional value {@link Location_HoursOfOperation#id() id} to id.
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
     * Initializes the optional value {@link Location_HoursOfOperation#id() id} to id.
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
     * Initializes the optional value {@link Location_HoursOfOperation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Location_HoursOfOperation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Location_HoursOfOperation#allDay() allDay} to allDay.
     * @param allDay The value for allDay
     * @return {@code this} builder for chained invocation
     */
    public final Builder allDay(boolean allDay) {
      checkNotIsSet(allDayIsSet(), "allDay");
      this.allDay = allDay;
      optBits |= OPT_BIT_ALL_DAY;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#allDay() allDay} to allDay.
     * @param allDay The value for allDay
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allDay")
    public final Builder allDay(java.util.Optional<java.lang.Boolean> allDay) {
      checkNotIsSet(allDayIsSet(), "allDay");
      this.allDay = allDay.orElse(null);
      optBits |= OPT_BIT_ALL_DAY;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#openingTime() openingTime} to openingTime.
     * @param openingTime The value for openingTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder openingTime(com.fhir.time openingTime) {
      checkNotIsSet(openingTimeIsSet(), "openingTime");
      this.openingTime = java.util.Objects.requireNonNull(openingTime, "openingTime");
      optBits |= OPT_BIT_OPENING_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#openingTime() openingTime} to openingTime.
     * @param openingTime The value for openingTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("openingTime")
    public final Builder openingTime(java.util.Optional<? extends com.fhir.time> openingTime) {
      checkNotIsSet(openingTimeIsSet(), "openingTime");
      this.openingTime = openingTime.orElse(null);
      optBits |= OPT_BIT_OPENING_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#closingTime() closingTime} to closingTime.
     * @param closingTime The value for closingTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder closingTime(com.fhir.time closingTime) {
      checkNotIsSet(closingTimeIsSet(), "closingTime");
      this.closingTime = java.util.Objects.requireNonNull(closingTime, "closingTime");
      optBits |= OPT_BIT_CLOSING_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#closingTime() closingTime} to closingTime.
     * @param closingTime The value for closingTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("closingTime")
    public final Builder closingTime(java.util.Optional<? extends com.fhir.time> closingTime) {
      checkNotIsSet(closingTimeIsSet(), "closingTime");
      this.closingTime = closingTime.orElse(null);
      optBits |= OPT_BIT_CLOSING_TIME;
      return this;
    }

    /**
     * Builds a new {@link Location_HoursOfOperation Location_HoursOfOperation}.
     * @return An immutable instance of Location_HoursOfOperation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Location_HoursOfOperation build() {
      return new ImmutableLocation_HoursOfOperation(daysOfWeek, extension, id, modifierExtension, allDay, openingTime, closingTime);
    }

    private boolean daysOfWeekIsSet() {
      return (optBits & OPT_BIT_DAYS_OF_WEEK) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean allDayIsSet() {
      return (optBits & OPT_BIT_ALL_DAY) != 0;
    }

    private boolean openingTimeIsSet() {
      return (optBits & OPT_BIT_OPENING_TIME) != 0;
    }

    private boolean closingTimeIsSet() {
      return (optBits & OPT_BIT_CLOSING_TIME) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Location_HoursOfOperation is strict, attribute is already set: ".concat(name));
    }
  }
}
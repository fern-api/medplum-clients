//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link PractitionerRole_AvailableTime}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePractitionerRole_AvailableTime.builder()}.
 */
@org.immutables.value.Generated(from = "PractitionerRole_AvailableTime", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePractitionerRole_AvailableTime implements com.fhir.PractitionerRole_AvailableTime {
  private final @javax.annotation.Nullable java.lang.Boolean allDay;
  private final @javax.annotation.Nullable com.fhir.time availableEndTime;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.time availableStartTime;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.code> daysOfWeek;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutablePractitionerRole_AvailableTime(
      @javax.annotation.Nullable java.lang.Boolean allDay,
      @javax.annotation.Nullable com.fhir.time availableEndTime,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.time availableStartTime,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.code> daysOfWeek,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.allDay = allDay;
    this.availableEndTime = availableEndTime;
    this.extension = extension;
    this.availableStartTime = availableStartTime;
    this.id = id;
    this.daysOfWeek = daysOfWeek;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code availableEndTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("availableEndTime")
  @Override
  public java.util.Optional<com.fhir.time> availableEndTime() {
    return java.util.Optional.ofNullable(availableEndTime);
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
   * @return The value of the {@code availableStartTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("availableStartTime")
  @Override
  public java.util.Optional<com.fhir.time> availableStartTime() {
    return java.util.Optional.ofNullable(availableStartTime);
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
   * @return The value of the {@code daysOfWeek} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("daysOfWeek")
  @Override
  public java.util.Optional<java.util.List<com.fhir.code>> daysOfWeek() {
    return java.util.Optional.ofNullable(daysOfWeek);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole_AvailableTime#allDay() allDay} attribute.
   * @param value The value for allDay
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_AvailableTime withAllDay(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.allDay, newValue)) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        newValue,
        this.availableEndTime,
        this.extension,
        this.availableStartTime,
        this.id,
        this.daysOfWeek,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole_AvailableTime#allDay() allDay} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allDay
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_AvailableTime withAllDay(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.allDay, value)) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        value,
        this.availableEndTime,
        this.extension,
        this.availableStartTime,
        this.id,
        this.daysOfWeek,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole_AvailableTime#availableEndTime() availableEndTime} attribute.
   * @param value The value for availableEndTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_AvailableTime withAvailableEndTime(com.fhir.time value) {
    @javax.annotation.Nullable com.fhir.time newValue = java.util.Objects.requireNonNull(value, "availableEndTime");
    if (this.availableEndTime == newValue) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        this.allDay,
        newValue,
        this.extension,
        this.availableStartTime,
        this.id,
        this.daysOfWeek,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole_AvailableTime#availableEndTime() availableEndTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availableEndTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole_AvailableTime withAvailableEndTime(java.util.Optional<? extends com.fhir.time> optional) {
    @javax.annotation.Nullable com.fhir.time value = optional.orElse(null);
    if (this.availableEndTime == value) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        this.allDay,
        value,
        this.extension,
        this.availableStartTime,
        this.id,
        this.daysOfWeek,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole_AvailableTime#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_AvailableTime withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        this.allDay,
        this.availableEndTime,
        newValue,
        this.availableStartTime,
        this.id,
        this.daysOfWeek,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole_AvailableTime#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole_AvailableTime withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        this.allDay,
        this.availableEndTime,
        value,
        this.availableStartTime,
        this.id,
        this.daysOfWeek,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole_AvailableTime#availableStartTime() availableStartTime} attribute.
   * @param value The value for availableStartTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_AvailableTime withAvailableStartTime(com.fhir.time value) {
    @javax.annotation.Nullable com.fhir.time newValue = java.util.Objects.requireNonNull(value, "availableStartTime");
    if (this.availableStartTime == newValue) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        this.allDay,
        this.availableEndTime,
        this.extension,
        newValue,
        this.id,
        this.daysOfWeek,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole_AvailableTime#availableStartTime() availableStartTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availableStartTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole_AvailableTime withAvailableStartTime(java.util.Optional<? extends com.fhir.time> optional) {
    @javax.annotation.Nullable com.fhir.time value = optional.orElse(null);
    if (this.availableStartTime == value) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        this.allDay,
        this.availableEndTime,
        this.extension,
        value,
        this.id,
        this.daysOfWeek,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole_AvailableTime#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_AvailableTime withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        this.allDay,
        this.availableEndTime,
        this.extension,
        this.availableStartTime,
        newValue,
        this.daysOfWeek,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole_AvailableTime#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_AvailableTime withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        this.allDay,
        this.availableEndTime,
        this.extension,
        this.availableStartTime,
        value,
        this.daysOfWeek,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole_AvailableTime#daysOfWeek() daysOfWeek} attribute.
   * @param value The value for daysOfWeek
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_AvailableTime withDaysOfWeek(java.util.List<com.fhir.code> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> newValue = java.util.Objects.requireNonNull(value, "daysOfWeek");
    if (this.daysOfWeek == newValue) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        this.allDay,
        this.availableEndTime,
        this.extension,
        this.availableStartTime,
        this.id,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole_AvailableTime#daysOfWeek() daysOfWeek} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for daysOfWeek
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole_AvailableTime withDaysOfWeek(java.util.Optional<? extends java.util.List<com.fhir.code>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> value = optional.orElse(null);
    if (this.daysOfWeek == value) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        this.allDay,
        this.availableEndTime,
        this.extension,
        this.availableStartTime,
        this.id,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole_AvailableTime#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_AvailableTime withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        this.allDay,
        this.availableEndTime,
        this.extension,
        this.availableStartTime,
        this.id,
        this.daysOfWeek,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole_AvailableTime#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole_AvailableTime withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePractitionerRole_AvailableTime(
        this.allDay,
        this.availableEndTime,
        this.extension,
        this.availableStartTime,
        this.id,
        this.daysOfWeek,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePractitionerRole_AvailableTime} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePractitionerRole_AvailableTime
        && equalTo((ImmutablePractitionerRole_AvailableTime) another);
  }

  private boolean equalTo(ImmutablePractitionerRole_AvailableTime another) {
    return java.util.Objects.equals(allDay, another.allDay)
        && java.util.Objects.equals(availableEndTime, another.availableEndTime)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(availableStartTime, another.availableStartTime)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(daysOfWeek, another.daysOfWeek)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code allDay}, {@code availableEndTime}, {@code extension}, {@code availableStartTime}, {@code id}, {@code daysOfWeek}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(allDay);
    h += (h << 5) + java.util.Objects.hashCode(availableEndTime);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(availableStartTime);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(daysOfWeek);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code PractitionerRole_AvailableTime} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("PractitionerRole_AvailableTime{");
    if (allDay != null) {
      builder.append("allDay=").append(allDay);
    }
    if (availableEndTime != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("availableEndTime=").append(availableEndTime);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (availableStartTime != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("availableStartTime=").append(availableStartTime);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (daysOfWeek != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("daysOfWeek=").append(daysOfWeek);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "PractitionerRole_AvailableTime", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.PractitionerRole_AvailableTime {
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> allDay = java.util.Optional.empty();
    boolean allDayIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.time> availableEndTime = java.util.Optional.empty();
    boolean availableEndTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.time> availableStartTime = java.util.Optional.empty();
    boolean availableStartTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.code>> daysOfWeek = java.util.Optional.empty();
    boolean daysOfWeekIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("allDay")
    public void setAllDay(java.util.Optional<java.lang.Boolean> allDay) {
      this.allDay = allDay;
      this.allDayIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("availableEndTime")
    public void setAvailableEndTime(java.util.Optional<com.fhir.time> availableEndTime) {
      this.availableEndTime = availableEndTime;
      this.availableEndTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("availableStartTime")
    public void setAvailableStartTime(java.util.Optional<com.fhir.time> availableStartTime) {
      this.availableStartTime = availableStartTime;
      this.availableStartTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("daysOfWeek")
    public void setDaysOfWeek(java.util.Optional<java.util.List<com.fhir.code>> daysOfWeek) {
      this.daysOfWeek = daysOfWeek;
      this.daysOfWeekIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.Boolean> allDay() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.time> availableEndTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.time> availableStartTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.code>> daysOfWeek() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutablePractitionerRole_AvailableTime fromJson(Json json) {
    ImmutablePractitionerRole_AvailableTime.Builder builder = ImmutablePractitionerRole_AvailableTime.builder();
    if (json.allDayIsSet) {
      builder.allDay(json.allDay);
    }
    if (json.availableEndTimeIsSet) {
      builder.availableEndTime(json.availableEndTime);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.availableStartTimeIsSet) {
      builder.availableStartTime(json.availableStartTime);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.daysOfWeekIsSet) {
      builder.daysOfWeek(json.daysOfWeek);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutablePractitionerRole_AvailableTime) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PractitionerRole_AvailableTime} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PractitionerRole_AvailableTime instance
   */
  public static PractitionerRole_AvailableTime copyOf(PractitionerRole_AvailableTime instance) {
    if (instance instanceof ImmutablePractitionerRole_AvailableTime) {
      return (ImmutablePractitionerRole_AvailableTime) instance;
    }
    return ImmutablePractitionerRole_AvailableTime.builder()
        .allDay(instance.allDay())
        .availableEndTime(instance.availableEndTime())
        .extension(instance.extension())
        .availableStartTime(instance.availableStartTime())
        .id(instance.id())
        .daysOfWeek(instance.daysOfWeek())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link PractitionerRole_AvailableTime PractitionerRole_AvailableTime}.
   * <pre>
   * ImmutablePractitionerRole_AvailableTime.builder()
   *    .allDay(Boolean) // optional {@link PractitionerRole_AvailableTime#allDay() allDay}
   *    .availableEndTime(com.fhir.time) // optional {@link PractitionerRole_AvailableTime#availableEndTime() availableEndTime}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PractitionerRole_AvailableTime#extension() extension}
   *    .availableStartTime(com.fhir.time) // optional {@link PractitionerRole_AvailableTime#availableStartTime() availableStartTime}
   *    .id(String) // optional {@link PractitionerRole_AvailableTime#id() id}
   *    .daysOfWeek(List&amp;lt;com.fhir.code&amp;gt;) // optional {@link PractitionerRole_AvailableTime#daysOfWeek() daysOfWeek}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PractitionerRole_AvailableTime#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new PractitionerRole_AvailableTime builder
   */
  public static ImmutablePractitionerRole_AvailableTime.Builder builder() {
    return new ImmutablePractitionerRole_AvailableTime.Builder();
  }

  /**
   * Builds instances of type {@link PractitionerRole_AvailableTime PractitionerRole_AvailableTime}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "PractitionerRole_AvailableTime", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ALL_DAY = 0x1L;
    private static final long OPT_BIT_AVAILABLE_END_TIME = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_AVAILABLE_START_TIME = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_DAYS_OF_WEEK = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.Boolean allDay;
    private @javax.annotation.Nullable com.fhir.time availableEndTime;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.time availableStartTime;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.code> daysOfWeek;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PractitionerRole_AvailableTime#allDay() allDay} to allDay.
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
     * Initializes the optional value {@link PractitionerRole_AvailableTime#allDay() allDay} to allDay.
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
     * Initializes the optional value {@link PractitionerRole_AvailableTime#availableEndTime() availableEndTime} to availableEndTime.
     * @param availableEndTime The value for availableEndTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder availableEndTime(com.fhir.time availableEndTime) {
      checkNotIsSet(availableEndTimeIsSet(), "availableEndTime");
      this.availableEndTime = java.util.Objects.requireNonNull(availableEndTime, "availableEndTime");
      optBits |= OPT_BIT_AVAILABLE_END_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole_AvailableTime#availableEndTime() availableEndTime} to availableEndTime.
     * @param availableEndTime The value for availableEndTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableEndTime")
    public final Builder availableEndTime(java.util.Optional<? extends com.fhir.time> availableEndTime) {
      checkNotIsSet(availableEndTimeIsSet(), "availableEndTime");
      this.availableEndTime = availableEndTime.orElse(null);
      optBits |= OPT_BIT_AVAILABLE_END_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole_AvailableTime#extension() extension} to extension.
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
     * Initializes the optional value {@link PractitionerRole_AvailableTime#extension() extension} to extension.
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
     * Initializes the optional value {@link PractitionerRole_AvailableTime#availableStartTime() availableStartTime} to availableStartTime.
     * @param availableStartTime The value for availableStartTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder availableStartTime(com.fhir.time availableStartTime) {
      checkNotIsSet(availableStartTimeIsSet(), "availableStartTime");
      this.availableStartTime = java.util.Objects.requireNonNull(availableStartTime, "availableStartTime");
      optBits |= OPT_BIT_AVAILABLE_START_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole_AvailableTime#availableStartTime() availableStartTime} to availableStartTime.
     * @param availableStartTime The value for availableStartTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableStartTime")
    public final Builder availableStartTime(java.util.Optional<? extends com.fhir.time> availableStartTime) {
      checkNotIsSet(availableStartTimeIsSet(), "availableStartTime");
      this.availableStartTime = availableStartTime.orElse(null);
      optBits |= OPT_BIT_AVAILABLE_START_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole_AvailableTime#id() id} to id.
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
     * Initializes the optional value {@link PractitionerRole_AvailableTime#id() id} to id.
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
     * Initializes the optional value {@link PractitionerRole_AvailableTime#daysOfWeek() daysOfWeek} to daysOfWeek.
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
     * Initializes the optional value {@link PractitionerRole_AvailableTime#daysOfWeek() daysOfWeek} to daysOfWeek.
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
     * Initializes the optional value {@link PractitionerRole_AvailableTime#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PractitionerRole_AvailableTime#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link PractitionerRole_AvailableTime PractitionerRole_AvailableTime}.
     * @return An immutable instance of PractitionerRole_AvailableTime
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.PractitionerRole_AvailableTime build() {
      return new ImmutablePractitionerRole_AvailableTime(allDay, availableEndTime, extension, availableStartTime, id, daysOfWeek, modifierExtension);
    }

    private boolean allDayIsSet() {
      return (optBits & OPT_BIT_ALL_DAY) != 0;
    }

    private boolean availableEndTimeIsSet() {
      return (optBits & OPT_BIT_AVAILABLE_END_TIME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean availableStartTimeIsSet() {
      return (optBits & OPT_BIT_AVAILABLE_START_TIME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean daysOfWeekIsSet() {
      return (optBits & OPT_BIT_DAYS_OF_WEEK) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of PractitionerRole_AvailableTime is strict, attribute is already set: ".concat(name));
    }
  }
}

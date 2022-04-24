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
 * Immutable implementation of {@link Address}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAddress.builder()}.
 */
@Generated(from = "Address", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAddress implements Address {
  private final @Nullable AddressType type;
  private final @Nullable AddressUse use;
  private final @Nullable List<Extension> extension;
  private final @Nullable String text;
  private final @Nullable String city;
  private final @Nullable String state;
  private final @Nullable String country;
  private final @Nullable String district;
  private final @Nullable List<String> line;
  private final @Nullable Period period;
  private final @Nullable String postalCode;
  private final @Nullable String id;

  private ImmutableAddress(
      @Nullable AddressType type,
      @Nullable AddressUse use,
      @Nullable List<Extension> extension,
      @Nullable String text,
      @Nullable String city,
      @Nullable String state,
      @Nullable String country,
      @Nullable String district,
      @Nullable List<String> line,
      @Nullable Period period,
      @Nullable String postalCode,
      @Nullable String id) {
    this.type = type;
    this.use = use;
    this.extension = extension;
    this.text = text;
    this.city = city;
    this.state = state;
    this.country = country;
    this.district = district;
    this.line = line;
    this.period = period;
    this.postalCode = postalCode;
    this.id = id;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<AddressType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @JsonProperty("use")
  @Override
  public Optional<AddressUse> use() {
    return Optional.ofNullable(use);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code city} attribute
   */
  @JsonProperty("city")
  @Override
  public Optional<String> city() {
    return Optional.ofNullable(city);
  }

  /**
   * @return The value of the {@code state} attribute
   */
  @JsonProperty("state")
  @Override
  public Optional<String> state() {
    return Optional.ofNullable(state);
  }

  /**
   * @return The value of the {@code country} attribute
   */
  @JsonProperty("country")
  @Override
  public Optional<String> country() {
    return Optional.ofNullable(country);
  }

  /**
   * @return The value of the {@code district} attribute
   */
  @JsonProperty("district")
  @Override
  public Optional<String> district() {
    return Optional.ofNullable(district);
  }

  /**
   * @return The value of the {@code line} attribute
   */
  @JsonProperty("line")
  @Override
  public Optional<List<String>> line() {
    return Optional.ofNullable(line);
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
   * @return The value of the {@code postalCode} attribute
   */
  @JsonProperty("postalCode")
  @Override
  public Optional<String> postalCode() {
    return Optional.ofNullable(postalCode);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Address#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withType(AddressType value) {
    @Nullable AddressType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableAddress(
        newValue,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Address#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAddress withType(Optional<? extends AddressType> optional) {
    @Nullable AddressType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableAddress(
        value,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Address#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withUse(AddressUse value) {
    @Nullable AddressUse newValue = Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableAddress(
        this.type,
        newValue,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Address#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAddress withUse(Optional<? extends AddressUse> optional) {
    @Nullable AddressUse value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableAddress(
        this.type,
        value,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Address#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        newValue,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Address#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAddress withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        value,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Address#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        newValue,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Address#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        value,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Address#city() city} attribute.
   * @param value The value for city
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withCity(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "city");
    if (Objects.equals(this.city, newValue)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        newValue,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Address#city() city} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for city
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withCity(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.city, value)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        value,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Address#state() state} attribute.
   * @param value The value for state
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withState(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "state");
    if (Objects.equals(this.state, newValue)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        newValue,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Address#state() state} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for state
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withState(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.state, value)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        value,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Address#country() country} attribute.
   * @param value The value for country
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withCountry(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "country");
    if (Objects.equals(this.country, newValue)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        newValue,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Address#country() country} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for country
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withCountry(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.country, value)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        value,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Address#district() district} attribute.
   * @param value The value for district
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withDistrict(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "district");
    if (Objects.equals(this.district, newValue)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        newValue,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Address#district() district} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for district
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withDistrict(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.district, value)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        value,
        this.line,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Address#line() line} attribute.
   * @param value The value for line
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withLine(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "line");
    if (this.line == newValue) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        newValue,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Address#line() line} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for line
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAddress withLine(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.line == value) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        value,
        this.period,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Address#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        newValue,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Address#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAddress withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        value,
        this.postalCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Address#postalCode() postalCode} attribute.
   * @param value The value for postalCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withPostalCode(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "postalCode");
    if (Objects.equals(this.postalCode, newValue)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Address#postalCode() postalCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for postalCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withPostalCode(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.postalCode, value)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Address#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Address#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAddress withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAddress(
        this.type,
        this.use,
        this.extension,
        this.text,
        this.city,
        this.state,
        this.country,
        this.district,
        this.line,
        this.period,
        this.postalCode,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAddress} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAddress
        && equalTo((ImmutableAddress) another);
  }

  private boolean equalTo(ImmutableAddress another) {
    return Objects.equals(type, another.type)
        && Objects.equals(use, another.use)
        && Objects.equals(extension, another.extension)
        && Objects.equals(text, another.text)
        && Objects.equals(city, another.city)
        && Objects.equals(state, another.state)
        && Objects.equals(country, another.country)
        && Objects.equals(district, another.district)
        && Objects.equals(line, another.line)
        && Objects.equals(period, another.period)
        && Objects.equals(postalCode, another.postalCode)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code use}, {@code extension}, {@code text}, {@code city}, {@code state}, {@code country}, {@code district}, {@code line}, {@code period}, {@code postalCode}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(use);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(city);
    h += (h << 5) + Objects.hashCode(state);
    h += (h << 5) + Objects.hashCode(country);
    h += (h << 5) + Objects.hashCode(district);
    h += (h << 5) + Objects.hashCode(line);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(postalCode);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Address} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Address{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (use != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (extension != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (city != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("city=").append(city);
    }
    if (state != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("state=").append(state);
    }
    if (country != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("country=").append(country);
    }
    if (district != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("district=").append(district);
    }
    if (line != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("line=").append(line);
    }
    if (period != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (postalCode != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("postalCode=").append(postalCode);
    }
    if (id != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Address", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Address {
    @Nullable Optional<AddressType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<AddressUse> use = Optional.empty();
    boolean useIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<String> city = Optional.empty();
    boolean cityIsSet;
    @Nullable Optional<String> state = Optional.empty();
    boolean stateIsSet;
    @Nullable Optional<String> country = Optional.empty();
    boolean countryIsSet;
    @Nullable Optional<String> district = Optional.empty();
    boolean districtIsSet;
    @Nullable Optional<List<String>> line = Optional.empty();
    boolean lineIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<String> postalCode = Optional.empty();
    boolean postalCodeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("type")
    public void setType(Optional<AddressType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("use")
    public void setUse(Optional<AddressUse> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("city")
    public void setCity(Optional<String> city) {
      this.city = city;
      this.cityIsSet = true;
    }
    @JsonProperty("state")
    public void setState(Optional<String> state) {
      this.state = state;
      this.stateIsSet = true;
    }
    @JsonProperty("country")
    public void setCountry(Optional<String> country) {
      this.country = country;
      this.countryIsSet = true;
    }
    @JsonProperty("district")
    public void setDistrict(Optional<String> district) {
      this.district = district;
      this.districtIsSet = true;
    }
    @JsonProperty("line")
    public void setLine(Optional<List<String>> line) {
      this.line = line;
      this.lineIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("postalCode")
    public void setPostalCode(Optional<String> postalCode) {
      this.postalCode = postalCode;
      this.postalCodeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<AddressType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<AddressUse> use() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> city() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> state() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> country() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> district() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> line() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> postalCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAddress fromJson(Json json) {
    ImmutableAddress.Builder builder = ImmutableAddress.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.cityIsSet) {
      builder.city(json.city);
    }
    if (json.stateIsSet) {
      builder.state(json.state);
    }
    if (json.countryIsSet) {
      builder.country(json.country);
    }
    if (json.districtIsSet) {
      builder.district(json.district);
    }
    if (json.lineIsSet) {
      builder.line(json.line);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.postalCodeIsSet) {
      builder.postalCode(json.postalCode);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableAddress) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Address} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Address instance
   */
  public static Address copyOf(Address instance) {
    if (instance instanceof ImmutableAddress) {
      return (ImmutableAddress) instance;
    }
    return ImmutableAddress.builder()
        .type(instance.type())
        .use(instance.use())
        .extension(instance.extension())
        .text(instance.text())
        .city(instance.city())
        .state(instance.state())
        .country(instance.country())
        .district(instance.district())
        .line(instance.line())
        .period(instance.period())
        .postalCode(instance.postalCode())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Address Address}.
   * <pre>
   * ImmutableAddress.builder()
   *    .type(com.fhir.AddressType) // optional {@link Address#type() type}
   *    .use(com.fhir.AddressUse) // optional {@link Address#use() use}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Address#extension() extension}
   *    .text(String) // optional {@link Address#text() text}
   *    .city(String) // optional {@link Address#city() city}
   *    .state(String) // optional {@link Address#state() state}
   *    .country(String) // optional {@link Address#country() country}
   *    .district(String) // optional {@link Address#district() district}
   *    .line(List&amp;lt;String&amp;gt;) // optional {@link Address#line() line}
   *    .period(com.fhir.Period) // optional {@link Address#period() period}
   *    .postalCode(String) // optional {@link Address#postalCode() postalCode}
   *    .id(String) // optional {@link Address#id() id}
   *    .build();
   * </pre>
   * @return A new Address builder
   */
  public static ImmutableAddress.Builder builder() {
    return new ImmutableAddress.Builder();
  }

  /**
   * Builds instances of type {@link Address Address}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Address", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_USE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_TEXT = 0x8L;
    private static final long OPT_BIT_CITY = 0x10L;
    private static final long OPT_BIT_STATE = 0x20L;
    private static final long OPT_BIT_COUNTRY = 0x40L;
    private static final long OPT_BIT_DISTRICT = 0x80L;
    private static final long OPT_BIT_LINE = 0x100L;
    private static final long OPT_BIT_PERIOD = 0x200L;
    private static final long OPT_BIT_POSTAL_CODE = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private long optBits;

    private @Nullable AddressType type;
    private @Nullable AddressUse use;
    private @Nullable List<Extension> extension;
    private @Nullable String text;
    private @Nullable String city;
    private @Nullable String state;
    private @Nullable String country;
    private @Nullable String district;
    private @Nullable List<String> line;
    private @Nullable Period period;
    private @Nullable String postalCode;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Address#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(AddressType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends AddressType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(AddressUse use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("use")
    public final Builder use(Optional<? extends AddressUse> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#extension() extension} to extension.
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
     * Initializes the optional value {@link Address#extension() extension} to extension.
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
     * Initializes the optional value {@link Address#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(String text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<String> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#city() city} to city.
     * @param city The value for city
     * @return {@code this} builder for chained invocation
     */
    public final Builder city(String city) {
      checkNotIsSet(cityIsSet(), "city");
      this.city = Objects.requireNonNull(city, "city");
      optBits |= OPT_BIT_CITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#city() city} to city.
     * @param city The value for city
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("city")
    public final Builder city(Optional<String> city) {
      checkNotIsSet(cityIsSet(), "city");
      this.city = city.orElse(null);
      optBits |= OPT_BIT_CITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#state() state} to state.
     * @param state The value for state
     * @return {@code this} builder for chained invocation
     */
    public final Builder state(String state) {
      checkNotIsSet(stateIsSet(), "state");
      this.state = Objects.requireNonNull(state, "state");
      optBits |= OPT_BIT_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#state() state} to state.
     * @param state The value for state
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("state")
    public final Builder state(Optional<String> state) {
      checkNotIsSet(stateIsSet(), "state");
      this.state = state.orElse(null);
      optBits |= OPT_BIT_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for chained invocation
     */
    public final Builder country(String country) {
      checkNotIsSet(countryIsSet(), "country");
      this.country = Objects.requireNonNull(country, "country");
      optBits |= OPT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("country")
    public final Builder country(Optional<String> country) {
      checkNotIsSet(countryIsSet(), "country");
      this.country = country.orElse(null);
      optBits |= OPT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#district() district} to district.
     * @param district The value for district
     * @return {@code this} builder for chained invocation
     */
    public final Builder district(String district) {
      checkNotIsSet(districtIsSet(), "district");
      this.district = Objects.requireNonNull(district, "district");
      optBits |= OPT_BIT_DISTRICT;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#district() district} to district.
     * @param district The value for district
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("district")
    public final Builder district(Optional<String> district) {
      checkNotIsSet(districtIsSet(), "district");
      this.district = district.orElse(null);
      optBits |= OPT_BIT_DISTRICT;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#line() line} to line.
     * @param line The value for line
     * @return {@code this} builder for chained invocation
     */
    public final Builder line(List<String> line) {
      checkNotIsSet(lineIsSet(), "line");
      this.line = Objects.requireNonNull(line, "line");
      optBits |= OPT_BIT_LINE;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#line() line} to line.
     * @param line The value for line
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("line")
    public final Builder line(Optional<? extends List<String>> line) {
      checkNotIsSet(lineIsSet(), "line");
      this.line = line.orElse(null);
      optBits |= OPT_BIT_LINE;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#period() period} to period.
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
     * Initializes the optional value {@link Address#period() period} to period.
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
     * Initializes the optional value {@link Address#postalCode() postalCode} to postalCode.
     * @param postalCode The value for postalCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder postalCode(String postalCode) {
      checkNotIsSet(postalCodeIsSet(), "postalCode");
      this.postalCode = Objects.requireNonNull(postalCode, "postalCode");
      optBits |= OPT_BIT_POSTAL_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#postalCode() postalCode} to postalCode.
     * @param postalCode The value for postalCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("postalCode")
    public final Builder postalCode(Optional<String> postalCode) {
      checkNotIsSet(postalCodeIsSet(), "postalCode");
      this.postalCode = postalCode.orElse(null);
      optBits |= OPT_BIT_POSTAL_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Address#id() id} to id.
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
     * Initializes the optional value {@link Address#id() id} to id.
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
     * Builds a new {@link Address Address}.
     * @return An immutable instance of Address
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Address build() {
      return new ImmutableAddress(type, use, extension, text, city, state, country, district, line, period, postalCode, id);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean cityIsSet() {
      return (optBits & OPT_BIT_CITY) != 0;
    }

    private boolean stateIsSet() {
      return (optBits & OPT_BIT_STATE) != 0;
    }

    private boolean countryIsSet() {
      return (optBits & OPT_BIT_COUNTRY) != 0;
    }

    private boolean districtIsSet() {
      return (optBits & OPT_BIT_DISTRICT) != 0;
    }

    private boolean lineIsSet() {
      return (optBits & OPT_BIT_LINE) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean postalCodeIsSet() {
      return (optBits & OPT_BIT_POSTAL_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Address is strict, attribute is already set: ".concat(name));
    }
  }
}

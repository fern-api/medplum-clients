package com.medplum.types.fhir;

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
 * Immutable implementation of {@link Encounter_ClassHistory}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEncounter_ClassHistory.builder()}.
 */
@Generated(from = "Encounter_ClassHistory", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEncounter_ClassHistory implements Encounter_ClassHistory {
  private final @Nullable List<Extension> extension;
  private final Period period;
  private final Coding _class;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableEncounter_ClassHistory(
      @Nullable List<Extension> extension,
      Period period,
      Coding _class,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension) {
    this.extension = extension;
    this.period = period;
    this._class = _class;
    this.id = id;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Period period() {
    return period;
  }

  /**
   * @return The value of the {@code _class} attribute
   */
  @JsonProperty("class")
  @Override
  public Coding _class() {
    return _class;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_ClassHistory#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_ClassHistory withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEncounter_ClassHistory(newValue, this.period, this._class, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_ClassHistory#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_ClassHistory withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEncounter_ClassHistory(value, this.period, this._class, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Encounter_ClassHistory#period() period} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for period
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEncounter_ClassHistory withPeriod(Period value) {
    if (this.period == value) return this;
    Period newValue = Objects.requireNonNull(value, "period");
    return new ImmutableEncounter_ClassHistory(this.extension, newValue, this._class, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Encounter_ClassHistory#_class() _class} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for _class
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEncounter_ClassHistory with_class(Coding value) {
    if (this._class == value) return this;
    Coding newValue = Objects.requireNonNull(value, "_class");
    return new ImmutableEncounter_ClassHistory(this.extension, this.period, newValue, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_ClassHistory#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_ClassHistory withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEncounter_ClassHistory(this.extension, this.period, this._class, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_ClassHistory#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_ClassHistory withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEncounter_ClassHistory(this.extension, this.period, this._class, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_ClassHistory#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_ClassHistory withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEncounter_ClassHistory(this.extension, this.period, this._class, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_ClassHistory#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_ClassHistory withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEncounter_ClassHistory(this.extension, this.period, this._class, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEncounter_ClassHistory} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEncounter_ClassHistory
        && equalTo((ImmutableEncounter_ClassHistory) another);
  }

  private boolean equalTo(ImmutableEncounter_ClassHistory another) {
    return Objects.equals(extension, another.extension)
        && period.equals(another.period)
        && _class.equals(another._class)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code period}, {@code _class}, {@code id}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + period.hashCode();
    h += (h << 5) + _class.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Encounter_ClassHistory} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Encounter_ClassHistory{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 23) builder.append(", ");
    builder.append("period=").append(period);
    builder.append(", ");
    builder.append("_class=").append(_class);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Encounter_ClassHistory", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Encounter_ClassHistory {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Period period;
    @Nullable Coding _class;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Period period) {
      this.period = period;
    }
    @JsonProperty("class")
    public void set_class(Coding _class) {
      this._class = _class;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Period period() { throw new UnsupportedOperationException(); }
    @Override
    public Coding _class() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEncounter_ClassHistory fromJson(Json json) {
    ImmutableEncounter_ClassHistory.Builder builder = ((ImmutableEncounter_ClassHistory.Builder) ImmutableEncounter_ClassHistory.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.period != null) {
      builder.period(json.period);
    }
    if (json._class != null) {
      builder._class(json._class);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableEncounter_ClassHistory) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Encounter_ClassHistory} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Encounter_ClassHistory instance
   */
  public static Encounter_ClassHistory copyOf(Encounter_ClassHistory instance) {
    if (instance instanceof ImmutableEncounter_ClassHistory) {
      return (ImmutableEncounter_ClassHistory) instance;
    }
    return ((ImmutableEncounter_ClassHistory.Builder) ImmutableEncounter_ClassHistory.builder())
        .extension(instance.extension())
        .period(instance.period())
        ._class(instance._class())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Encounter_ClassHistory Encounter_ClassHistory}.
   * <pre>
   * ImmutableEncounter_ClassHistory.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Encounter_ClassHistory#extension() extension}
   *    .period(com.medplum.types.fhir.Period) // required {@link Encounter_ClassHistory#period() period}
   *    ._class(com.medplum.types.fhir.Coding) // required {@link Encounter_ClassHistory#_class() _class}
   *    .id(String) // optional {@link Encounter_ClassHistory#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Encounter_ClassHistory#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Encounter_ClassHistory builder
   */
  public static PeriodBuildStage builder() {
    return new ImmutableEncounter_ClassHistory.Builder();
  }

  /**
   * Builds instances of type {@link Encounter_ClassHistory Encounter_ClassHistory}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Encounter_ClassHistory", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements PeriodBuildStage, _classBuildStage, BuildFinal {
    private static final long INIT_BIT_PERIOD = 0x1L;
    private static final long INIT_BIT__CLASS = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Period period;
    private @Nullable Coding _class;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Encounter_ClassHistory#extension() extension} to extension.
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
     * Initializes the optional value {@link Encounter_ClassHistory#extension() extension} to extension.
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
     * Initializes the value for the {@link Encounter_ClassHistory#period() period} attribute.
     * @param period The value for period 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      initBits &= ~INIT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the value for the {@link Encounter_ClassHistory#_class() _class} attribute.
     * @param _class The value for _class 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("class")
    public final Builder _class(Coding _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = Objects.requireNonNull(_class, "_class");
      initBits &= ~INIT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_ClassHistory#id() id} to id.
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
     * Initializes the optional value {@link Encounter_ClassHistory#id() id} to id.
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
     * Initializes the optional value {@link Encounter_ClassHistory#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter_ClassHistory#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Encounter_ClassHistory Encounter_ClassHistory}.
     * @return An immutable instance of Encounter_ClassHistory
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Encounter_ClassHistory build() {
      checkRequiredAttributes();
      return new ImmutableEncounter_ClassHistory(extension, period, _class, id, modifierExtension);
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

    private boolean periodIsSet() {
      return (initBits & INIT_BIT_PERIOD) == 0;
    }

    private boolean _classIsSet() {
      return (initBits & INIT_BIT__CLASS) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Encounter_ClassHistory is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!periodIsSet()) attributes.add("period");
      if (!_classIsSet()) attributes.add("_class");
      return "Cannot build Encounter_ClassHistory, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Encounter_ClassHistory", generator = "Immutables")
  public interface PeriodBuildStage {
    /**
     * Initializes the value for the {@link Encounter_ClassHistory#period() period} attribute.
     * @param period The value for period 
     * @return {@code this} builder for use in a chained invocation
     */
    _classBuildStage period(Period period);
  }

  @Generated(from = "Encounter_ClassHistory", generator = "Immutables")
  public interface _classBuildStage {
    /**
     * Initializes the value for the {@link Encounter_ClassHistory#_class() _class} attribute.
     * @param _class The value for _class 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal _class(Coding _class);
  }

  @Generated(from = "Encounter_ClassHistory", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Encounter_ClassHistory#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Encounter_ClassHistory#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Encounter_ClassHistory#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Encounter_ClassHistory#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Encounter_ClassHistory#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Encounter_ClassHistory#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link Encounter_ClassHistory Encounter_ClassHistory}.
     * @return An immutable instance of Encounter_ClassHistory
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Encounter_ClassHistory build();
  }
}

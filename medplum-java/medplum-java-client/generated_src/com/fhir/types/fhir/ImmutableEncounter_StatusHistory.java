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
 * Immutable implementation of {@link Encounter_StatusHistory}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEncounter_StatusHistory.builder()}.
 */
@Generated(from = "Encounter_StatusHistory", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEncounter_StatusHistory implements Encounter_StatusHistory {
  private final @Nullable List<Extension> extension;
  private final Period period;
  private final @Nullable Encounter_StatushistoryStatus status;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;

  private ImmutableEncounter_StatusHistory(
      @Nullable List<Extension> extension,
      Period period,
      @Nullable Encounter_StatushistoryStatus status,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id) {
    this.extension = extension;
    this.period = period;
    this.status = status;
    this.modifierExtension = modifierExtension;
    this.id = id;
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Encounter_StatushistoryStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_StatusHistory#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_StatusHistory withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEncounter_StatusHistory(newValue, this.period, this.status, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_StatusHistory#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_StatusHistory withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEncounter_StatusHistory(value, this.period, this.status, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Encounter_StatusHistory#period() period} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for period
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEncounter_StatusHistory withPeriod(Period value) {
    if (this.period == value) return this;
    Period newValue = Objects.requireNonNull(value, "period");
    return new ImmutableEncounter_StatusHistory(this.extension, newValue, this.status, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_StatusHistory#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_StatusHistory withStatus(Encounter_StatushistoryStatus value) {
    @Nullable Encounter_StatushistoryStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEncounter_StatusHistory(this.extension, this.period, newValue, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_StatusHistory#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_StatusHistory withStatus(Optional<? extends Encounter_StatushistoryStatus> optional) {
    @Nullable Encounter_StatushistoryStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEncounter_StatusHistory(this.extension, this.period, value, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_StatusHistory#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_StatusHistory withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEncounter_StatusHistory(this.extension, this.period, this.status, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_StatusHistory#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_StatusHistory withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEncounter_StatusHistory(this.extension, this.period, this.status, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_StatusHistory#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_StatusHistory withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEncounter_StatusHistory(this.extension, this.period, this.status, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_StatusHistory#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_StatusHistory withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEncounter_StatusHistory(this.extension, this.period, this.status, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEncounter_StatusHistory} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEncounter_StatusHistory
        && equalTo((ImmutableEncounter_StatusHistory) another);
  }

  private boolean equalTo(ImmutableEncounter_StatusHistory another) {
    return Objects.equals(extension, another.extension)
        && period.equals(another.period)
        && Objects.equals(status, another.status)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code period}, {@code status}, {@code modifierExtension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + period.hashCode();
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Encounter_StatusHistory} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Encounter_StatusHistory{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 24) builder.append(", ");
    builder.append("period=").append(period);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
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
  @Generated(from = "Encounter_StatusHistory", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Encounter_StatusHistory {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Period period;
    @Nullable Optional<Encounter_StatushistoryStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Period period) {
      this.period = period;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Encounter_StatushistoryStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Period period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Encounter_StatushistoryStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
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
  static ImmutableEncounter_StatusHistory fromJson(Json json) {
    ImmutableEncounter_StatusHistory.Builder builder = ((ImmutableEncounter_StatusHistory.Builder) ImmutableEncounter_StatusHistory.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.period != null) {
      builder.period(json.period);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableEncounter_StatusHistory) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Encounter_StatusHistory} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Encounter_StatusHistory instance
   */
  public static Encounter_StatusHistory copyOf(Encounter_StatusHistory instance) {
    if (instance instanceof ImmutableEncounter_StatusHistory) {
      return (ImmutableEncounter_StatusHistory) instance;
    }
    return ((ImmutableEncounter_StatusHistory.Builder) ImmutableEncounter_StatusHistory.builder())
        .extension(instance.extension())
        .period(instance.period())
        .status(instance.status())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Encounter_StatusHistory Encounter_StatusHistory}.
   * <pre>
   * ImmutableEncounter_StatusHistory.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Encounter_StatusHistory#extension() extension}
   *    .period(com.fhir.types.fhir.Period) // required {@link Encounter_StatusHistory#period() period}
   *    .status(Encounter_StatushistoryStatus) // optional {@link Encounter_StatusHistory#status() status}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Encounter_StatusHistory#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link Encounter_StatusHistory#id() id}
   *    .build();
   * </pre>
   * @return A new Encounter_StatusHistory builder
   */
  public static PeriodBuildStage builder() {
    return new ImmutableEncounter_StatusHistory.Builder();
  }

  /**
   * Builds instances of type {@link Encounter_StatusHistory Encounter_StatusHistory}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Encounter_StatusHistory", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements PeriodBuildStage, BuildFinal {
    private static final long INIT_BIT_PERIOD = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_STATUS = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Period period;
    private @Nullable Encounter_StatushistoryStatus status;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Encounter_StatusHistory#extension() extension} to extension.
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
     * Initializes the optional value {@link Encounter_StatusHistory#extension() extension} to extension.
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
     * Initializes the value for the {@link Encounter_StatusHistory#period() period} attribute.
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
     * Initializes the optional value {@link Encounter_StatusHistory#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Encounter_StatushistoryStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_StatusHistory#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Encounter_StatushistoryStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_StatusHistory#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter_StatusHistory#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter_StatusHistory#id() id} to id.
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
     * Initializes the optional value {@link Encounter_StatusHistory#id() id} to id.
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
     * Builds a new {@link Encounter_StatusHistory Encounter_StatusHistory}.
     * @return An immutable instance of Encounter_StatusHistory
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Encounter_StatusHistory build() {
      checkRequiredAttributes();
      return new ImmutableEncounter_StatusHistory(extension, period, status, modifierExtension, id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean periodIsSet() {
      return (initBits & INIT_BIT_PERIOD) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Encounter_StatusHistory is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!periodIsSet()) attributes.add("period");
      return "Cannot build Encounter_StatusHistory, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Encounter_StatusHistory", generator = "Immutables")
  public interface PeriodBuildStage {
    /**
     * Initializes the value for the {@link Encounter_StatusHistory#period() period} attribute.
     * @param period The value for period 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Period period);
  }

  @Generated(from = "Encounter_StatusHistory", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Encounter_StatusHistory#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Encounter_StatusHistory#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Encounter_StatusHistory#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Encounter_StatushistoryStatus status);

    /**
     * Initializes the optional value {@link Encounter_StatusHistory#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Encounter_StatushistoryStatus> status);

    /**
     * Initializes the optional value {@link Encounter_StatusHistory#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Encounter_StatusHistory#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Encounter_StatusHistory#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Encounter_StatusHistory#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link Encounter_StatusHistory Encounter_StatusHistory}.
     * @return An immutable instance of Encounter_StatusHistory
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Encounter_StatusHistory build();
  }
}

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
 * Immutable implementation of {@link Account_Guarantor}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccount_Guarantor.builder()}.
 */
@Generated(from = "Account_Guarantor", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAccount_Guarantor implements Account_Guarantor {
  private final @Nullable List<Extension> modifierExtension;
  private final Reference party;
  private final @Nullable Period period;
  private final @Nullable String id;
  private final @Nullable Boolean onHold;
  private final @Nullable List<Extension> extension;

  private ImmutableAccount_Guarantor(
      @Nullable List<Extension> modifierExtension,
      Reference party,
      @Nullable Period period,
      @Nullable String id,
      @Nullable Boolean onHold,
      @Nullable List<Extension> extension) {
    this.modifierExtension = modifierExtension;
    this.party = party;
    this.period = period;
    this.id = id;
    this.onHold = onHold;
    this.extension = extension;
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
   * @return The value of the {@code party} attribute
   */
  @JsonProperty("party")
  @Override
  public Reference party() {
    return party;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code onHold} attribute
   */
  @JsonProperty("onHold")
  @Override
  public Optional<Boolean> onHold() {
    return Optional.ofNullable(onHold);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account_Guarantor#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount_Guarantor withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAccount_Guarantor(newValue, this.party, this.period, this.id, this.onHold, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account_Guarantor#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount_Guarantor withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAccount_Guarantor(value, this.party, this.period, this.id, this.onHold, this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Account_Guarantor#party() party} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for party
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccount_Guarantor withParty(Reference value) {
    if (this.party == value) return this;
    Reference newValue = Objects.requireNonNull(value, "party");
    return new ImmutableAccount_Guarantor(this.modifierExtension, newValue, this.period, this.id, this.onHold, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account_Guarantor#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount_Guarantor withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableAccount_Guarantor(this.modifierExtension, this.party, newValue, this.id, this.onHold, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account_Guarantor#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount_Guarantor withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableAccount_Guarantor(this.modifierExtension, this.party, value, this.id, this.onHold, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account_Guarantor#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount_Guarantor withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAccount_Guarantor(this.modifierExtension, this.party, this.period, newValue, this.onHold, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account_Guarantor#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount_Guarantor withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAccount_Guarantor(this.modifierExtension, this.party, this.period, value, this.onHold, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account_Guarantor#onHold() onHold} attribute.
   * @param value The value for onHold
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount_Guarantor withOnHold(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.onHold, newValue)) return this;
    return new ImmutableAccount_Guarantor(this.modifierExtension, this.party, this.period, this.id, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account_Guarantor#onHold() onHold} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onHold
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount_Guarantor withOnHold(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.onHold, value)) return this;
    return new ImmutableAccount_Guarantor(this.modifierExtension, this.party, this.period, this.id, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account_Guarantor#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount_Guarantor withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAccount_Guarantor(this.modifierExtension, this.party, this.period, this.id, this.onHold, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account_Guarantor#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount_Guarantor withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAccount_Guarantor(this.modifierExtension, this.party, this.period, this.id, this.onHold, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAccount_Guarantor} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAccount_Guarantor
        && equalTo((ImmutableAccount_Guarantor) another);
  }

  private boolean equalTo(ImmutableAccount_Guarantor another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && party.equals(another.party)
        && Objects.equals(period, another.period)
        && Objects.equals(id, another.id)
        && Objects.equals(onHold, another.onHold)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code party}, {@code period}, {@code id}, {@code onHold}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + party.hashCode();
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(onHold);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Account_Guarantor} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Account_Guarantor{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("party=").append(party);
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (onHold != null) {
      builder.append(", ");
      builder.append("onHold=").append(onHold);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Account_Guarantor", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Account_Guarantor {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Reference party;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Boolean> onHold = Optional.empty();
    boolean onHoldIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("party")
    public void setParty(Reference party) {
      this.party = party;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("onHold")
    public void setOnHold(Optional<Boolean> onHold) {
      this.onHold = onHold;
      this.onHoldIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference party() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> onHold() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAccount_Guarantor fromJson(Json json) {
    ImmutableAccount_Guarantor.Builder builder = ((ImmutableAccount_Guarantor.Builder) ImmutableAccount_Guarantor.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.party != null) {
      builder.party(json.party);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.onHoldIsSet) {
      builder.onHold(json.onHold);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableAccount_Guarantor) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Account_Guarantor} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Account_Guarantor instance
   */
  public static Account_Guarantor copyOf(Account_Guarantor instance) {
    if (instance instanceof ImmutableAccount_Guarantor) {
      return (ImmutableAccount_Guarantor) instance;
    }
    return ((ImmutableAccount_Guarantor.Builder) ImmutableAccount_Guarantor.builder())
        .modifierExtension(instance.modifierExtension())
        .party(instance.party())
        .period(instance.period())
        .id(instance.id())
        .onHold(instance.onHold())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Account_Guarantor Account_Guarantor}.
   * <pre>
   * ImmutableAccount_Guarantor.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Account_Guarantor#modifierExtension() modifierExtension}
   *    .party(com.fhir.types.fhir.Reference) // required {@link Account_Guarantor#party() party}
   *    .period(com.fhir.types.fhir.Period) // optional {@link Account_Guarantor#period() period}
   *    .id(String) // optional {@link Account_Guarantor#id() id}
   *    .onHold(Boolean) // optional {@link Account_Guarantor#onHold() onHold}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Account_Guarantor#extension() extension}
   *    .build();
   * </pre>
   * @return A new Account_Guarantor builder
   */
  public static PartyBuildStage builder() {
    return new ImmutableAccount_Guarantor.Builder();
  }

  /**
   * Builds instances of type {@link Account_Guarantor Account_Guarantor}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Account_Guarantor", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements PartyBuildStage, BuildFinal {
    private static final long INIT_BIT_PARTY = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_PERIOD = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_ON_HOLD = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference party;
    private @Nullable Period period;
    private @Nullable String id;
    private @Nullable Boolean onHold;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Account_Guarantor#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Account_Guarantor#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link Account_Guarantor#party() party} attribute.
     * @param party The value for party 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("party")
    public final Builder party(Reference party) {
      checkNotIsSet(partyIsSet(), "party");
      this.party = Objects.requireNonNull(party, "party");
      initBits &= ~INIT_BIT_PARTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Account_Guarantor#period() period} to period.
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
     * Initializes the optional value {@link Account_Guarantor#period() period} to period.
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
     * Initializes the optional value {@link Account_Guarantor#id() id} to id.
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
     * Initializes the optional value {@link Account_Guarantor#id() id} to id.
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
     * Initializes the optional value {@link Account_Guarantor#onHold() onHold} to onHold.
     * @param onHold The value for onHold
     * @return {@code this} builder for chained invocation
     */
    public final Builder onHold(boolean onHold) {
      checkNotIsSet(onHoldIsSet(), "onHold");
      this.onHold = onHold;
      optBits |= OPT_BIT_ON_HOLD;
      return this;
    }

    /**
     * Initializes the optional value {@link Account_Guarantor#onHold() onHold} to onHold.
     * @param onHold The value for onHold
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onHold")
    public final Builder onHold(Optional<Boolean> onHold) {
      checkNotIsSet(onHoldIsSet(), "onHold");
      this.onHold = onHold.orElse(null);
      optBits |= OPT_BIT_ON_HOLD;
      return this;
    }

    /**
     * Initializes the optional value {@link Account_Guarantor#extension() extension} to extension.
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
     * Initializes the optional value {@link Account_Guarantor#extension() extension} to extension.
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
     * Builds a new {@link Account_Guarantor Account_Guarantor}.
     * @return An immutable instance of Account_Guarantor
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Account_Guarantor build() {
      checkRequiredAttributes();
      return new ImmutableAccount_Guarantor(modifierExtension, party, period, id, onHold, extension);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean onHoldIsSet() {
      return (optBits & OPT_BIT_ON_HOLD) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean partyIsSet() {
      return (initBits & INIT_BIT_PARTY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Account_Guarantor is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!partyIsSet()) attributes.add("party");
      return "Cannot build Account_Guarantor, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Account_Guarantor", generator = "Immutables")
  public interface PartyBuildStage {
    /**
     * Initializes the value for the {@link Account_Guarantor#party() party} attribute.
     * @param party The value for party 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal party(Reference party);
  }

  @Generated(from = "Account_Guarantor", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Account_Guarantor#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Account_Guarantor#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Account_Guarantor#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link Account_Guarantor#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link Account_Guarantor#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Account_Guarantor#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Account_Guarantor#onHold() onHold} to onHold.
     * @param onHold The value for onHold
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onHold(boolean onHold);

    /**
     * Initializes the optional value {@link Account_Guarantor#onHold() onHold} to onHold.
     * @param onHold The value for onHold
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onHold(Optional<Boolean> onHold);

    /**
     * Initializes the optional value {@link Account_Guarantor#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Account_Guarantor#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link Account_Guarantor Account_Guarantor}.
     * @return An immutable instance of Account_Guarantor
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Account_Guarantor build();
  }
}

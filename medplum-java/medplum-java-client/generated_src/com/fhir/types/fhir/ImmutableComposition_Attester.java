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
 * Immutable implementation of {@link Composition_Attester}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableComposition_Attester.builder()}.
 */
@Generated(from = "Composition_Attester", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableComposition_Attester implements Composition_Attester {
  private final @Nullable Reference party;
  private final @Nullable DateTime time;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable Composition_AttesterMode mode;

  private ImmutableComposition_Attester(
      @Nullable Reference party,
      @Nullable DateTime time,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable Composition_AttesterMode mode) {
    this.party = party;
    this.time = time;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.mode = mode;
  }

  /**
   * @return The value of the {@code party} attribute
   */
  @JsonProperty("party")
  @Override
  public Optional<Reference> party() {
    return Optional.ofNullable(party);
  }

  /**
   * @return The value of the {@code time} attribute
   */
  @JsonProperty("time")
  @Override
  public Optional<DateTime> time() {
    return Optional.ofNullable(time);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code mode} attribute
   */
  @JsonProperty("mode")
  @Override
  public Optional<Composition_AttesterMode> mode() {
    return Optional.ofNullable(mode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Attester#party() party} attribute.
   * @param value The value for party
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Attester withParty(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "party");
    if (this.party == newValue) return this;
    return new ImmutableComposition_Attester(newValue, this.time, this.id, this.modifierExtension, this.extension, this.mode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Attester#party() party} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for party
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Attester withParty(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.party == value) return this;
    return new ImmutableComposition_Attester(value, this.time, this.id, this.modifierExtension, this.extension, this.mode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Attester#time() time} attribute.
   * @param value The value for time
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Attester withTime(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "time");
    if (this.time == newValue) return this;
    return new ImmutableComposition_Attester(this.party, newValue, this.id, this.modifierExtension, this.extension, this.mode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Attester#time() time} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for time
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Attester withTime(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.time == value) return this;
    return new ImmutableComposition_Attester(this.party, value, this.id, this.modifierExtension, this.extension, this.mode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Attester#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Attester withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableComposition_Attester(this.party, this.time, newValue, this.modifierExtension, this.extension, this.mode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Attester#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Attester withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableComposition_Attester(this.party, this.time, value, this.modifierExtension, this.extension, this.mode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Attester#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Attester withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableComposition_Attester(this.party, this.time, this.id, newValue, this.extension, this.mode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Attester#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Attester withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableComposition_Attester(this.party, this.time, this.id, value, this.extension, this.mode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Attester#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Attester withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableComposition_Attester(this.party, this.time, this.id, this.modifierExtension, newValue, this.mode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Attester#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Attester withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableComposition_Attester(this.party, this.time, this.id, this.modifierExtension, value, this.mode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Attester#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Attester withMode(Composition_AttesterMode value) {
    @Nullable Composition_AttesterMode newValue = Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableComposition_Attester(this.party, this.time, this.id, this.modifierExtension, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Attester#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Attester withMode(Optional<? extends Composition_AttesterMode> optional) {
    @Nullable Composition_AttesterMode value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableComposition_Attester(this.party, this.time, this.id, this.modifierExtension, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableComposition_Attester} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableComposition_Attester
        && equalTo((ImmutableComposition_Attester) another);
  }

  private boolean equalTo(ImmutableComposition_Attester another) {
    return Objects.equals(party, another.party)
        && Objects.equals(time, another.time)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(mode, another.mode);
  }

  /**
   * Computes a hash code from attributes: {@code party}, {@code time}, {@code id}, {@code modifierExtension}, {@code extension}, {@code mode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(party);
    h += (h << 5) + Objects.hashCode(time);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(mode);
    return h;
  }

  /**
   * Prints the immutable value {@code Composition_Attester} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Composition_Attester{");
    if (party != null) {
      builder.append("party=").append(party);
    }
    if (time != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("time=").append(time);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (mode != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("mode=").append(mode);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Composition_Attester", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Composition_Attester {
    @Nullable Optional<Reference> party = Optional.empty();
    boolean partyIsSet;
    @Nullable Optional<DateTime> time = Optional.empty();
    boolean timeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Composition_AttesterMode> mode = Optional.empty();
    boolean modeIsSet;
    @JsonProperty("party")
    public void setParty(Optional<Reference> party) {
      this.party = party;
      this.partyIsSet = true;
    }
    @JsonProperty("time")
    public void setTime(Optional<DateTime> time) {
      this.time = time;
      this.timeIsSet = true;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("mode")
    public void setMode(Optional<Composition_AttesterMode> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
    @Override
    public Optional<Reference> party() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> time() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Composition_AttesterMode> mode() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableComposition_Attester fromJson(Json json) {
    ImmutableComposition_Attester.Builder builder = ImmutableComposition_Attester.builder();
    if (json.partyIsSet) {
      builder.party(json.party);
    }
    if (json.timeIsSet) {
      builder.time(json.time);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    return (ImmutableComposition_Attester) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Composition_Attester} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Composition_Attester instance
   */
  public static Composition_Attester copyOf(Composition_Attester instance) {
    if (instance instanceof ImmutableComposition_Attester) {
      return (ImmutableComposition_Attester) instance;
    }
    return ImmutableComposition_Attester.builder()
        .party(instance.party())
        .time(instance.time())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .mode(instance.mode())
        .build();
  }

  /**
   * Creates a builder for {@link Composition_Attester Composition_Attester}.
   * <pre>
   * ImmutableComposition_Attester.builder()
   *    .party(com.fhir.types.fhir.Reference) // optional {@link Composition_Attester#party() party}
   *    .time(com.fhir.types.fhir.DateTime) // optional {@link Composition_Attester#time() time}
   *    .id(String) // optional {@link Composition_Attester#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Composition_Attester#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Composition_Attester#extension() extension}
   *    .mode(Composition_AttesterMode) // optional {@link Composition_Attester#mode() mode}
   *    .build();
   * </pre>
   * @return A new Composition_Attester builder
   */
  public static ImmutableComposition_Attester.Builder builder() {
    return new ImmutableComposition_Attester.Builder();
  }

  /**
   * Builds instances of type {@link Composition_Attester Composition_Attester}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Composition_Attester", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_PARTY = 0x1L;
    private static final long OPT_BIT_TIME = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MODE = 0x20L;
    private long optBits;

    private @Nullable Reference party;
    private @Nullable DateTime time;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable Composition_AttesterMode mode;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Composition_Attester#party() party} to party.
     * @param party The value for party
     * @return {@code this} builder for chained invocation
     */
    public final Builder party(Reference party) {
      checkNotIsSet(partyIsSet(), "party");
      this.party = Objects.requireNonNull(party, "party");
      optBits |= OPT_BIT_PARTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Attester#party() party} to party.
     * @param party The value for party
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("party")
    public final Builder party(Optional<? extends Reference> party) {
      checkNotIsSet(partyIsSet(), "party");
      this.party = party.orElse(null);
      optBits |= OPT_BIT_PARTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Attester#time() time} to time.
     * @param time The value for time
     * @return {@code this} builder for chained invocation
     */
    public final Builder time(DateTime time) {
      checkNotIsSet(timeIsSet(), "time");
      this.time = Objects.requireNonNull(time, "time");
      optBits |= OPT_BIT_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Attester#time() time} to time.
     * @param time The value for time
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("time")
    public final Builder time(Optional<? extends DateTime> time) {
      checkNotIsSet(timeIsSet(), "time");
      this.time = time.orElse(null);
      optBits |= OPT_BIT_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Attester#id() id} to id.
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
     * Initializes the optional value {@link Composition_Attester#id() id} to id.
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
     * Initializes the optional value {@link Composition_Attester#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition_Attester#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition_Attester#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition_Attester#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition_Attester#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(Composition_AttesterMode mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Attester#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mode")
    public final Builder mode(Optional<? extends Composition_AttesterMode> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Builds a new {@link Composition_Attester Composition_Attester}.
     * @return An immutable instance of Composition_Attester
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Composition_Attester build() {
      return new ImmutableComposition_Attester(party, time, id, modifierExtension, extension, mode);
    }

    private boolean partyIsSet() {
      return (optBits & OPT_BIT_PARTY) != 0;
    }

    private boolean timeIsSet() {
      return (optBits & OPT_BIT_TIME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Composition_Attester is strict, attribute is already set: ".concat(name));
    }
  }
}

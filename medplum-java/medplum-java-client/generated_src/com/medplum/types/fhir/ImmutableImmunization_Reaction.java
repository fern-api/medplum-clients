package com.medplum.types.fhir;

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
 * Immutable implementation of {@link Immunization_Reaction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImmunization_Reaction.builder()}.
 */
@Generated(from = "Immunization_Reaction", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImmunization_Reaction implements Immunization_Reaction {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference detail;
  private final @Nullable String id;
  private final @Nullable DateTime date;
  private final @Nullable Boolean reported;

  private ImmutableImmunization_Reaction(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable Reference detail,
      @Nullable String id,
      @Nullable DateTime date,
      @Nullable Boolean reported) {
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.detail = detail;
    this.id = id;
    this.date = date;
    this.reported = reported;
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
   * @return The value of the {@code detail} attribute
   */
  @JsonProperty("detail")
  @Override
  public Optional<Reference> detail() {
    return Optional.ofNullable(detail);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code reported} attribute
   */
  @JsonProperty("reported")
  @Override
  public Optional<Boolean> reported() {
    return Optional.ofNullable(reported);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Reaction#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Reaction withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImmunization_Reaction(newValue, this.extension, this.detail, this.id, this.date, this.reported);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Reaction#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Reaction withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImmunization_Reaction(value, this.extension, this.detail, this.id, this.date, this.reported);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Reaction#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Reaction withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImmunization_Reaction(this.modifierExtension, newValue, this.detail, this.id, this.date, this.reported);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Reaction#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Reaction withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImmunization_Reaction(this.modifierExtension, value, this.detail, this.id, this.date, this.reported);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Reaction#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Reaction withDetail(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableImmunization_Reaction(this.modifierExtension, this.extension, newValue, this.id, this.date, this.reported);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Reaction#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Reaction withDetail(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableImmunization_Reaction(this.modifierExtension, this.extension, value, this.id, this.date, this.reported);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Reaction#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Reaction withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImmunization_Reaction(this.modifierExtension, this.extension, this.detail, newValue, this.date, this.reported);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Reaction#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Reaction withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImmunization_Reaction(this.modifierExtension, this.extension, this.detail, value, this.date, this.reported);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Reaction#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Reaction withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableImmunization_Reaction(this.modifierExtension, this.extension, this.detail, this.id, newValue, this.reported);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Reaction#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Reaction withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableImmunization_Reaction(this.modifierExtension, this.extension, this.detail, this.id, value, this.reported);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Reaction#reported() reported} attribute.
   * @param value The value for reported
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Reaction withReported(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.reported, newValue)) return this;
    return new ImmutableImmunization_Reaction(this.modifierExtension, this.extension, this.detail, this.id, this.date, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Reaction#reported() reported} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reported
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Reaction withReported(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.reported, value)) return this;
    return new ImmutableImmunization_Reaction(this.modifierExtension, this.extension, this.detail, this.id, this.date, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImmunization_Reaction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImmunization_Reaction
        && equalTo((ImmutableImmunization_Reaction) another);
  }

  private boolean equalTo(ImmutableImmunization_Reaction another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(detail, another.detail)
        && Objects.equals(id, another.id)
        && Objects.equals(date, another.date)
        && Objects.equals(reported, another.reported);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code extension}, {@code detail}, {@code id}, {@code date}, {@code reported}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(detail);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(reported);
    return h;
  }

  /**
   * Prints the immutable value {@code Immunization_Reaction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Immunization_Reaction{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (detail != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("detail=").append(detail);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (date != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (reported != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("reported=").append(reported);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Immunization_Reaction", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Immunization_Reaction {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> detail = Optional.empty();
    boolean detailIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Boolean> reported = Optional.empty();
    boolean reportedIsSet;
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
    @JsonProperty("detail")
    public void setDetail(Optional<Reference> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("reported")
    public void setReported(Optional<Boolean> reported) {
      this.reported = reported;
      this.reportedIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> detail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> reported() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImmunization_Reaction fromJson(Json json) {
    ImmutableImmunization_Reaction.Builder builder = ImmutableImmunization_Reaction.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.reportedIsSet) {
      builder.reported(json.reported);
    }
    return (ImmutableImmunization_Reaction) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Immunization_Reaction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Immunization_Reaction instance
   */
  public static Immunization_Reaction copyOf(Immunization_Reaction instance) {
    if (instance instanceof ImmutableImmunization_Reaction) {
      return (ImmutableImmunization_Reaction) instance;
    }
    return ImmutableImmunization_Reaction.builder()
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .detail(instance.detail())
        .id(instance.id())
        .date(instance.date())
        .reported(instance.reported())
        .build();
  }

  /**
   * Creates a builder for {@link Immunization_Reaction Immunization_Reaction}.
   * <pre>
   * ImmutableImmunization_Reaction.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Immunization_Reaction#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Immunization_Reaction#extension() extension}
   *    .detail(com.medplum.types.fhir.Reference) // optional {@link Immunization_Reaction#detail() detail}
   *    .id(String) // optional {@link Immunization_Reaction#id() id}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link Immunization_Reaction#date() date}
   *    .reported(Boolean) // optional {@link Immunization_Reaction#reported() reported}
   *    .build();
   * </pre>
   * @return A new Immunization_Reaction builder
   */
  public static ImmutableImmunization_Reaction.Builder builder() {
    return new ImmutableImmunization_Reaction.Builder();
  }

  /**
   * Builds instances of type {@link Immunization_Reaction Immunization_Reaction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Immunization_Reaction", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_DETAIL = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_DATE = 0x10L;
    private static final long OPT_BIT_REPORTED = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable Reference detail;
    private @Nullable String id;
    private @Nullable DateTime date;
    private @Nullable Boolean reported;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Immunization_Reaction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Immunization_Reaction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Immunization_Reaction#extension() extension} to extension.
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
     * Initializes the optional value {@link Immunization_Reaction#extension() extension} to extension.
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
     * Initializes the optional value {@link Immunization_Reaction#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(Reference detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Reaction#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detail")
    public final Builder detail(Optional<? extends Reference> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Reaction#id() id} to id.
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
     * Initializes the optional value {@link Immunization_Reaction#id() id} to id.
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
     * Initializes the optional value {@link Immunization_Reaction#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(DateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Reaction#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends DateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Reaction#reported() reported} to reported.
     * @param reported The value for reported
     * @return {@code this} builder for chained invocation
     */
    public final Builder reported(boolean reported) {
      checkNotIsSet(reportedIsSet(), "reported");
      this.reported = reported;
      optBits |= OPT_BIT_REPORTED;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Reaction#reported() reported} to reported.
     * @param reported The value for reported
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reported")
    public final Builder reported(Optional<Boolean> reported) {
      checkNotIsSet(reportedIsSet(), "reported");
      this.reported = reported.orElse(null);
      optBits |= OPT_BIT_REPORTED;
      return this;
    }

    /**
     * Builds a new {@link Immunization_Reaction Immunization_Reaction}.
     * @return An immutable instance of Immunization_Reaction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Immunization_Reaction build() {
      return new ImmutableImmunization_Reaction(modifierExtension, extension, detail, id, date, reported);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean reportedIsSet() {
      return (optBits & OPT_BIT_REPORTED) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Immunization_Reaction is strict, attribute is already set: ".concat(name));
    }
  }
}

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
 * Immutable implementation of {@link SubstanceSpecification_Official}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSpecification_Official.builder()}.
 */
@Generated(from = "SubstanceSpecification_Official", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSpecification_Official
    implements SubstanceSpecification_Official {
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable DateTime date;
  private final @Nullable CodeableConcept status;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept authority;

  private ImmutableSubstanceSpecification_Official(
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable DateTime date,
      @Nullable CodeableConcept status,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept authority) {
    this.extension = extension;
    this.id = id;
    this.date = date;
    this.status = status;
    this.modifierExtension = modifierExtension;
    this.authority = authority;
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<CodeableConcept> status() {
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
   * @return The value of the {@code authority} attribute
   */
  @JsonProperty("authority")
  @Override
  public Optional<CodeableConcept> authority() {
    return Optional.ofNullable(authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Official#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Official withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSpecification_Official(newValue, this.id, this.date, this.status, this.modifierExtension, this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Official#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Official withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSpecification_Official(value, this.id, this.date, this.status, this.modifierExtension, this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Official#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Official withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSpecification_Official(this.extension, newValue, this.date, this.status, this.modifierExtension, this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Official#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Official withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSpecification_Official(this.extension, value, this.date, this.status, this.modifierExtension, this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Official#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Official withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableSubstanceSpecification_Official(this.extension, this.id, newValue, this.status, this.modifierExtension, this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Official#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Official withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableSubstanceSpecification_Official(this.extension, this.id, value, this.status, this.modifierExtension, this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Official#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Official withStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSubstanceSpecification_Official(this.extension, this.id, this.date, newValue, this.modifierExtension, this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Official#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Official withStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSubstanceSpecification_Official(this.extension, this.id, this.date, value, this.modifierExtension, this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Official#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Official withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSpecification_Official(this.extension, this.id, this.date, this.status, newValue, this.authority);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Official#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Official withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSpecification_Official(this.extension, this.id, this.date, this.status, value, this.authority);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Official#authority() authority} attribute.
   * @param value The value for authority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Official withAuthority(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "authority");
    if (this.authority == newValue) return this;
    return new ImmutableSubstanceSpecification_Official(this.extension, this.id, this.date, this.status, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Official#authority() authority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Official withAuthority(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.authority == value) return this;
    return new ImmutableSubstanceSpecification_Official(this.extension, this.id, this.date, this.status, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSpecification_Official} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSpecification_Official
        && equalTo((ImmutableSubstanceSpecification_Official) another);
  }

  private boolean equalTo(ImmutableSubstanceSpecification_Official another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(date, another.date)
        && Objects.equals(status, another.status)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(authority, another.authority);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code id}, {@code date}, {@code status}, {@code modifierExtension}, {@code authority}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(authority);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSpecification_Official} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSpecification_Official{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (date != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (status != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (modifierExtension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (authority != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("authority=").append(authority);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSpecification_Official", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSpecification_Official {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<CodeableConcept> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> authority = Optional.empty();
    boolean authorityIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("status")
    public void setStatus(Optional<CodeableConcept> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("authority")
    public void setAuthority(Optional<CodeableConcept> authority) {
      this.authority = authority;
      this.authorityIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> authority() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSpecification_Official fromJson(Json json) {
    ImmutableSubstanceSpecification_Official.Builder builder = ImmutableSubstanceSpecification_Official.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.authorityIsSet) {
      builder.authority(json.authority);
    }
    return (ImmutableSubstanceSpecification_Official) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSpecification_Official} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSpecification_Official instance
   */
  public static SubstanceSpecification_Official copyOf(SubstanceSpecification_Official instance) {
    if (instance instanceof ImmutableSubstanceSpecification_Official) {
      return (ImmutableSubstanceSpecification_Official) instance;
    }
    return ImmutableSubstanceSpecification_Official.builder()
        .extension(instance.extension())
        .id(instance.id())
        .date(instance.date())
        .status(instance.status())
        .modifierExtension(instance.modifierExtension())
        .authority(instance.authority())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSpecification_Official SubstanceSpecification_Official}.
   * <pre>
   * ImmutableSubstanceSpecification_Official.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Official#extension() extension}
   *    .id(String) // optional {@link SubstanceSpecification_Official#id() id}
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link SubstanceSpecification_Official#date() date}
   *    .status(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Official#status() status}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Official#modifierExtension() modifierExtension}
   *    .authority(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Official#authority() authority}
   *    .build();
   * </pre>
   * @return A new SubstanceSpecification_Official builder
   */
  public static ImmutableSubstanceSpecification_Official.Builder builder() {
    return new ImmutableSubstanceSpecification_Official.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSpecification_Official SubstanceSpecification_Official}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSpecification_Official", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_DATE = 0x4L;
    private static final long OPT_BIT_STATUS = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_AUTHORITY = 0x20L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable DateTime date;
    private @Nullable CodeableConcept status;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept authority;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Official#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Official#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Official#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Official#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Official#date() date} to date.
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
     * Initializes the optional value {@link SubstanceSpecification_Official#date() date} to date.
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
     * Initializes the optional value {@link SubstanceSpecification_Official#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(CodeableConcept status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Official#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends CodeableConcept> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Official#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Official#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Official#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for chained invocation
     */
    public final Builder authority(CodeableConcept authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = Objects.requireNonNull(authority, "authority");
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Official#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authority")
    public final Builder authority(Optional<? extends CodeableConcept> authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = authority.orElse(null);
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSpecification_Official SubstanceSpecification_Official}.
     * @return An immutable instance of SubstanceSpecification_Official
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSpecification_Official build() {
      return new ImmutableSubstanceSpecification_Official(extension, id, date, status, modifierExtension, authority);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean authorityIsSet() {
      return (optBits & OPT_BIT_AUTHORITY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSpecification_Official is strict, attribute is already set: ".concat(name));
    }
  }
}

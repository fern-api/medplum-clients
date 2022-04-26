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
 * Immutable implementation of {@link Medication_Batch}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedication_Batch.builder()}.
 */
@Generated(from = "Medication_Batch", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedication_Batch implements Medication_Batch {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable DateTime expirationDate;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable String lotNumber;

  private ImmutableMedication_Batch(
      @Nullable List<Extension> modifierExtension,
      @Nullable DateTime expirationDate,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable String lotNumber) {
    this.modifierExtension = modifierExtension;
    this.expirationDate = expirationDate;
    this.id = id;
    this.extension = extension;
    this.lotNumber = lotNumber;
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
   * @return The value of the {@code expirationDate} attribute
   */
  @JsonProperty("expirationDate")
  @Override
  public Optional<DateTime> expirationDate() {
    return Optional.ofNullable(expirationDate);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code lotNumber} attribute
   */
  @JsonProperty("lotNumber")
  @Override
  public Optional<String> lotNumber() {
    return Optional.ofNullable(lotNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication_Batch#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Batch withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedication_Batch(newValue, this.expirationDate, this.id, this.extension, this.lotNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication_Batch#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication_Batch withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedication_Batch(value, this.expirationDate, this.id, this.extension, this.lotNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication_Batch#expirationDate() expirationDate} attribute.
   * @param value The value for expirationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Batch withExpirationDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "expirationDate");
    if (this.expirationDate == newValue) return this;
    return new ImmutableMedication_Batch(this.modifierExtension, newValue, this.id, this.extension, this.lotNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication_Batch#expirationDate() expirationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expirationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication_Batch withExpirationDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.expirationDate == value) return this;
    return new ImmutableMedication_Batch(this.modifierExtension, value, this.id, this.extension, this.lotNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication_Batch#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Batch withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedication_Batch(this.modifierExtension, this.expirationDate, newValue, this.extension, this.lotNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication_Batch#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Batch withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedication_Batch(this.modifierExtension, this.expirationDate, value, this.extension, this.lotNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication_Batch#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Batch withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedication_Batch(this.modifierExtension, this.expirationDate, this.id, newValue, this.lotNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication_Batch#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication_Batch withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedication_Batch(this.modifierExtension, this.expirationDate, this.id, value, this.lotNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication_Batch#lotNumber() lotNumber} attribute.
   * @param value The value for lotNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Batch withLotNumber(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "lotNumber");
    if (Objects.equals(this.lotNumber, newValue)) return this;
    return new ImmutableMedication_Batch(this.modifierExtension, this.expirationDate, this.id, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication_Batch#lotNumber() lotNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lotNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Batch withLotNumber(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.lotNumber, value)) return this;
    return new ImmutableMedication_Batch(this.modifierExtension, this.expirationDate, this.id, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedication_Batch} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedication_Batch
        && equalTo((ImmutableMedication_Batch) another);
  }

  private boolean equalTo(ImmutableMedication_Batch another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(expirationDate, another.expirationDate)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(lotNumber, another.lotNumber);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code expirationDate}, {@code id}, {@code extension}, {@code lotNumber}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(expirationDate);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(lotNumber);
    return h;
  }

  /**
   * Prints the immutable value {@code Medication_Batch} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Medication_Batch{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (expirationDate != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("expirationDate=").append(expirationDate);
    }
    if (id != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (lotNumber != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("lotNumber=").append(lotNumber);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Medication_Batch", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Medication_Batch {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<DateTime> expirationDate = Optional.empty();
    boolean expirationDateIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> lotNumber = Optional.empty();
    boolean lotNumberIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("expirationDate")
    public void setExpirationDate(Optional<DateTime> expirationDate) {
      this.expirationDate = expirationDate;
      this.expirationDateIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("lotNumber")
    public void setLotNumber(Optional<String> lotNumber) {
      this.lotNumber = lotNumber;
      this.lotNumberIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> expirationDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> lotNumber() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedication_Batch fromJson(Json json) {
    ImmutableMedication_Batch.Builder builder = ImmutableMedication_Batch.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.expirationDateIsSet) {
      builder.expirationDate(json.expirationDate);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.lotNumberIsSet) {
      builder.lotNumber(json.lotNumber);
    }
    return (ImmutableMedication_Batch) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Medication_Batch} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Medication_Batch instance
   */
  public static Medication_Batch copyOf(Medication_Batch instance) {
    if (instance instanceof ImmutableMedication_Batch) {
      return (ImmutableMedication_Batch) instance;
    }
    return ImmutableMedication_Batch.builder()
        .modifierExtension(instance.modifierExtension())
        .expirationDate(instance.expirationDate())
        .id(instance.id())
        .extension(instance.extension())
        .lotNumber(instance.lotNumber())
        .build();
  }

  /**
   * Creates a builder for {@link Medication_Batch Medication_Batch}.
   * <pre>
   * ImmutableMedication_Batch.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Medication_Batch#modifierExtension() modifierExtension}
   *    .expirationDate(com.medplum.types.fhir.DateTime) // optional {@link Medication_Batch#expirationDate() expirationDate}
   *    .id(String) // optional {@link Medication_Batch#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Medication_Batch#extension() extension}
   *    .lotNumber(String) // optional {@link Medication_Batch#lotNumber() lotNumber}
   *    .build();
   * </pre>
   * @return A new Medication_Batch builder
   */
  public static ImmutableMedication_Batch.Builder builder() {
    return new ImmutableMedication_Batch.Builder();
  }

  /**
   * Builds instances of type {@link Medication_Batch Medication_Batch}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Medication_Batch", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXPIRATION_DATE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_LOT_NUMBER = 0x10L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable DateTime expirationDate;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable String lotNumber;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Medication_Batch#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Medication_Batch#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Medication_Batch#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder expirationDate(DateTime expirationDate) {
      checkNotIsSet(expirationDateIsSet(), "expirationDate");
      this.expirationDate = Objects.requireNonNull(expirationDate, "expirationDate");
      optBits |= OPT_BIT_EXPIRATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication_Batch#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expirationDate")
    public final Builder expirationDate(Optional<? extends DateTime> expirationDate) {
      checkNotIsSet(expirationDateIsSet(), "expirationDate");
      this.expirationDate = expirationDate.orElse(null);
      optBits |= OPT_BIT_EXPIRATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication_Batch#id() id} to id.
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
     * Initializes the optional value {@link Medication_Batch#id() id} to id.
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
     * Initializes the optional value {@link Medication_Batch#extension() extension} to extension.
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
     * Initializes the optional value {@link Medication_Batch#extension() extension} to extension.
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
     * Initializes the optional value {@link Medication_Batch#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder lotNumber(String lotNumber) {
      checkNotIsSet(lotNumberIsSet(), "lotNumber");
      this.lotNumber = Objects.requireNonNull(lotNumber, "lotNumber");
      optBits |= OPT_BIT_LOT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Medication_Batch#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lotNumber")
    public final Builder lotNumber(Optional<String> lotNumber) {
      checkNotIsSet(lotNumberIsSet(), "lotNumber");
      this.lotNumber = lotNumber.orElse(null);
      optBits |= OPT_BIT_LOT_NUMBER;
      return this;
    }

    /**
     * Builds a new {@link Medication_Batch Medication_Batch}.
     * @return An immutable instance of Medication_Batch
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Medication_Batch build() {
      return new ImmutableMedication_Batch(modifierExtension, expirationDate, id, extension, lotNumber);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean expirationDateIsSet() {
      return (optBits & OPT_BIT_EXPIRATION_DATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean lotNumberIsSet() {
      return (optBits & OPT_BIT_LOT_NUMBER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Medication_Batch is strict, attribute is already set: ".concat(name));
    }
  }
}

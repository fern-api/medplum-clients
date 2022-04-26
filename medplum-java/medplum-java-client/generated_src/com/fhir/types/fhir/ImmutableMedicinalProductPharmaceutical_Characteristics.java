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
 * Immutable implementation of {@link MedicinalProductPharmaceutical_Characteristics}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductPharmaceutical_Characteristics.builder()}.
 */
@Generated(from = "MedicinalProductPharmaceutical_Characteristics", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductPharmaceutical_Characteristics
    implements MedicinalProductPharmaceutical_Characteristics {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept status;
  private final CodeableConcept code;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;

  private ImmutableMedicinalProductPharmaceutical_Characteristics(
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept status,
      CodeableConcept code,
      @Nullable String id,
      @Nullable List<Extension> extension) {
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.code = code;
    this.id = id;
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<CodeableConcept> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public CodeableConcept code() {
    return code;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_Characteristics#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_Characteristics withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical_Characteristics(newValue, this.status, this.code, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_Characteristics#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical_Characteristics withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductPharmaceutical_Characteristics(value, this.status, this.code, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_Characteristics#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_Characteristics withStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical_Characteristics(this.modifierExtension, newValue, this.code, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_Characteristics#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical_Characteristics withStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicinalProductPharmaceutical_Characteristics(this.modifierExtension, value, this.code, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductPharmaceutical_Characteristics#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_Characteristics withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableMedicinalProductPharmaceutical_Characteristics(this.modifierExtension, this.status, newValue, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_Characteristics#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_Characteristics withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProductPharmaceutical_Characteristics(this.modifierExtension, this.status, this.code, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_Characteristics#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_Characteristics withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProductPharmaceutical_Characteristics(this.modifierExtension, this.status, this.code, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_Characteristics#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_Characteristics withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical_Characteristics(this.modifierExtension, this.status, this.code, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_Characteristics#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical_Characteristics withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductPharmaceutical_Characteristics(this.modifierExtension, this.status, this.code, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductPharmaceutical_Characteristics} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductPharmaceutical_Characteristics
        && equalTo((ImmutableMedicinalProductPharmaceutical_Characteristics) another);
  }

  private boolean equalTo(ImmutableMedicinalProductPharmaceutical_Characteristics another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(status, another.status)
        && code.equals(another.code)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code status}, {@code code}, {@code id}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductPharmaceutical_Characteristics} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductPharmaceutical_Characteristics{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (status != null) {
      if (builder.length() > 47) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (builder.length() > 47) builder.append(", ");
    builder.append("code=").append(code);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
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
  @Generated(from = "MedicinalProductPharmaceutical_Characteristics", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductPharmaceutical_Characteristics {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> status = Optional.empty();
    boolean statusIsSet;
    @Nullable CodeableConcept code;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<CodeableConcept> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
      this.code = code;
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
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> status() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicinalProductPharmaceutical_Characteristics fromJson(Json json) {
    ImmutableMedicinalProductPharmaceutical_Characteristics.Builder builder = ((ImmutableMedicinalProductPharmaceutical_Characteristics.Builder) ImmutableMedicinalProductPharmaceutical_Characteristics.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableMedicinalProductPharmaceutical_Characteristics) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductPharmaceutical_Characteristics} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductPharmaceutical_Characteristics instance
   */
  public static MedicinalProductPharmaceutical_Characteristics copyOf(MedicinalProductPharmaceutical_Characteristics instance) {
    if (instance instanceof ImmutableMedicinalProductPharmaceutical_Characteristics) {
      return (ImmutableMedicinalProductPharmaceutical_Characteristics) instance;
    }
    return ((ImmutableMedicinalProductPharmaceutical_Characteristics.Builder) ImmutableMedicinalProductPharmaceutical_Characteristics.builder())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .code(instance.code())
        .id(instance.id())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductPharmaceutical_Characteristics MedicinalProductPharmaceutical_Characteristics}.
   * <pre>
   * ImmutableMedicinalProductPharmaceutical_Characteristics.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPharmaceutical_Characteristics#modifierExtension() modifierExtension}
   *    .status(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicinalProductPharmaceutical_Characteristics#status() status}
   *    .code(com.fhir.types.fhir.CodeableConcept) // required {@link MedicinalProductPharmaceutical_Characteristics#code() code}
   *    .id(String) // optional {@link MedicinalProductPharmaceutical_Characteristics#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPharmaceutical_Characteristics#extension() extension}
   *    .build();
   * </pre>
   * @return A new MedicinalProductPharmaceutical_Characteristics builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableMedicinalProductPharmaceutical_Characteristics.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductPharmaceutical_Characteristics MedicinalProductPharmaceutical_Characteristics}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductPharmaceutical_Characteristics", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_STATUS = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept status;
    private @Nullable CodeableConcept code;
    private @Nullable String id;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#status() status} to status.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#status() status} to status.
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
     * Initializes the value for the {@link MedicinalProductPharmaceutical_Characteristics#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#extension() extension} to extension.
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
     * Builds a new {@link MedicinalProductPharmaceutical_Characteristics MedicinalProductPharmaceutical_Characteristics}.
     * @return An immutable instance of MedicinalProductPharmaceutical_Characteristics
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductPharmaceutical_Characteristics build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductPharmaceutical_Characteristics(modifierExtension, status, code, id, extension);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductPharmaceutical_Characteristics is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      return "Cannot build MedicinalProductPharmaceutical_Characteristics, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductPharmaceutical_Characteristics", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductPharmaceutical_Characteristics#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(CodeableConcept code);
  }

  @Generated(from = "MedicinalProductPharmaceutical_Characteristics", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(CodeableConcept status);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends CodeableConcept> status);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_Characteristics#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link MedicinalProductPharmaceutical_Characteristics MedicinalProductPharmaceutical_Characteristics}.
     * @return An immutable instance of MedicinalProductPharmaceutical_Characteristics
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductPharmaceutical_Characteristics build();
  }
}

package com.fhir;

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
 * Immutable implementation of {@link MedicinalProductPackaged_BatchIdentifier}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductPackaged_BatchIdentifier.builder()}.
 */
@Generated(from = "MedicinalProductPackaged_BatchIdentifier", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductPackaged_BatchIdentifier
    implements MedicinalProductPackaged_BatchIdentifier {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Identifier immediatePackaging;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final Identifier outerPackaging;

  private ImmutableMedicinalProductPackaged_BatchIdentifier(
      @Nullable List<Extension> modifierExtension,
      @Nullable Identifier immediatePackaging,
      @Nullable List<Extension> extension,
      @Nullable String id,
      Identifier outerPackaging) {
    this.modifierExtension = modifierExtension;
    this.immediatePackaging = immediatePackaging;
    this.extension = extension;
    this.id = id;
    this.outerPackaging = outerPackaging;
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
   * @return The value of the {@code immediatePackaging} attribute
   */
  @JsonProperty("immediatePackaging")
  @Override
  public Optional<Identifier> immediatePackaging() {
    return Optional.ofNullable(immediatePackaging);
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
   * @return The value of the {@code outerPackaging} attribute
   */
  @JsonProperty("outerPackaging")
  @Override
  public Identifier outerPackaging() {
    return outerPackaging;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_BatchIdentifier#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_BatchIdentifier withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductPackaged_BatchIdentifier(newValue, this.immediatePackaging, this.extension, this.id, this.outerPackaging);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_BatchIdentifier#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_BatchIdentifier withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductPackaged_BatchIdentifier(value, this.immediatePackaging, this.extension, this.id, this.outerPackaging);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_BatchIdentifier#immediatePackaging() immediatePackaging} attribute.
   * @param value The value for immediatePackaging
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_BatchIdentifier withImmediatePackaging(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "immediatePackaging");
    if (this.immediatePackaging == newValue) return this;
    return new ImmutableMedicinalProductPackaged_BatchIdentifier(this.modifierExtension, newValue, this.extension, this.id, this.outerPackaging);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_BatchIdentifier#immediatePackaging() immediatePackaging} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for immediatePackaging
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_BatchIdentifier withImmediatePackaging(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.immediatePackaging == value) return this;
    return new ImmutableMedicinalProductPackaged_BatchIdentifier(this.modifierExtension, value, this.extension, this.id, this.outerPackaging);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_BatchIdentifier#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_BatchIdentifier withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductPackaged_BatchIdentifier(this.modifierExtension, this.immediatePackaging, newValue, this.id, this.outerPackaging);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_BatchIdentifier#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged_BatchIdentifier withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductPackaged_BatchIdentifier(this.modifierExtension, this.immediatePackaging, value, this.id, this.outerPackaging);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged_BatchIdentifier#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_BatchIdentifier withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProductPackaged_BatchIdentifier(this.modifierExtension, this.immediatePackaging, this.extension, newValue, this.outerPackaging);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged_BatchIdentifier#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_BatchIdentifier withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProductPackaged_BatchIdentifier(this.modifierExtension, this.immediatePackaging, this.extension, value, this.outerPackaging);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductPackaged_BatchIdentifier#outerPackaging() outerPackaging} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for outerPackaging
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductPackaged_BatchIdentifier withOuterPackaging(Identifier value) {
    if (this.outerPackaging == value) return this;
    Identifier newValue = Objects.requireNonNull(value, "outerPackaging");
    return new ImmutableMedicinalProductPackaged_BatchIdentifier(this.modifierExtension, this.immediatePackaging, this.extension, this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductPackaged_BatchIdentifier} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductPackaged_BatchIdentifier
        && equalTo((ImmutableMedicinalProductPackaged_BatchIdentifier) another);
  }

  private boolean equalTo(ImmutableMedicinalProductPackaged_BatchIdentifier another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(immediatePackaging, another.immediatePackaging)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && outerPackaging.equals(another.outerPackaging);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code immediatePackaging}, {@code extension}, {@code id}, {@code outerPackaging}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(immediatePackaging);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + outerPackaging.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductPackaged_BatchIdentifier} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductPackaged_BatchIdentifier{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (immediatePackaging != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("immediatePackaging=").append(immediatePackaging);
    }
    if (extension != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 41) builder.append(", ");
    builder.append("outerPackaging=").append(outerPackaging);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductPackaged_BatchIdentifier", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductPackaged_BatchIdentifier {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Identifier> immediatePackaging = Optional.empty();
    boolean immediatePackagingIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Identifier outerPackaging;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("immediatePackaging")
    public void setImmediatePackaging(Optional<Identifier> immediatePackaging) {
      this.immediatePackaging = immediatePackaging;
      this.immediatePackagingIsSet = true;
    }
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
    @JsonProperty("outerPackaging")
    public void setOuterPackaging(Identifier outerPackaging) {
      this.outerPackaging = outerPackaging;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> immediatePackaging() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Identifier outerPackaging() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductPackaged_BatchIdentifier fromJson(Json json) {
    ImmutableMedicinalProductPackaged_BatchIdentifier.Builder builder = ((ImmutableMedicinalProductPackaged_BatchIdentifier.Builder) ImmutableMedicinalProductPackaged_BatchIdentifier.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.immediatePackagingIsSet) {
      builder.immediatePackaging(json.immediatePackaging);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.outerPackaging != null) {
      builder.outerPackaging(json.outerPackaging);
    }
    return (ImmutableMedicinalProductPackaged_BatchIdentifier) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductPackaged_BatchIdentifier} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductPackaged_BatchIdentifier instance
   */
  public static MedicinalProductPackaged_BatchIdentifier copyOf(MedicinalProductPackaged_BatchIdentifier instance) {
    if (instance instanceof ImmutableMedicinalProductPackaged_BatchIdentifier) {
      return (ImmutableMedicinalProductPackaged_BatchIdentifier) instance;
    }
    return ((ImmutableMedicinalProductPackaged_BatchIdentifier.Builder) ImmutableMedicinalProductPackaged_BatchIdentifier.builder())
        .modifierExtension(instance.modifierExtension())
        .immediatePackaging(instance.immediatePackaging())
        .extension(instance.extension())
        .id(instance.id())
        .outerPackaging(instance.outerPackaging())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductPackaged_BatchIdentifier MedicinalProductPackaged_BatchIdentifier}.
   * <pre>
   * ImmutableMedicinalProductPackaged_BatchIdentifier.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPackaged_BatchIdentifier#modifierExtension() modifierExtension}
   *    .immediatePackaging(com.fhir.Identifier) // optional {@link MedicinalProductPackaged_BatchIdentifier#immediatePackaging() immediatePackaging}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPackaged_BatchIdentifier#extension() extension}
   *    .id(String) // optional {@link MedicinalProductPackaged_BatchIdentifier#id() id}
   *    .outerPackaging(com.fhir.Identifier) // required {@link MedicinalProductPackaged_BatchIdentifier#outerPackaging() outerPackaging}
   *    .build();
   * </pre>
   * @return A new MedicinalProductPackaged_BatchIdentifier builder
   */
  public static OuterPackagingBuildStage builder() {
    return new ImmutableMedicinalProductPackaged_BatchIdentifier.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductPackaged_BatchIdentifier MedicinalProductPackaged_BatchIdentifier}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductPackaged_BatchIdentifier", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements OuterPackagingBuildStage, BuildFinal {
    private static final long INIT_BIT_OUTER_PACKAGING = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_IMMEDIATE_PACKAGING = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Identifier immediatePackaging;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Identifier outerPackaging;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#immediatePackaging() immediatePackaging} to immediatePackaging.
     * @param immediatePackaging The value for immediatePackaging
     * @return {@code this} builder for chained invocation
     */
    public final Builder immediatePackaging(Identifier immediatePackaging) {
      checkNotIsSet(immediatePackagingIsSet(), "immediatePackaging");
      this.immediatePackaging = Objects.requireNonNull(immediatePackaging, "immediatePackaging");
      optBits |= OPT_BIT_IMMEDIATE_PACKAGING;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#immediatePackaging() immediatePackaging} to immediatePackaging.
     * @param immediatePackaging The value for immediatePackaging
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("immediatePackaging")
    public final Builder immediatePackaging(Optional<? extends Identifier> immediatePackaging) {
      checkNotIsSet(immediatePackagingIsSet(), "immediatePackaging");
      this.immediatePackaging = immediatePackaging.orElse(null);
      optBits |= OPT_BIT_IMMEDIATE_PACKAGING;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#id() id} to id.
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
     * Initializes the value for the {@link MedicinalProductPackaged_BatchIdentifier#outerPackaging() outerPackaging} attribute.
     * @param outerPackaging The value for outerPackaging 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outerPackaging")
    public final Builder outerPackaging(Identifier outerPackaging) {
      checkNotIsSet(outerPackagingIsSet(), "outerPackaging");
      this.outerPackaging = Objects.requireNonNull(outerPackaging, "outerPackaging");
      initBits &= ~INIT_BIT_OUTER_PACKAGING;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductPackaged_BatchIdentifier MedicinalProductPackaged_BatchIdentifier}.
     * @return An immutable instance of MedicinalProductPackaged_BatchIdentifier
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductPackaged_BatchIdentifier build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductPackaged_BatchIdentifier(modifierExtension, immediatePackaging, extension, id, outerPackaging);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean immediatePackagingIsSet() {
      return (optBits & OPT_BIT_IMMEDIATE_PACKAGING) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean outerPackagingIsSet() {
      return (initBits & INIT_BIT_OUTER_PACKAGING) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductPackaged_BatchIdentifier is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!outerPackagingIsSet()) attributes.add("outerPackaging");
      return "Cannot build MedicinalProductPackaged_BatchIdentifier, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductPackaged_BatchIdentifier", generator = "Immutables")
  public interface OuterPackagingBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductPackaged_BatchIdentifier#outerPackaging() outerPackaging} attribute.
     * @param outerPackaging The value for outerPackaging 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outerPackaging(Identifier outerPackaging);
  }

  @Generated(from = "MedicinalProductPackaged_BatchIdentifier", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#immediatePackaging() immediatePackaging} to immediatePackaging.
     * @param immediatePackaging The value for immediatePackaging
     * @return {@code this} builder for chained invocation
     */
    BuildFinal immediatePackaging(Identifier immediatePackaging);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#immediatePackaging() immediatePackaging} to immediatePackaging.
     * @param immediatePackaging The value for immediatePackaging
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal immediatePackaging(Optional<? extends Identifier> immediatePackaging);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged_BatchIdentifier#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link MedicinalProductPackaged_BatchIdentifier MedicinalProductPackaged_BatchIdentifier}.
     * @return An immutable instance of MedicinalProductPackaged_BatchIdentifier
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductPackaged_BatchIdentifier build();
  }
}

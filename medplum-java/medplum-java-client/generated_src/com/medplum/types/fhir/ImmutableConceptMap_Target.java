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
 * Immutable implementation of {@link ConceptMap_Target}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConceptMap_Target.builder()}.
 */
@Generated(from = "ConceptMap_Target", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConceptMap_Target implements ConceptMap_Target {
  private final @Nullable Code code;
  private final @Nullable Conceptmap_targetEquivalence equivalence;
  private final @Nullable List<ConceptMap_DependsOn> dependsOn;
  private final @Nullable List<ConceptMap_DependsOn> product;
  private final @Nullable String comment;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String display;

  private ImmutableConceptMap_Target(
      @Nullable Code code,
      @Nullable Conceptmap_targetEquivalence equivalence,
      @Nullable List<ConceptMap_DependsOn> dependsOn,
      @Nullable List<ConceptMap_DependsOn> product,
      @Nullable String comment,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String display) {
    this.code = code;
    this.equivalence = equivalence;
    this.dependsOn = dependsOn;
    this.product = product;
    this.comment = comment;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.display = display;
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code equivalence} attribute
   */
  @JsonProperty("equivalence")
  @Override
  public Optional<Conceptmap_targetEquivalence> equivalence() {
    return Optional.ofNullable(equivalence);
  }

  /**
   * @return The value of the {@code dependsOn} attribute
   */
  @JsonProperty("dependsOn")
  @Override
  public Optional<List<ConceptMap_DependsOn>> dependsOn() {
    return Optional.ofNullable(dependsOn);
  }

  /**
   * @return The value of the {@code product} attribute
   */
  @JsonProperty("product")
  @Override
  public Optional<List<ConceptMap_DependsOn>> product() {
    return Optional.ofNullable(product);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<String> comment() {
    return Optional.ofNullable(comment);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code display} attribute
   */
  @JsonProperty("display")
  @Override
  public Optional<String> display() {
    return Optional.ofNullable(display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableConceptMap_Target(
        newValue,
        this.equivalence,
        this.dependsOn,
        this.product,
        this.comment,
        this.id,
        this.extension,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Target withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableConceptMap_Target(
        value,
        this.equivalence,
        this.dependsOn,
        this.product,
        this.comment,
        this.id,
        this.extension,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#equivalence() equivalence} attribute.
   * @param value The value for equivalence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withEquivalence(Conceptmap_targetEquivalence value) {
    @Nullable Conceptmap_targetEquivalence newValue = Objects.requireNonNull(value, "equivalence");
    if (this.equivalence == newValue) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        newValue,
        this.dependsOn,
        this.product,
        this.comment,
        this.id,
        this.extension,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#equivalence() equivalence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for equivalence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Target withEquivalence(Optional<? extends Conceptmap_targetEquivalence> optional) {
    @Nullable Conceptmap_targetEquivalence value = optional.orElse(null);
    if (this.equivalence == value) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        value,
        this.dependsOn,
        this.product,
        this.comment,
        this.id,
        this.extension,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#dependsOn() dependsOn} attribute.
   * @param value The value for dependsOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withDependsOn(List<ConceptMap_DependsOn> value) {
    @Nullable List<ConceptMap_DependsOn> newValue = Objects.requireNonNull(value, "dependsOn");
    if (this.dependsOn == newValue) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        newValue,
        this.product,
        this.comment,
        this.id,
        this.extension,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#dependsOn() dependsOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dependsOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Target withDependsOn(Optional<? extends List<ConceptMap_DependsOn>> optional) {
    @Nullable List<ConceptMap_DependsOn> value = optional.orElse(null);
    if (this.dependsOn == value) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        value,
        this.product,
        this.comment,
        this.id,
        this.extension,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#product() product} attribute.
   * @param value The value for product
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withProduct(List<ConceptMap_DependsOn> value) {
    @Nullable List<ConceptMap_DependsOn> newValue = Objects.requireNonNull(value, "product");
    if (this.product == newValue) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        this.dependsOn,
        newValue,
        this.comment,
        this.id,
        this.extension,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#product() product} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for product
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Target withProduct(Optional<? extends List<ConceptMap_DependsOn>> optional) {
    @Nullable List<ConceptMap_DependsOn> value = optional.orElse(null);
    if (this.product == value) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        this.dependsOn,
        value,
        this.comment,
        this.id,
        this.extension,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        this.dependsOn,
        this.product,
        newValue,
        this.id,
        this.extension,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        this.dependsOn,
        this.product,
        value,
        this.id,
        this.extension,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        this.dependsOn,
        this.product,
        this.comment,
        newValue,
        this.extension,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        this.dependsOn,
        this.product,
        this.comment,
        value,
        this.extension,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        this.dependsOn,
        this.product,
        this.comment,
        this.id,
        newValue,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Target withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        this.dependsOn,
        this.product,
        this.comment,
        this.id,
        value,
        this.modifierExtension,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        this.dependsOn,
        this.product,
        this.comment,
        this.id,
        this.extension,
        newValue,
        this.display);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Target withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        this.dependsOn,
        this.product,
        this.comment,
        this.id,
        this.extension,
        value,
        this.display);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Target#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withDisplay(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "display");
    if (Objects.equals(this.display, newValue)) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        this.dependsOn,
        this.product,
        this.comment,
        this.id,
        this.extension,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Target#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Target withDisplay(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.display, value)) return this;
    return new ImmutableConceptMap_Target(
        this.code,
        this.equivalence,
        this.dependsOn,
        this.product,
        this.comment,
        this.id,
        this.extension,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConceptMap_Target} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConceptMap_Target
        && equalTo((ImmutableConceptMap_Target) another);
  }

  private boolean equalTo(ImmutableConceptMap_Target another) {
    return Objects.equals(code, another.code)
        && Objects.equals(equivalence, another.equivalence)
        && Objects.equals(dependsOn, another.dependsOn)
        && Objects.equals(product, another.product)
        && Objects.equals(comment, another.comment)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(display, another.display);
  }

  /**
   * Computes a hash code from attributes: {@code code}, {@code equivalence}, {@code dependsOn}, {@code product}, {@code comment}, {@code id}, {@code extension}, {@code modifierExtension}, {@code display}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(equivalence);
    h += (h << 5) + Objects.hashCode(dependsOn);
    h += (h << 5) + Objects.hashCode(product);
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(display);
    return h;
  }

  /**
   * Prints the immutable value {@code ConceptMap_Target} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ConceptMap_Target{");
    if (code != null) {
      builder.append("code=").append(code);
    }
    if (equivalence != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("equivalence=").append(equivalence);
    }
    if (dependsOn != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("dependsOn=").append(dependsOn);
    }
    if (product != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("product=").append(product);
    }
    if (comment != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (display != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("display=").append(display);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ConceptMap_Target", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ConceptMap_Target {
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Conceptmap_targetEquivalence> equivalence = Optional.empty();
    boolean equivalenceIsSet;
    @Nullable Optional<List<ConceptMap_DependsOn>> dependsOn = Optional.empty();
    boolean dependsOnIsSet;
    @Nullable Optional<List<ConceptMap_DependsOn>> product = Optional.empty();
    boolean productIsSet;
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> display = Optional.empty();
    boolean displayIsSet;
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("equivalence")
    public void setEquivalence(Optional<Conceptmap_targetEquivalence> equivalence) {
      this.equivalence = equivalence;
      this.equivalenceIsSet = true;
    }
    @JsonProperty("dependsOn")
    public void setDependsOn(Optional<List<ConceptMap_DependsOn>> dependsOn) {
      this.dependsOn = dependsOn;
      this.dependsOnIsSet = true;
    }
    @JsonProperty("product")
    public void setProduct(Optional<List<ConceptMap_DependsOn>> product) {
      this.product = product;
      this.productIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("display")
    public void setDisplay(Optional<String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Conceptmap_targetEquivalence> equivalence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ConceptMap_DependsOn>> dependsOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ConceptMap_DependsOn>> product() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> display() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableConceptMap_Target fromJson(Json json) {
    ImmutableConceptMap_Target.Builder builder = ImmutableConceptMap_Target.builder();
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.equivalenceIsSet) {
      builder.equivalence(json.equivalence);
    }
    if (json.dependsOnIsSet) {
      builder.dependsOn(json.dependsOn);
    }
    if (json.productIsSet) {
      builder.product(json.product);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    return (ImmutableConceptMap_Target) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConceptMap_Target} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ConceptMap_Target instance
   */
  public static ConceptMap_Target copyOf(ConceptMap_Target instance) {
    if (instance instanceof ImmutableConceptMap_Target) {
      return (ImmutableConceptMap_Target) instance;
    }
    return ImmutableConceptMap_Target.builder()
        .code(instance.code())
        .equivalence(instance.equivalence())
        .dependsOn(instance.dependsOn())
        .product(instance.product())
        .comment(instance.comment())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .display(instance.display())
        .build();
  }

  /**
   * Creates a builder for {@link ConceptMap_Target ConceptMap_Target}.
   * <pre>
   * ImmutableConceptMap_Target.builder()
   *    .code(com.medplum.types.fhir.Code) // optional {@link ConceptMap_Target#code() code}
   *    .equivalence(com.medplum.types.fhir.Conceptmap_targetEquivalence) // optional {@link ConceptMap_Target#equivalence() equivalence}
   *    .dependsOn(List&amp;lt;com.medplum.types.fhir.ConceptMap_DependsOn&amp;gt;) // optional {@link ConceptMap_Target#dependsOn() dependsOn}
   *    .product(List&amp;lt;com.medplum.types.fhir.ConceptMap_DependsOn&amp;gt;) // optional {@link ConceptMap_Target#product() product}
   *    .comment(String) // optional {@link ConceptMap_Target#comment() comment}
   *    .id(String) // optional {@link ConceptMap_Target#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ConceptMap_Target#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ConceptMap_Target#modifierExtension() modifierExtension}
   *    .display(String) // optional {@link ConceptMap_Target#display() display}
   *    .build();
   * </pre>
   * @return A new ConceptMap_Target builder
   */
  public static ImmutableConceptMap_Target.Builder builder() {
    return new ImmutableConceptMap_Target.Builder();
  }

  /**
   * Builds instances of type {@link ConceptMap_Target ConceptMap_Target}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ConceptMap_Target", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_EQUIVALENCE = 0x2L;
    private static final long OPT_BIT_DEPENDS_ON = 0x4L;
    private static final long OPT_BIT_PRODUCT = 0x8L;
    private static final long OPT_BIT_COMMENT = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_DISPLAY = 0x100L;
    private long optBits;

    private @Nullable Code code;
    private @Nullable Conceptmap_targetEquivalence equivalence;
    private @Nullable List<ConceptMap_DependsOn> dependsOn;
    private @Nullable List<ConceptMap_DependsOn> product;
    private @Nullable String comment;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String display;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#equivalence() equivalence} to equivalence.
     * @param equivalence The value for equivalence
     * @return {@code this} builder for chained invocation
     */
    public final Builder equivalence(Conceptmap_targetEquivalence equivalence) {
      checkNotIsSet(equivalenceIsSet(), "equivalence");
      this.equivalence = Objects.requireNonNull(equivalence, "equivalence");
      optBits |= OPT_BIT_EQUIVALENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#equivalence() equivalence} to equivalence.
     * @param equivalence The value for equivalence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("equivalence")
    public final Builder equivalence(Optional<? extends Conceptmap_targetEquivalence> equivalence) {
      checkNotIsSet(equivalenceIsSet(), "equivalence");
      this.equivalence = equivalence.orElse(null);
      optBits |= OPT_BIT_EQUIVALENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#dependsOn() dependsOn} to dependsOn.
     * @param dependsOn The value for dependsOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder dependsOn(List<ConceptMap_DependsOn> dependsOn) {
      checkNotIsSet(dependsOnIsSet(), "dependsOn");
      this.dependsOn = Objects.requireNonNull(dependsOn, "dependsOn");
      optBits |= OPT_BIT_DEPENDS_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#dependsOn() dependsOn} to dependsOn.
     * @param dependsOn The value for dependsOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dependsOn")
    public final Builder dependsOn(Optional<? extends List<ConceptMap_DependsOn>> dependsOn) {
      checkNotIsSet(dependsOnIsSet(), "dependsOn");
      this.dependsOn = dependsOn.orElse(null);
      optBits |= OPT_BIT_DEPENDS_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#product() product} to product.
     * @param product The value for product
     * @return {@code this} builder for chained invocation
     */
    public final Builder product(List<ConceptMap_DependsOn> product) {
      checkNotIsSet(productIsSet(), "product");
      this.product = Objects.requireNonNull(product, "product");
      optBits |= OPT_BIT_PRODUCT;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#product() product} to product.
     * @param product The value for product
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("product")
    public final Builder product(Optional<? extends List<ConceptMap_DependsOn>> product) {
      checkNotIsSet(productIsSet(), "product");
      this.product = product.orElse(null);
      optBits |= OPT_BIT_PRODUCT;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comment")
    public final Builder comment(Optional<String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_Target#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap_Target#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for chained invocation
     */
    public final Builder display(String display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = Objects.requireNonNull(display, "display");
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Target#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("display")
    public final Builder display(Optional<String> display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = display.orElse(null);
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Builds a new {@link ConceptMap_Target ConceptMap_Target}.
     * @return An immutable instance of ConceptMap_Target
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ConceptMap_Target build() {
      return new ImmutableConceptMap_Target(code, equivalence, dependsOn, product, comment, id, extension, modifierExtension, display);
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean equivalenceIsSet() {
      return (optBits & OPT_BIT_EQUIVALENCE) != 0;
    }

    private boolean dependsOnIsSet() {
      return (optBits & OPT_BIT_DEPENDS_ON) != 0;
    }

    private boolean productIsSet() {
      return (optBits & OPT_BIT_PRODUCT) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ConceptMap_Target is strict, attribute is already set: ".concat(name));
    }
  }
}

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
 * Immutable implementation of {@link ImagingStudy_Instance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImagingStudy_Instance.builder()}.
 */
@Generated(from = "ImagingStudy_Instance", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImagingStudy_Instance implements ImagingStudy_Instance {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Id uid;
  private final @Nullable UnsignedInt number;
  private final @Nullable String title;
  private final Coding sopClass;

  private ImmutableImagingStudy_Instance(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Id uid,
      @Nullable UnsignedInt number,
      @Nullable String title,
      Coding sopClass) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.extension = extension;
    this.uid = uid;
    this.number = number;
    this.title = title;
    this.sopClass = sopClass;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code uid} attribute
   */
  @JsonProperty("uid")
  @Override
  public Optional<Id> uid() {
    return Optional.ofNullable(uid);
  }

  /**
   * @return The value of the {@code number} attribute
   */
  @JsonProperty("number")
  @Override
  public Optional<UnsignedInt> number() {
    return Optional.ofNullable(number);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code sopClass} attribute
   */
  @JsonProperty("sopClass")
  @Override
  public Coding sopClass() {
    return sopClass;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Instance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImagingStudy_Instance(newValue, this.id, this.extension, this.uid, this.number, this.title, this.sopClass);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Instance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Instance withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImagingStudy_Instance(value, this.id, this.extension, this.uid, this.number, this.title, this.sopClass);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Instance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImagingStudy_Instance(
        this.modifierExtension,
        newValue,
        this.extension,
        this.uid,
        this.number,
        this.title,
        this.sopClass);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Instance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImagingStudy_Instance(this.modifierExtension, value, this.extension, this.uid, this.number, this.title, this.sopClass);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Instance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImagingStudy_Instance(this.modifierExtension, this.id, newValue, this.uid, this.number, this.title, this.sopClass);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Instance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Instance withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImagingStudy_Instance(this.modifierExtension, this.id, value, this.uid, this.number, this.title, this.sopClass);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Instance#uid() uid} attribute.
   * @param value The value for uid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withUid(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "uid");
    if (this.uid == newValue) return this;
    return new ImmutableImagingStudy_Instance(
        this.modifierExtension,
        this.id,
        this.extension,
        newValue,
        this.number,
        this.title,
        this.sopClass);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Instance#uid() uid} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for uid
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Instance withUid(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.uid == value) return this;
    return new ImmutableImagingStudy_Instance(this.modifierExtension, this.id, this.extension, value, this.number, this.title, this.sopClass);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Instance#number() number} attribute.
   * @param value The value for number
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withNumber(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "number");
    if (this.number == newValue) return this;
    return new ImmutableImagingStudy_Instance(this.modifierExtension, this.id, this.extension, this.uid, newValue, this.title, this.sopClass);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Instance#number() number} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for number
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Instance withNumber(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.number == value) return this;
    return new ImmutableImagingStudy_Instance(this.modifierExtension, this.id, this.extension, this.uid, value, this.title, this.sopClass);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Instance#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableImagingStudy_Instance(this.modifierExtension, this.id, this.extension, this.uid, this.number, newValue, this.sopClass);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Instance#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableImagingStudy_Instance(this.modifierExtension, this.id, this.extension, this.uid, this.number, value, this.sopClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImagingStudy_Instance#sopClass() sopClass} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sopClass
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImagingStudy_Instance withSopClass(Coding value) {
    if (this.sopClass == value) return this;
    Coding newValue = Objects.requireNonNull(value, "sopClass");
    return new ImmutableImagingStudy_Instance(this.modifierExtension, this.id, this.extension, this.uid, this.number, this.title, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImagingStudy_Instance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImagingStudy_Instance
        && equalTo((ImmutableImagingStudy_Instance) another);
  }

  private boolean equalTo(ImmutableImagingStudy_Instance another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(uid, another.uid)
        && Objects.equals(number, another.number)
        && Objects.equals(title, another.title)
        && sopClass.equals(another.sopClass);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code extension}, {@code uid}, {@code number}, {@code title}, {@code sopClass}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(uid);
    h += (h << 5) + Objects.hashCode(number);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + sopClass.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ImagingStudy_Instance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImagingStudy_Instance{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (uid != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("uid=").append(uid);
    }
    if (number != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("number=").append(number);
    }
    if (title != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("sopClass=").append(sopClass);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImagingStudy_Instance", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImagingStudy_Instance {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Id> uid = Optional.empty();
    boolean uidIsSet;
    @Nullable Optional<UnsignedInt> number = Optional.empty();
    boolean numberIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Coding sopClass;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("uid")
    public void setUid(Optional<Id> uid) {
      this.uid = uid;
      this.uidIsSet = true;
    }
    @JsonProperty("number")
    public void setNumber(Optional<UnsignedInt> number) {
      this.number = number;
      this.numberIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("sopClass")
    public void setSopClass(Coding sopClass) {
      this.sopClass = sopClass;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> uid() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UnsignedInt> number() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Coding sopClass() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImagingStudy_Instance fromJson(Json json) {
    ImmutableImagingStudy_Instance.Builder builder = ((ImmutableImagingStudy_Instance.Builder) ImmutableImagingStudy_Instance.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.uidIsSet) {
      builder.uid(json.uid);
    }
    if (json.numberIsSet) {
      builder.number(json.number);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.sopClass != null) {
      builder.sopClass(json.sopClass);
    }
    return (ImmutableImagingStudy_Instance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImagingStudy_Instance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImagingStudy_Instance instance
   */
  public static ImagingStudy_Instance copyOf(ImagingStudy_Instance instance) {
    if (instance instanceof ImmutableImagingStudy_Instance) {
      return (ImmutableImagingStudy_Instance) instance;
    }
    return ((ImmutableImagingStudy_Instance.Builder) ImmutableImagingStudy_Instance.builder())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .extension(instance.extension())
        .uid(instance.uid())
        .number(instance.number())
        .title(instance.title())
        .sopClass(instance.sopClass())
        .build();
  }

  /**
   * Creates a builder for {@link ImagingStudy_Instance ImagingStudy_Instance}.
   * <pre>
   * ImmutableImagingStudy_Instance.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImagingStudy_Instance#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link ImagingStudy_Instance#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImagingStudy_Instance#extension() extension}
   *    .uid(com.medplum.types.fhir.Id) // optional {@link ImagingStudy_Instance#uid() uid}
   *    .number(com.medplum.types.fhir.UnsignedInt) // optional {@link ImagingStudy_Instance#number() number}
   *    .title(String) // optional {@link ImagingStudy_Instance#title() title}
   *    .sopClass(com.medplum.types.fhir.Coding) // required {@link ImagingStudy_Instance#sopClass() sopClass}
   *    .build();
   * </pre>
   * @return A new ImagingStudy_Instance builder
   */
  public static SopClassBuildStage builder() {
    return new ImmutableImagingStudy_Instance.Builder();
  }

  /**
   * Builds instances of type {@link ImagingStudy_Instance ImagingStudy_Instance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImagingStudy_Instance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SopClassBuildStage, BuildFinal {
    private static final long INIT_BIT_SOP_CLASS = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_UID = 0x8L;
    private static final long OPT_BIT_NUMBER = 0x10L;
    private static final long OPT_BIT_TITLE = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Id uid;
    private @Nullable UnsignedInt number;
    private @Nullable String title;
    private @Nullable Coding sopClass;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy_Instance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy_Instance#id() id} to id.
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
     * Initializes the optional value {@link ImagingStudy_Instance#id() id} to id.
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
     * Initializes the optional value {@link ImagingStudy_Instance#extension() extension} to extension.
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
     * Initializes the optional value {@link ImagingStudy_Instance#extension() extension} to extension.
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
     * Initializes the optional value {@link ImagingStudy_Instance#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for chained invocation
     */
    public final Builder uid(Id uid) {
      checkNotIsSet(uidIsSet(), "uid");
      this.uid = Objects.requireNonNull(uid, "uid");
      optBits |= OPT_BIT_UID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("uid")
    public final Builder uid(Optional<? extends Id> uid) {
      checkNotIsSet(uidIsSet(), "uid");
      this.uid = uid.orElse(null);
      optBits |= OPT_BIT_UID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for chained invocation
     */
    public final Builder number(UnsignedInt number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = Objects.requireNonNull(number, "number");
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("number")
    public final Builder number(Optional<? extends UnsignedInt> number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = number.orElse(null);
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the value for the {@link ImagingStudy_Instance#sopClass() sopClass} attribute.
     * @param sopClass The value for sopClass 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sopClass")
    public final Builder sopClass(Coding sopClass) {
      checkNotIsSet(sopClassIsSet(), "sopClass");
      this.sopClass = Objects.requireNonNull(sopClass, "sopClass");
      initBits &= ~INIT_BIT_SOP_CLASS;
      return this;
    }

    /**
     * Builds a new {@link ImagingStudy_Instance ImagingStudy_Instance}.
     * @return An immutable instance of ImagingStudy_Instance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImagingStudy_Instance build() {
      checkRequiredAttributes();
      return new ImmutableImagingStudy_Instance(modifierExtension, id, extension, uid, number, title, sopClass);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean uidIsSet() {
      return (optBits & OPT_BIT_UID) != 0;
    }

    private boolean numberIsSet() {
      return (optBits & OPT_BIT_NUMBER) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean sopClassIsSet() {
      return (initBits & INIT_BIT_SOP_CLASS) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImagingStudy_Instance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!sopClassIsSet()) attributes.add("sopClass");
      return "Cannot build ImagingStudy_Instance, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ImagingStudy_Instance", generator = "Immutables")
  public interface SopClassBuildStage {
    /**
     * Initializes the value for the {@link ImagingStudy_Instance#sopClass() sopClass} attribute.
     * @param sopClass The value for sopClass 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sopClass(Coding sopClass);
  }

  @Generated(from = "ImagingStudy_Instance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for chained invocation
     */
    BuildFinal uid(Id uid);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal uid(Optional<? extends Id> uid);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for chained invocation
     */
    BuildFinal number(UnsignedInt number);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal number(Optional<? extends UnsignedInt> number);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Builds a new {@link ImagingStudy_Instance ImagingStudy_Instance}.
     * @return An immutable instance of ImagingStudy_Instance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImagingStudy_Instance build();
  }
}

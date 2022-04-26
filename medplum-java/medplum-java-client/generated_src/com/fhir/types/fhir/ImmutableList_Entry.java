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
 * Immutable implementation of {@link List_Entry}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableList_Entry.builder()}.
 */
@Generated(from = "List_Entry", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableList_Entry implements List_Entry {
  private final @Nullable List<Extension> extension;
  private final @Nullable DateTime date;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean deleted;
  private final Reference item;
  private final @Nullable CodeableConcept flag;

  private ImmutableList_Entry(
      @Nullable List<Extension> extension,
      @Nullable DateTime date,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean deleted,
      Reference item,
      @Nullable CodeableConcept flag) {
    this.extension = extension;
    this.date = date;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.deleted = deleted;
    this.item = item;
    this.flag = flag;
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
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
   * @return The value of the {@code deleted} attribute
   */
  @JsonProperty("deleted")
  @Override
  public Optional<Boolean> deleted() {
    return Optional.ofNullable(deleted);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public Reference item() {
    return item;
  }

  /**
   * @return The value of the {@code flag} attribute
   */
  @JsonProperty("flag")
  @Override
  public Optional<CodeableConcept> flag() {
    return Optional.ofNullable(flag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableList_Entry(newValue, this.date, this.id, this.modifierExtension, this.deleted, this.item, this.flag);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List_Entry#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList_Entry withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableList_Entry(value, this.date, this.id, this.modifierExtension, this.deleted, this.item, this.flag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableList_Entry(this.extension, newValue, this.id, this.modifierExtension, this.deleted, this.item, this.flag);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List_Entry#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList_Entry withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableList_Entry(this.extension, value, this.id, this.modifierExtension, this.deleted, this.item, this.flag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableList_Entry(this.extension, this.date, newValue, this.modifierExtension, this.deleted, this.item, this.flag);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List_Entry#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableList_Entry(this.extension, this.date, value, this.modifierExtension, this.deleted, this.item, this.flag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableList_Entry(this.extension, this.date, this.id, newValue, this.deleted, this.item, this.flag);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List_Entry#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList_Entry withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableList_Entry(this.extension, this.date, this.id, value, this.deleted, this.item, this.flag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#deleted() deleted} attribute.
   * @param value The value for deleted
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withDeleted(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.deleted, newValue)) return this;
    return new ImmutableList_Entry(this.extension, this.date, this.id, this.modifierExtension, newValue, this.item, this.flag);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List_Entry#deleted() deleted} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deleted
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withDeleted(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.deleted, value)) return this;
    return new ImmutableList_Entry(this.extension, this.date, this.id, this.modifierExtension, value, this.item, this.flag);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link List_Entry#item() item} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for item
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableList_Entry withItem(Reference value) {
    if (this.item == value) return this;
    Reference newValue = Objects.requireNonNull(value, "item");
    return new ImmutableList_Entry(this.extension, this.date, this.id, this.modifierExtension, this.deleted, newValue, this.flag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#flag() flag} attribute.
   * @param value The value for flag
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withFlag(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "flag");
    if (this.flag == newValue) return this;
    return new ImmutableList_Entry(this.extension, this.date, this.id, this.modifierExtension, this.deleted, this.item, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List_Entry#flag() flag} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for flag
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList_Entry withFlag(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.flag == value) return this;
    return new ImmutableList_Entry(this.extension, this.date, this.id, this.modifierExtension, this.deleted, this.item, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableList_Entry} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableList_Entry
        && equalTo((ImmutableList_Entry) another);
  }

  private boolean equalTo(ImmutableList_Entry another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(date, another.date)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(deleted, another.deleted)
        && item.equals(another.item)
        && Objects.equals(flag, another.flag);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code date}, {@code id}, {@code modifierExtension}, {@code deleted}, {@code item}, {@code flag}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(deleted);
    h += (h << 5) + item.hashCode();
    h += (h << 5) + Objects.hashCode(flag);
    return h;
  }

  /**
   * Prints the immutable value {@code List_Entry} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("List_Entry{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (date != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (deleted != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("deleted=").append(deleted);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("item=").append(item);
    if (flag != null) {
      builder.append(", ");
      builder.append("flag=").append(flag);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "List_Entry", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements List_Entry {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> deleted = Optional.empty();
    boolean deletedIsSet;
    @Nullable Reference item;
    @Nullable Optional<CodeableConcept> flag = Optional.empty();
    boolean flagIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
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
    @JsonProperty("deleted")
    public void setDeleted(Optional<Boolean> deleted) {
      this.deleted = deleted;
      this.deletedIsSet = true;
    }
    @JsonProperty("item")
    public void setItem(Reference item) {
      this.item = item;
    }
    @JsonProperty("flag")
    public void setFlag(Optional<CodeableConcept> flag) {
      this.flag = flag;
      this.flagIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> deleted() { throw new UnsupportedOperationException(); }
    @Override
    public Reference item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> flag() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableList_Entry fromJson(Json json) {
    ImmutableList_Entry.Builder builder = ((ImmutableList_Entry.Builder) ImmutableList_Entry.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.deletedIsSet) {
      builder.deleted(json.deleted);
    }
    if (json.item != null) {
      builder.item(json.item);
    }
    if (json.flagIsSet) {
      builder.flag(json.flag);
    }
    return (ImmutableList_Entry) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link List_Entry} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable List_Entry instance
   */
  public static List_Entry copyOf(List_Entry instance) {
    if (instance instanceof ImmutableList_Entry) {
      return (ImmutableList_Entry) instance;
    }
    return ((ImmutableList_Entry.Builder) ImmutableList_Entry.builder())
        .extension(instance.extension())
        .date(instance.date())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .deleted(instance.deleted())
        .item(instance.item())
        .flag(instance.flag())
        .build();
  }

  /**
   * Creates a builder for {@link List_Entry List_Entry}.
   * <pre>
   * ImmutableList_Entry.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link List_Entry#extension() extension}
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link List_Entry#date() date}
   *    .id(String) // optional {@link List_Entry#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link List_Entry#modifierExtension() modifierExtension}
   *    .deleted(Boolean) // optional {@link List_Entry#deleted() deleted}
   *    .item(com.fhir.types.fhir.Reference) // required {@link List_Entry#item() item}
   *    .flag(com.fhir.types.fhir.CodeableConcept) // optional {@link List_Entry#flag() flag}
   *    .build();
   * </pre>
   * @return A new List_Entry builder
   */
  public static ItemBuildStage builder() {
    return new ImmutableList_Entry.Builder();
  }

  /**
   * Builds instances of type {@link List_Entry List_Entry}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "List_Entry", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ItemBuildStage, BuildFinal {
    private static final long INIT_BIT_ITEM = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_DATE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_DELETED = 0x10L;
    private static final long OPT_BIT_FLAG = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable DateTime date;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean deleted;
    private @Nullable Reference item;
    private @Nullable CodeableConcept flag;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link List_Entry#extension() extension} to extension.
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
     * Initializes the optional value {@link List_Entry#extension() extension} to extension.
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
     * Initializes the optional value {@link List_Entry#date() date} to date.
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
     * Initializes the optional value {@link List_Entry#date() date} to date.
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
     * Initializes the optional value {@link List_Entry#id() id} to id.
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
     * Initializes the optional value {@link List_Entry#id() id} to id.
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
     * Initializes the optional value {@link List_Entry#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link List_Entry#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link List_Entry#deleted() deleted} to deleted.
     * @param deleted The value for deleted
     * @return {@code this} builder for chained invocation
     */
    public final Builder deleted(boolean deleted) {
      checkNotIsSet(deletedIsSet(), "deleted");
      this.deleted = deleted;
      optBits |= OPT_BIT_DELETED;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#deleted() deleted} to deleted.
     * @param deleted The value for deleted
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("deleted")
    public final Builder deleted(Optional<Boolean> deleted) {
      checkNotIsSet(deletedIsSet(), "deleted");
      this.deleted = deleted.orElse(null);
      optBits |= OPT_BIT_DELETED;
      return this;
    }

    /**
     * Initializes the value for the {@link List_Entry#item() item} attribute.
     * @param item The value for item 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("item")
    public final Builder item(Reference item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = Objects.requireNonNull(item, "item");
      initBits &= ~INIT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#flag() flag} to flag.
     * @param flag The value for flag
     * @return {@code this} builder for chained invocation
     */
    public final Builder flag(CodeableConcept flag) {
      checkNotIsSet(flagIsSet(), "flag");
      this.flag = Objects.requireNonNull(flag, "flag");
      optBits |= OPT_BIT_FLAG;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#flag() flag} to flag.
     * @param flag The value for flag
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("flag")
    public final Builder flag(Optional<? extends CodeableConcept> flag) {
      checkNotIsSet(flagIsSet(), "flag");
      this.flag = flag.orElse(null);
      optBits |= OPT_BIT_FLAG;
      return this;
    }

    /**
     * Builds a new {@link List_Entry List_Entry}.
     * @return An immutable instance of List_Entry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public List_Entry build() {
      checkRequiredAttributes();
      return new ImmutableList_Entry(extension, date, id, modifierExtension, deleted, item, flag);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean deletedIsSet() {
      return (optBits & OPT_BIT_DELETED) != 0;
    }

    private boolean flagIsSet() {
      return (optBits & OPT_BIT_FLAG) != 0;
    }

    private boolean itemIsSet() {
      return (initBits & INIT_BIT_ITEM) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of List_Entry is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!itemIsSet()) attributes.add("item");
      return "Cannot build List_Entry, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "List_Entry", generator = "Immutables")
  public interface ItemBuildStage {
    /**
     * Initializes the value for the {@link List_Entry#item() item} attribute.
     * @param item The value for item 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(Reference item);
  }

  @Generated(from = "List_Entry", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link List_Entry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link List_Entry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link List_Entry#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link List_Entry#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link List_Entry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link List_Entry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link List_Entry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link List_Entry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link List_Entry#deleted() deleted} to deleted.
     * @param deleted The value for deleted
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deleted(boolean deleted);

    /**
     * Initializes the optional value {@link List_Entry#deleted() deleted} to deleted.
     * @param deleted The value for deleted
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deleted(Optional<Boolean> deleted);

    /**
     * Initializes the optional value {@link List_Entry#flag() flag} to flag.
     * @param flag The value for flag
     * @return {@code this} builder for chained invocation
     */
    BuildFinal flag(CodeableConcept flag);

    /**
     * Initializes the optional value {@link List_Entry#flag() flag} to flag.
     * @param flag The value for flag
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal flag(Optional<? extends CodeableConcept> flag);

    /**
     * Builds a new {@link List_Entry List_Entry}.
     * @return An immutable instance of List_Entry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    List_Entry build();
  }
}

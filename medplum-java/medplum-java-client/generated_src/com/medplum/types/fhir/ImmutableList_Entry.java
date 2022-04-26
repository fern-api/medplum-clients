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
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable DateTime date;
  private final @Nullable CodeableConcept flag;
  private final @Nullable String id;
  private final Reference item;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean deleted;

  private ImmutableList_Entry(
      @Nullable List<Extension> modifierExtension,
      @Nullable DateTime date,
      @Nullable CodeableConcept flag,
      @Nullable String id,
      Reference item,
      @Nullable List<Extension> extension,
      @Nullable Boolean deleted) {
    this.modifierExtension = modifierExtension;
    this.date = date;
    this.flag = flag;
    this.id = id;
    this.item = item;
    this.extension = extension;
    this.deleted = deleted;
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableList_Entry(newValue, this.date, this.flag, this.id, this.item, this.extension, this.deleted);
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
    return new ImmutableList_Entry(value, this.date, this.flag, this.id, this.item, this.extension, this.deleted);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableList_Entry(this.modifierExtension, newValue, this.flag, this.id, this.item, this.extension, this.deleted);
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
    return new ImmutableList_Entry(this.modifierExtension, value, this.flag, this.id, this.item, this.extension, this.deleted);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#flag() flag} attribute.
   * @param value The value for flag
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withFlag(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "flag");
    if (this.flag == newValue) return this;
    return new ImmutableList_Entry(this.modifierExtension, this.date, newValue, this.id, this.item, this.extension, this.deleted);
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
    return new ImmutableList_Entry(this.modifierExtension, this.date, value, this.id, this.item, this.extension, this.deleted);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableList_Entry(this.modifierExtension, this.date, this.flag, newValue, this.item, this.extension, this.deleted);
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
    return new ImmutableList_Entry(this.modifierExtension, this.date, this.flag, value, this.item, this.extension, this.deleted);
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
    return new ImmutableList_Entry(this.modifierExtension, this.date, this.flag, this.id, newValue, this.extension, this.deleted);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableList_Entry(this.modifierExtension, this.date, this.flag, this.id, this.item, newValue, this.deleted);
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
    return new ImmutableList_Entry(this.modifierExtension, this.date, this.flag, this.id, this.item, value, this.deleted);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#deleted() deleted} attribute.
   * @param value The value for deleted
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withDeleted(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.deleted, newValue)) return this;
    return new ImmutableList_Entry(this.modifierExtension, this.date, this.flag, this.id, this.item, this.extension, newValue);
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
    return new ImmutableList_Entry(this.modifierExtension, this.date, this.flag, this.id, this.item, this.extension, value);
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
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(date, another.date)
        && Objects.equals(flag, another.flag)
        && Objects.equals(id, another.id)
        && item.equals(another.item)
        && Objects.equals(extension, another.extension)
        && Objects.equals(deleted, another.deleted);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code date}, {@code flag}, {@code id}, {@code item}, {@code extension}, {@code deleted}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(flag);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + item.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(deleted);
    return h;
  }

  /**
   * Prints the immutable value {@code List_Entry} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("List_Entry{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (date != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (flag != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("flag=").append(flag);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("item=").append(item);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (deleted != null) {
      builder.append(", ");
      builder.append("deleted=").append(deleted);
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
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<CodeableConcept> flag = Optional.empty();
    boolean flagIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Reference item;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> deleted = Optional.empty();
    boolean deletedIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("flag")
    public void setFlag(Optional<CodeableConcept> flag) {
      this.flag = flag;
      this.flagIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("item")
    public void setItem(Reference item) {
      this.item = item;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("deleted")
    public void setDeleted(Optional<Boolean> deleted) {
      this.deleted = deleted;
      this.deletedIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> flag() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Reference item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> deleted() { throw new UnsupportedOperationException(); }
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
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.flagIsSet) {
      builder.flag(json.flag);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.item != null) {
      builder.item(json.item);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.deletedIsSet) {
      builder.deleted(json.deleted);
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
        .modifierExtension(instance.modifierExtension())
        .date(instance.date())
        .flag(instance.flag())
        .id(instance.id())
        .item(instance.item())
        .extension(instance.extension())
        .deleted(instance.deleted())
        .build();
  }

  /**
   * Creates a builder for {@link List_Entry List_Entry}.
   * <pre>
   * ImmutableList_Entry.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link List_Entry#modifierExtension() modifierExtension}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link List_Entry#date() date}
   *    .flag(com.medplum.types.fhir.CodeableConcept) // optional {@link List_Entry#flag() flag}
   *    .id(String) // optional {@link List_Entry#id() id}
   *    .item(com.medplum.types.fhir.Reference) // required {@link List_Entry#item() item}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link List_Entry#extension() extension}
   *    .deleted(Boolean) // optional {@link List_Entry#deleted() deleted}
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
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_DATE = 0x2L;
    private static final long OPT_BIT_FLAG = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_DELETED = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable DateTime date;
    private @Nullable CodeableConcept flag;
    private @Nullable String id;
    private @Nullable Reference item;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean deleted;

    private Builder() {
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
     * Builds a new {@link List_Entry List_Entry}.
     * @return An immutable instance of List_Entry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public List_Entry build() {
      checkRequiredAttributes();
      return new ImmutableList_Entry(modifierExtension, date, flag, id, item, extension, deleted);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean flagIsSet() {
      return (optBits & OPT_BIT_FLAG) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean deletedIsSet() {
      return (optBits & OPT_BIT_DELETED) != 0;
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
     * Builds a new {@link List_Entry List_Entry}.
     * @return An immutable instance of List_Entry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    List_Entry build();
  }
}
